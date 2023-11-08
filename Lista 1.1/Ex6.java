import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        
        double media = ((a*0.2) + (b*0.3) + (c*0.5));
        
        System.out.printf("MEDIA = %.01f\n", media);
        teclado.close();
    }

}