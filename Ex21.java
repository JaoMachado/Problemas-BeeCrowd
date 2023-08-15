import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex21 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        float valor = teclado.nextFloat();
        float nota100 = valor / 100;
        float nota50 = (valor % 100) / 50;
        float nota20 = ((valor % 100) % 50) / 20;
        float nota10 = (((valor % 100) % 50) % 20) / 10;
        float nota5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        float nota2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        float moeda1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
        float moeda50 = moeda1 * 5 / 10;
        float moeda25 = (moeda1 * 5 % 10) * 25 / 100;
        float moeda10 = ((moeda1 % 0.5) % 0.25) / 0.10;
        float moeda5 = (((moeda1 % 0.5) % 0.25) % 0.10) / 0.05;
        float moeda01 = (((moeda1 % 0.5) % 0.25) % 0.10) % 0.05;
        
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.5");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
        teclado.close();
    }

}