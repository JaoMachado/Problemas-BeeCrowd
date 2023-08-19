import java.io.IOException;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        teclado.close();

        calcularNotasEMoedas(valor);
    }

    public static void calcularNotasEMoedas(float valor) {
        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        int valorEmCentavos = Math.round(valor * 100); // Converte para centavos para trabalhar com inteiros

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = valorEmCentavos / (nota * 100);
            valorEmCentavos %= nota * 100;
            System.out.printf("%d nota(s) de R$ %d.00%n", quantidade, nota);
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = valorEmCentavos / moeda;
            valorEmCentavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, (float) moeda / 100);
        }
    }
}