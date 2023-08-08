import java.io.IOException;
import java.util.Scanner;

public class ex5 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double notaA = teclado.nextDouble();
        double notaB = teclado.nextDouble();
        
        double media = ((notaA*0.35) + (notaB*0.75)) / 1.1;
        
        System.out.printf("MEDIA = %.05f\n", media);
        
    }
 
}