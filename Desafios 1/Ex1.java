import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int hi = t.nextInt();
        int mi = t.nextInt();
        int hf = t.nextInt();
        int mf = t.nextInt();

        int horaJogo = hf - hi;

        if (horaJogo < 0) {
            horaJogo += 24;
        }

        int minJogo = mf - mi;

        if(minJogo < 0) {
            minJogo += 60;
            horaJogo--;
        }

        if (horaJogo < 0) {
            horaJogo += 24;
        }

        if(hi == hf && mi == mf){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + horaJogo +" HORA(S) E " + minJogo + " MINUTO(S)");
        }

        t.close();
    }
}
