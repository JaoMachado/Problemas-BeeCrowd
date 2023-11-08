import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex17 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int tempo = teclado.nextInt();
    double velocidade = teclado.nextDouble();
    double litros = tempo * velocidade / 12;
    
    System.out.printf("%.03f\n", litros);
    teclado.close();
    }

}
