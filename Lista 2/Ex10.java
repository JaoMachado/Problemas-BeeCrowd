import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();

        for(int i = 0; i < n; i++){
            String entrada = teclado.nextLine().toLowerCase();
            Set<Character> letrasMaisFrequentes = encontrarLetrasMaisFrequentes(entrada);

            for (char letra : letrasMaisFrequentes) {
                System.out.print(letra);
            }
            System.out.println();
        }
        teclado.close();
    }

    public static Set<Character> encontrarLetrasMaisFrequentes(String entrada){
            Map<Character, Integer> frequenciaLetras = new HashMap<>();

            // Contar a frequência de cada letra
            for (char caractere : entrada.toCharArray()) {
                if (Character.isLetter(caractere)) {
                    frequenciaLetras.put(caractere, frequenciaLetras.getOrDefault(caractere, 0) + 1);
                }
            }

            // Encontrar a maior frequência
            int maxFrequencia = 0;
            for (int frequencia : frequenciaLetras.values()) {
                maxFrequencia = Math.max(maxFrequencia, frequencia);
            }

            // Adicionar as letras com a maior frequência ao conjunto
            Set<Character> letrasMaisFrequentes = new TreeSet<>();
            for (Map.Entry < Character, Integer > entry : frequenciaLetras.entrySet()) {
                if (entry.getValue() == maxFrequencia) {
                    letrasMaisFrequentes.add(entry.getKey());
                }
            }

            return letrasMaisFrequentes;
        }
    }
