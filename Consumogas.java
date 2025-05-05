//Questão 9 Estrutura Sequencial
package consumogas;

import java.util.Scanner;
public class Consumogas {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia, combustivel, consumoMedio;

        System.out.print("Digite a distância percorrida (em km): ");
        distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        combustivel = scanner.nextDouble();

        if (combustivel != 0) {
            consumoMedio = distancia / combustivel;
            System.out.printf("O consumo médio do automóvel é: %.2f km/l%n", consumoMedio);
        } else {
            System.out.println("Erro: o combustível gasto não pode ser zero.");
        }

        scanner.close();
    }
}