import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex7 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int x = teclado.nextInt();
    int y = teclado.nextInt();
    int soma = 0;

    if(y > x){
        for(int i = x + 1; i < y; i++){
            if(i % 2 != 0){
                soma += i;
            }   
        } 
    } else {
        for(int i = y + 1; i < x; i++){
            if(i % 2 != 0){
                soma += i;
            }   
        } 
    }

    System.out.println(soma);
        
    teclado.close();
    }

}