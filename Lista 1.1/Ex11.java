import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex11 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double raio = teclado.nextDouble();
        
        double volume = (4.0/3) * 3.14159 * (raio * raio * raio);
        
        System.out.printf("VOLUME = %.03f\n", volume);
        teclado.close();
    }
}
