import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex25 {

    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double n1 = teclado.nextDouble();
    double n2 = teclado.nextDouble();
    double n3 = teclado.nextDouble();
    double n4 = teclado.nextDouble();

    double media = (n1 * 0.2 + n2 * 0.3 + n3 * 0.4 + n4 * 0.1);

    System.out.printf("Media: %.01f\n", media);

    if(media >= 7){
        System.out.println("Aluno aprovado.");
    } else if(media < 5){
        System.out.println("Aluno reprovado.");
    } else {
        System.out.println("Aluno em exame.");
        double notaExame = teclado.nextDouble();
        System.out.printf("Nota do exame: %.01f\n", notaExame);
        media = (media + notaExame)/2;
        if(media >= 5){
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
        System.out.printf("Media final: %.01f\n", media);
    }
    teclado.close();
    }

}

