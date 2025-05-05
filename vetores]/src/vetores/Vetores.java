
package vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 5;
        int[] a = new int[tamanho];
        int[] b = new int[tamanho];

        System.out.println("Digite " + tamanho + " valores para o vetor A:");

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < tamanho; i++) {
            b[i] = a[i];
        }

        
        System.out.println("\nVetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nVetor B (cópia de A):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(b[i] + " ");
        }

        scanner.close();
    }
}


