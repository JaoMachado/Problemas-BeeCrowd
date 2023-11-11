import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // fazendo while para os vários casos de teste
        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            int result = encontrarMaiorSubstringComum(str1, str2);
            System.out.println(result);
        }
    }

    public static int encontrarMaiorSubstringComum(String str1, String str2) {
        // armazenando o tamanho das strings
        int tamStr1 = str1.length();
        int tamStr2 = str2.length();

        // array para guardar o tamanho das substrings
        int[][] dp = new int[tamStr1 + 1][tamStr2 + 1];

        // variavel que armazena a maior substring
        int maxLen = 0;
        
        for (int i = 1; i <= tamStr1; i++) {
            for (int j = 1; j <= tamStr2; j++) {
                // if para ver se as letras são iguais(se forem, o i permanecerá igual e o j irá 
                // acrescentando e testando se continua igual)
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // armazenando o tamanho da substring, pegando o tamanho anterior e somando 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    // definindo o maior valor de dp(o maior tamanho de substring armazenado)
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else {
                    // se nenhum for igual, o tamanho é 0
                    dp[i][j] = 0;
                }
            }
        }

        return maxLen;
    }
}