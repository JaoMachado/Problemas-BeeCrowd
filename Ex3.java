import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        
        int prod = n1 * n2;
        
        System.out.println("PROD = " + prod);
    }
}
