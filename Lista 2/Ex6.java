import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextLine()){
            String entrada = teclado.nextLine();
            System.out.println(tornarDancante(entrada));
        }
        
        teclado.close();
    }

    public static String tornarDancante(String entrada){
        char[] charArray = entrada.toCharArray();
        boolean isUpperCase = true;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (Character.isLetter(c)) {
                if (isUpperCase) {
                    charArray[i] = Character.toUpperCase(c);
                } else {
                    charArray[i] = Character.toLowerCase(c);
                }
                isUpperCase = !isUpperCase;
            }

        }

        return new String(charArray);
    }
}
