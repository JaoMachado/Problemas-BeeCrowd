import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex18 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double valor = teclado.nextDouble();
        double nota100 = valor / 100;
        double nota50 = (valor % 100) / 50;
        double nota20 = ((valor % 100) % 50) / 20;
        double nota10 = (((valor % 100) % 50) % 20) / 10;
        double nota5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        double nota2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        double moeda1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
        double moeda50 = moeda1 / 0.5;
        double moeda25 = (moeda1 % 0.5) / 0.25;
        double moeda10 = ((moeda1 % 0.5) % 0.25) / 0.10;
        double moeda5 = (((moeda1 % 0.5) % 0.25) % 0.10) / 0.05;
        double moeda01 = (((moeda1 % 0.5) % 0.25) % 0.10) % 0.05;
        
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota( s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota( s) de R$ 1,00");
        teclado.close();
    }
 
}