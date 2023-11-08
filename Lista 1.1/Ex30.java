import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex30 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double salario = teclado.nextDouble();

    if(0 <= salario && salario <= 400){
        System.out.printf("Novo salario: %.02f\nReajuste ganho: %.02f\nEm percentual: 15 %%\n", (salario + (salario * 0.15)), (salario * 0.15));
    } else if(400 < salario && salario <= 800){
        System.out.printf("Novo salario: %.02f\nReajuste ganho: %.02f\nEm percentual: 12 %%\n", (salario + (salario * 0.12)), (salario * 0.12));
    } else if(800 < salario && salario <= 1200){
        System.out.printf("Novo salario: %.02f\nReajuste ganho: %.02f\nEm percentual: 10 %%\n", (salario + (salario * 0.10)), (salario * 0.10));
    } else if(1200 < salario && salario <= 2000){
        System.out.printf("Novo salario: %.02f\nReajuste ganho: %.02f\nEm percentual: 7 %%\n", (salario + (salario * 0.07)), (salario * 0.07));
    } else {
        System.out.printf("Novo salario: %.02f\nReajuste ganho: %.02f\nEm percentual: 4 %%\n", (salario + (salario * 0.04)), (salario * 0.04));
    }
    
    teclado.close();
    }

}
