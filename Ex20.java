import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex20 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int idade = teclado.nextInt();
        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = (idade % 365) % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mês(es)");
        System.out.println(dias + " dia(s)");
        
        teclado.close();
    }

}