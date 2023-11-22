import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for(int i = 0; i < n; i++){
            int pa = t.nextInt();
            int pb = t.nextInt();

            double paP = t.nextDouble() / 100;
            double pbP = t.nextDouble() / 100;

            int numAnos = 0;

            while(pa <= pb){
                pa += pa * paP;
                pb += pb * pbP;
                numAnos++;

                if(numAnos > 100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if(numAnos <= 100){
                System.out.println(numAnos + " anos.");
            }
                
        }
        t.close();
    }
}