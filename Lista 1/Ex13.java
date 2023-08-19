import java.io.IOException;
import java.util.Scanner;
 
public class Ex13 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int v1 = teclado.nextInt();
        int v2 = teclado.nextInt();
        int v3 = teclado.nextInt();
        
        int maior = v1;
        
        if(v2 > maior){
            maior = v2;
        }
        if(v3 > maior){
            maior = v3;
        }
        
        
        System.out.println(maior + " eh o maior");
        teclado.close();
    }
 
}