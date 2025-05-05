//Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.
package matrizpei;

import java.util.Scanner;

public class MatrizInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas = 2;//Numero de linhas da matriz
        int colunas = 4;//Numero de colunas
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Matriz de tamanho " + linhas + "x" + colunas + " criada.");

        while (true) {
            System.out.print("\nDigite o número da linha (0 a " + (linhas - 1) + ") ou -1 para sair: ");
            int linha = scanner.nextInt();

            if (linha == -1) {
                System.out.println("Encerrando a inserção de dados.");
                break;
            }

            if (linha >= 0 && linha < linhas) {
                System.out.print("Digite o número da coluna (0 a " + (colunas - 1) + "): ");
                int coluna = scanner.nextInt();

                if (coluna >= 0 && coluna < colunas) {
                    System.out.print("Digite o valor para inserir na posição [" + linha + "][" + coluna + "]: ");
                    int valor = scanner.nextInt();
                    matriz[linha][coluna] = valor;
                    System.out.println("Valor inserido com sucesso!");
                } else {
                    System.out.println("Coluna inválida.");
                }
            } else {
                System.out.println("Linha inválida.");
            }

            // Mostrar a matriz
            System.out.println("\nMatriz atual:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("[" + matriz[i][j] + "] ");
                }
                System.out.println();
            }
        }

        

        scanner.close();
    }
}

    

