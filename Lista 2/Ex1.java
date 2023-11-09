import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;

        int n = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < n; i++){
            entrada = teclado.nextLine();
            // Transformando String em char
            char[] c = entrada.toCharArray();
            // chamando o método operar
            operar(c);
        }
        teclado.close();
    }

    public static void operar(char[] c){
        // pegando e transformando os numeros e operador
        int n1 = Character.getNumericValue(c[0]);
        int d1 = Character.getNumericValue(c[4]);
        char operador = c[6];
        int n2 = Character.getNumericValue(c[8]);
        int d2 = Character.getNumericValue(c[12]);

        int rN = 1;
        int rD = 1;

        // verificando o operador e realizando a conta
        switch (operador) {
            case '+':
                rN = (n1*d2 + n2*d1);
                rD = (d1*d2);
                break;
            case '-':
                rN = (n1*d2 - n2*d1);
                rD = (d1*d2);
                break;
            case '*':
                rN = (n1*n2);
                rD = (d1*d2);
                break;
            case '/':
                rN = (n1*d2);
                rD = (d1*n2);
                break;
        }
        System.out.print(rN + "/" + rD + " = ");
        simplificar(rN, rD);

    }

    public static void simplificar(int rN, int rD) {
        int rNabs = Math.abs(rN);
        int rDabs = Math.abs(rD);

        while (rDabs != 0) {
            int temp = rDabs;
            rDabs = rNabs % rDabs;
            rNabs = temp;
        }
        
        rN /= rNabs;
        rD /= rNabs;

        System.out.println(rN + "/" + rD);
    }
}