import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex4 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int pares = 0;

    for(int i = 0; i < 5; i++){
        int valor = teclado.nextInt();
        if(valor % 2 == 0){
            pares++;
        }
    }

    System.out.println(pares + " valores pares");
    teclado.close();
    }

}