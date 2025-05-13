//Questão 3 vetores

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5; // Tamanho fixo do vetor (pode alterar)
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];
        int[] vetorSoma = new int[TAMANHO];

        // Leitura do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        // Leitura do vetor B
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        // Soma dos vetores
        for (int i = 0; i < TAMANHO; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        // Exibição do vetor soma
        System.out.println("\nVetor Soma:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Soma[" + i + "] = " + vetorSoma[i]);
        }

        scanner.close();
    }
}
