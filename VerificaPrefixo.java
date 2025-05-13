//Questão 1 Funçoes

import java.util.Scanner;

public class VerificaPrefixo {
    
    public static boolean ehPrefixo(String prefixo, String palavra) {
        return palavra.startsWith(prefixo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra (prefixo): ");
        String prefixo = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra = scanner.nextLine();

        boolean resultado = ehPrefixo(prefixo, palavra);

        System.out.println("É prefixo? " + resultado);

        scanner.close();
    }
}
