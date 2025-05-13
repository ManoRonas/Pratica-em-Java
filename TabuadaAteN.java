//Questão 4 Estrutura de repetição


import java.util.Scanner;

public class TabuadaAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até qual número deseja ver a tabuada: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("\nTabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        scanner.close();
    }
}
