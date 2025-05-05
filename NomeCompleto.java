//Questão 5 Estrutura Sequencial
package nomecompleto;
import java.util.Scanner;
        
public class NomeCompleto {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome, sobrenome, nomeCompleto;

        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        sobrenome = scanner.nextLine();

        nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);

        scanner.close();
    }
}

    
    

