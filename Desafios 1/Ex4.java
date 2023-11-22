import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();

        int[] listaHorror = new int[N];
        Arrays.fill(listaHorror, Integer.MAX_VALUE);

        for (int i = 0; i < H; i++) {
            int x = sc.nextInt();
            listaHorror[x] = 0;
        }

        ArrayList<Integer>[] filmesSimilares = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            filmesSimilares[i] = new ArrayList<>();
        }

        for (int i = 0; i < L; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            filmesSimilares[a].add(b);
            filmesSimilares[b].add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (listaHorror[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int movie = queue.poll();
            for (int similarMovie : filmesSimilares[movie]) {
                if (listaHorror[similarMovie] == Integer.MAX_VALUE) {
                    listaHorror[similarMovie] = listaHorror[movie] + 1;
                    queue.add(similarMovie);
                }
            }
        }

        int maxlistaHorror = 0;
        int bestMovie = 0;
        for (int i = 0; i < N; i++) {
            if (listaHorror[i] > maxlistaHorror) {
                maxlistaHorror = listaHorror[i];
                bestMovie = i;
            }
        }

        System.out.println(bestMovie);

        sc.close();
    }
}
