import java.io.IOException;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int num = teclado.nextInt();
        int horas = teclado.nextInt();
        double valor = teclado.nextDouble();
        
        double salario = horas * valor;
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.02f\n", salario);
        
    }
 
}