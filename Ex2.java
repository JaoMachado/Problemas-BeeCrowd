import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double n = 3.14159;
        double a = 0;
                
        double r = teclado.nextDouble();
        
        a = n * (r * r);
        
        System.out.printf("A=%.04f\n", a);
                
        teclado.close();
    }   
}    