//Questão 5 Strings

import java.util.Scanner;

public class DigitosPorExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numero = scanner.nextLine();

        // Vetor com os nomes dos dígitos
        String[] extenso = {
            "zero", "um", "dois", "três", "quatro", 
            "cinco", "seis", "sete", "oito", "nove"
        };

        System.out.println("Dígitos por extenso:");

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);

            if (Character.isDigit(c)) {
                int digito = Character.getNumericValue(c);
                System.out.println(extenso[digito]);
            } else if (c == '-') {
                System.out.println("menos");
            } else {
                System.out.println("[caractere inválido]");
            }
        }

        scanner.close();
    }
}
