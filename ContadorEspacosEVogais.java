//Questão 2 Strings

import java.util.Scanner;

public class ContadorEspacosEVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase(); // converte tudo para minúsculas

        int espacos = 0;
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                espacos++;
            } else if (c == 'a') {
                contA++;
            } else if (c == 'e') {
                contE++;
            } else if (c == 'i') {
                contI++;
            } else if (c == 'o') {
                contO++;
            } else if (c == 'u') {
                contU++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Vogal A: " + contA + " vez(es)");
        System.out.println("Vogal E: " + contE + " vez(es)");
        System.out.println("Vogal I: " + contI + " vez(es)");
        System.out.println("Vogal O: " + contO + " vez(es)");
        System.out.println("Vogal U: " + contU + " vez(es)");

        scanner.close();
    }
}
