import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex29 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    
    System.out.println(a % b == 0 ? "Sao Multiplos" : "Nao sao Multiplos");
    teclado.close();
    }

}