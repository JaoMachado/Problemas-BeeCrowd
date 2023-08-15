import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex27 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();
    int maior = num1;
    int medio = num2;
    int menor = num3;
    int temp = 0;

    if(medio > maior){
        temp = maior;
        maior = medio;
        medio = temp;
    } 
    if(menor > medio){
        temp = medio;
        medio = menor;
        menor = temp;
    }
    if(medio > maior){
        temp = maior;
        maior = medio;
        medio = temp;
    } 

    System.out.println(menor);
    System.out.println(medio);
    System.out.println(maior);
    System.out.println(" ");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    teclado.close();
    }

}