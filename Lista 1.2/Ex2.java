import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex2 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int positivos = 0;

    for(int i = 0; i < 6; i++){
        double valor = teclado.nextDouble();
        if(valor > 0){
            positivos++;
        }
    }
    System.out.println(positivos + " valores positivos");
    teclado.close();
    }

}