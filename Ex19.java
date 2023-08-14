import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex19 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int seg = teclado.nextInt();
        int horas = seg / 3600;
        int minutos = (seg % 3600) / 60;
        int segundos = (seg % 3600) % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        teclado.close();
    }
 
}
