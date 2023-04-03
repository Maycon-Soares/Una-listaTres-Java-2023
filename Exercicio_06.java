
package exercicio_06;
/**
 * @author Maycon Soares RA: 622123119
 */

/*
  6. Escreva um algoritmo que receba dois números a partir do teclado. O
algoritmo deve imprimir o logaritmo do primeiro número na base
representada pelo segundo número.

*/
import java.util.Scanner;
public class Exercicio_06 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
       System.out.print("Informe o primeiro número: ");
       double num1 = entrada.nextDouble();
       
       System.out.print("Informe o segundo número: ");
       double num2 = entrada.nextDouble();
       
       double resultado = Math.log(num1)/ Math.log(num2);
       
       System.out.printf("O logaritmo de %.2f na base %.2f é: %.2f\n", num1, num2, resultado);
    }
    
}
