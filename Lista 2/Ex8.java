import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int dentro  = 0;
        int fora = 0;

        for(int i = 0; i < n; i++){
            int x = teclado.nextInt();
            if(x >= 10 && x <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}