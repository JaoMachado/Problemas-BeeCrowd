import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex16 {
 
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int dist = teclado.nextInt();
    int tempo = (60 * dist)/30;
    
    System.out.println(tempo + " minutos");
    teclado.close();
    }
 
}