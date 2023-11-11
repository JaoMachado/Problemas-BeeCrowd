import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] array = new double[12][12];
        double soma = 0;

        int linha = teclado.nextInt();
        char c = teclado.next().charAt(0);

        // preenchendo o array
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = teclado.nextDouble();
            }
        }

        // fazendo a soma
        for(int i = 0; i < array.length; i++){
            soma += array[linha][i];
            }

        if(c == 'S'){
            System.out.println(soma);
        } else {
            System.out.println(soma/12);
        }
        
    }
}
