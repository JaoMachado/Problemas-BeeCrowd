import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex22 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();
    int d = teclado.nextInt();
    
    if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2 == 0)){
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores nao aceitos");
    }

    teclado.close();
    }

}
