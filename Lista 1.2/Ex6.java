import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex6 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int x = teclado.nextInt();

    for(int i = 1; i <= x; i++){
        if(i % 2 != 0){
            System.out.println(i);
        }
    }
        
    teclado.close();
    }

}