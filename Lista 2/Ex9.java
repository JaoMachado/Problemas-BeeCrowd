import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean result;

        int n = teclado.nextInt();
        teclado.nextLine();

        for(int i = 0; i < n; i++){
            String num1 = teclado.next();
            String num2 = teclado.next();

            result = encaixaOuN(num1, num2);

            if(result){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        teclado.close();
    }

    public static boolean encaixaOuN(String num1, String num2){
        int tamNum1 = num1.length();
        int tamNum2 = num2.length();

        // se o tamanho do 1 numero é menor o do segundo, já não encaixa
        if(tamNum1 < tamNum2){
            return false;
        }

        for(int i = 0; i < tamNum2; i++){
            // se o tamanho do num1 menos o do num2 somado com i(para ir avançando os números)
            // for diferente do números de num2, retorna negativo
            if(num1.charAt((tamNum1 - tamNum2) + i) != num2.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
