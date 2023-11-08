import java.io.IOException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        int difProduto = a * b - c * d;
        
        System.out.println("DIFERENCA = " + difProduto);
        teclado.close();
    }

}