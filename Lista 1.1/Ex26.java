import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex26 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double x = teclado.nextDouble();
    double y = teclado.nextDouble();

    if(x == y && y == 0){
        System.out.println("Origem");
    } else if(x > 0 && y > 0){
        System.out.println("Q1");
    } else if(x < 0 && y > 0){
        System.out.println("Q2");
    } else if(x < 0 && y < 0){
        System.out.println("Q3");
    } else if(x > 0 && y < 0){
        System.out.println("Q4");
    } else if(x == 0 && y != 0){
        System.out.println("Eixo Y");
    } else if(x != 0 && y == 0){
        System.out.println("Eixo X");
    }
    teclado.close();
    }

}