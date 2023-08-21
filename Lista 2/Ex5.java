import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex5 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int pares = 0;
    int impares = 0;
    int positivos = 0;
    int negativos = 0;

    for(int i = 0; i < 5; i++){
        int valor = teclado.nextInt();
        if(valor % 2 == 0){
            pares++;
        } else {
            impares++;
        }
        if(valor > 0){
            positivos++;
        } else if(valor < 0) {
            negativos++;
        }
    }

    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");

    teclado.close();
    }

}