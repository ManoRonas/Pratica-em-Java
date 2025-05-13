//Questão 1 Strings

import java.util.Scanner;

public class NomeInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Converte para maiúsculas
        nome = nome.toUpperCase();

        // Inverte o nome
        String nomeInvertido = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeInvertido += nome.charAt(i);
        }

        System.out.println("Seu nome de trás para frente (em maiúsculas): " + nomeInvertido);

        scanner.close();
    }
}
