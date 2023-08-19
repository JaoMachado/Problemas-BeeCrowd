import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex10 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int cod1 = teclado.nextInt();
        int un1 = teclado.nextInt();
        double preco1 = teclado.nextDouble();
        
        int cod2 = teclado.nextInt();
        int un2 = teclado.nextInt();
        double preco2 = teclado.nextDouble();
        
        double precoTotal = (un1 * preco1) + (un2 * preco2);
        
        System.out.printf("VALOR A PAGAR: R$ %.02f\n", precoTotal);
        teclado.close();
    }
 
}
