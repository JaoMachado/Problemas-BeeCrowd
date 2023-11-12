import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < n; i++) {
            String expressao = teclado.nextLine();
            String resultado = calcularExpressao(expressao);
            System.out.println(resultado);
        }

        teclado.close();
    }

    public static String calcularExpressao(String expressao) {
        String[] numeros = expressao.split(" ");

        int n1 = Integer.parseInt(numeros[0]);
        int d1 = Integer.parseInt(numeros[2]);
        int n2 = Integer.parseInt(numeros[4]);
        int d2 = Integer.parseInt(numeros[6]);
        char operador = numeros[3].charAt(0);

        int numeradorResultado = 0;
        int denominadorResultado = 0;
        int numeradorResultadoSimp = 0;
        int denominadorResultadoSimp = 0;

        switch (operador) {
            case '+':
                numeradorResultado = n1 * d2 + n2 * d1;
                denominadorResultado = d1 * d2;
                break;
            case '-':
                numeradorResultado = n1 * d2 - n2 * d1;
                denominadorResultado = d1 * d2;
                break;
            case '*':
                numeradorResultado = n1 * n2;
                denominadorResultado = d1 * d2;
                break;
            case '/':
                numeradorResultado = n1 * d2;
                denominadorResultado = n2 * d1;
                break;
        }

        // Simplificar o resultado
        int gcd = gcd(Math.abs(numeradorResultado), Math.abs(denominadorResultado));
        numeradorResultadoSimp = numeradorResultado / gcd;
        denominadorResultadoSimp = denominadorResultado / gcd;

        return numeradorResultado + "/" + denominadorResultado + " = " + numeradorResultadoSimp + "/" + denominadorResultadoSimp;
    }

    // Algoritmo de Euclides para encontrar o MDC (máximo divisor comum)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}