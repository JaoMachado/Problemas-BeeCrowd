import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex18 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int valor = teclado.nextInt();
    int nota100 = valor / 100;
    int nota50 = (valor % 100) / 50;
    int nota20 = ((valor % 100) % 50) / 20;
    int nota10 = (((valor % 100) % 50) % 20) / 10;
    int nota5 = ((((valor % 100) % 50) % 20) % 10) / 5;
    int nota2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
    int nota1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
    
    System.out.println(valor);
    System.out.println(nota100 + " nota(s) de R$ 100,00");
    System.out.println(nota50 + " nota(s) de R$ 50,00");
    System.out.println(nota20 + " nota(s) de R$ 20,00");
    System.out.println(nota10 + " nota(s) de R$ 10,00");
    System.out.println(nota5 + " nota(s) de R$ 5,00");
    System.out.println(nota2 + " nota(s) de R$ 2,00");
    System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
 
}