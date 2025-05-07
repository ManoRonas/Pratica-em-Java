//Questao 3 Estrutura de Decisao
package ordenarnum;
import java.util.Scanner;
import java.util.Arrays;
public class OrdenarNum {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os 3 números
        System.out.print("Digite o primeiro número: ");
        int v1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int v2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int v3 = scanner.nextInt();

        // Coloca os números em um array
        int[] numeros = {v1, v2, v3};

        // Ordena o array
        Arrays.sort(numeros);

        // Imprime os números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
