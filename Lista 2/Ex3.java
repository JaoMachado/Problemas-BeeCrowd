import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex3 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int positivos = 0;
    double valoresPositivos = 0;
    

    for(int i = 0; i < 6; i++){
        double valor = teclado.nextDouble();
        if(valor > 0){
            positivos++;
            valoresPositivos += valor;
        }
    }
    double media = valoresPositivos / positivos;
    System.out.println(positivos + " valores positivos");
    System.out.printf("%.01f\n", media);
    teclado.close();
    }

}