
package maior.numero;

import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        double a, b;
        
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        
       System.out.print("Digite o segundo valor: ");
        b = scanner.nextDouble();
        
        if (a > b){
            System.out.print("O maior número é: " + a);
        }
        else if (a == b){
          System.out.print("Os números são iguais");
        }
        else {
            System.out.print("O maior número é: " +b);
        
    }
    }
    
}
