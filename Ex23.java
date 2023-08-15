import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex23 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();

    double delta = Math.pow(b, 2) - 4 * a * c;

    if(delta < 0 || a == 0){
        System.out.println("Impossivel calcular");
    } else {
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("R1 = %.05f\n", r1);
        System.out.printf("R2 = %.05f\n", r2);
    }

    teclado.close();
    }

}