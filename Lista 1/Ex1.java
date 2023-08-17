import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int x;
                
        int a = teclado.nextInt();
                
        int b = teclado.nextInt();
                
        x = a + b;
                
        System.out.println("X = " + x);
                
        teclado.close();
    }
}    