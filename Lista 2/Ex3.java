import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int caso = 1;

        // while que vai parar apenas no break
        while(true){
            int n = teclado.nextInt();

            // array dos números das bolas de gude
            int[] bolGudes = new int[n+1];

            // recebendo os números e add no array
            for(int i = 0; i < n+1; i++){
                bolGudes[i] = teclado.nextInt();
            }

            // se n e q forem iguais a 0, break
            if(n == 0 && bolGudes[0] == 0){
                break;
            }

            System.out.println("CASE# " + caso + ":");

            // realizando a consulta
            for(int i = 0; i < bolGudes[0]; i++){
                int consulta = teclado.nextInt();
                int posicao = consultarBolGude(bolGudes, consulta);

                if(posicao != -1){
                    System.out.println(consulta + " found at " + (1 + posicao));
                } else {
                    System.out.println(consulta + " not found");
                }
            }
            caso++;
        }
        teclado.close();
    }

    public static int consultarBolGude(int[] gudes, int consulta){
        for(int i = 0; i < gudes.length; i++){
            if(gudes[i] == consulta){
                return i;
            }
        }
        return -1;
    }
}