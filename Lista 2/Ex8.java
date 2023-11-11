import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < N; i++) {
            String str1 = teclado.next();
            String str2 = teclado.next();

            String strComb = combinarStrings(str1, str2);
            System.out.println(strComb);
        }

        teclado.close();
    }

    public static String combinarStrings(String str1, String str2) {
        StringBuilder strComb = new StringBuilder();
        int tamanhoMaximo = Math.max(str1.length(), str2.length());

        for (int i = 0; i < tamanhoMaximo; i++) {
            if (i < str1.length()) {
                strComb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                strComb.append(str2.charAt(i));
            }
        }

        return strComb.toString();
    }
}
