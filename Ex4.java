import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        
        int prod = n1 * n2;
        
        System.out.println("PROD = " + prod);
    }
 
}