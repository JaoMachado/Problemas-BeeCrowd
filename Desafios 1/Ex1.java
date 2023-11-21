import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int hi = t.nextInt();
        int mi = t.nextInt();
        int hf = t.nextInt();
        int mf = t.nextInt();

        int hInicialMin = (hi * 60) + mi;
        int hFinalMin = (hf * 60) + mf;

        int tempMin = hFinalMin - hInicialMin;
        int tempHJogo = tempMin / 60; 

        int tempMinJogo = tempMin % 60;

        if(tempHJogo == 0 && tempMinJogo == 0){
            tempHJogo = 24;
        }

        System.out.println("O JOGO DUROU " + tempHJogo + " HORA(S) E " + tempMinJogo + " MINUTO(S)");
    }
}
