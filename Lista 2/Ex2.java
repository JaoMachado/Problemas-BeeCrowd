import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < n; i++){
            String entrada = teclado.nextLine();
            entrada = criptografar(entrada);
            System.out.println(entrada);
        }
        teclado.close();
    }

    public static String criptografar(String entrada){
        char[] c = entrada.toCharArray();
        // Altera o caractere para 3 posições a frente
        for(int i = 0; i < c.length; i++){
            if (Character.isLetter(c[i])) {
                c[i] = (char) (c[i] + 3);
            }
        }

        // Inverter a mensagem
        for(int i = 0, j = c.length - 1; i < j; i++, j--){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

        // Deslocando 1 posição da metade pra frente
        for(int i = c.length/2; i < c.length; i++){
                c[i] = (char) (c[i] - 1);
        }

        return new String(c);
    }
}