//Questão 3 Funções

import java.util.Scanner;

public class ConversorTemperatura {

    // Converte Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) / 1.8;
    }

    // Converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Fahrenheit para Celsius");
        System.out.println("2 - Celsius para Fahrenheit");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = scanner.nextDouble();
            double c = fahrenheitParaCelsius(f);
            System.out.printf("Temperatura em Celsius: %.2f ℃\n", c);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double f = celsiusParaFahrenheit(c);
            System.out.printf("Temperatura em Fahrenheit: %.2f ℉\n", f);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
