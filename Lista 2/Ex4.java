import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[20];
        
        // preenchendo o array
        for(int i = 0; i < 20; i++){
            array[i] = teclado.nextInt();
        }

        // invertendo
        for(int i = 0, j = 19; i < j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for(int i = 0; i < 20; i++){
            System.out.println("N[" + i + "] = " + array[i]);
        }
    }
}