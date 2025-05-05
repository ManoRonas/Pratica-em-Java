
package areacirc;
import java.util.Scanner;

public class AreaCirc {
 public static void main(String[] args) {
        final double PI = 3.14; // constante π
        double raio, area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferência: ");
        raio = scanner.nextDouble();

        area = PI * raio * raio; 

        System.out.println("A área da circunferência é: " + area);

        scanner.close();
    }
   
    
   
    }
    

