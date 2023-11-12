import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casoTeste = 1;

        while (true) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();

            if (N == 0 && Q == 0) {
                break; // Fim da entrada
            }

            int[] bolinhas = new int[N];
            for (int i = 0; i < N; i++) {
                bolinhas[i] = scanner.nextInt();
            }

            Arrays.sort(bolinhas); // Ordenar as bolinhas

            System.out.println("CASO# " + casoTeste + ":");

            for (int i = 0; i < Q; i++) {
                int consulta = scanner.nextInt();
                int posicao = encontrarPosicao(bolinhas, consulta);
                if (posicao != -1) {
                    System.out.println(consulta + " encontrado em " + (posicao + 1));
                } else {
                    System.out.println(consulta + " não encontrado");
                }
            }

            casoTeste++;
        }

        scanner.close();
    }

    private static int encontrarPosicao(int[] bolinhas, int consulta) {
        for (int i = 0; i < bolinhas.length; i++) {
            if (bolinhas[i] == consulta) {
                return i;
            }
        }
        return -1;
    }
}