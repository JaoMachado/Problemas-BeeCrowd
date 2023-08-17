import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex28 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();

    if(a < (c+b) && b < (a+c) && c < (a + b)){
        System.out.printf("Perimetro = %.01f\n", (a+b+c));
    } else {
        double area = (a+b) * c / 2;
        System.out.printf("Area = %.01f\n", area);
    }
    teclado.close();
    }

}