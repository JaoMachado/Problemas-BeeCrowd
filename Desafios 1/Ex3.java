import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while(t.hasNext()){
            int h = t.nextInt();
            int m = t.nextInt();

            int hora = h / 30;
            int minuto = m / 6;

            System.out.printf("%02d:%02d\n", hora, minuto);

        }
        t.close();
    }
}
