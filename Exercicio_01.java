
package exercicio_01;

/**
 *
 * @author Maycon Soares RA: 622123119
 */

/*
  1. Escreva um algoritmo que leia dois números informados pelo usuário a partir
  do teclado e que apresente o resultado da média aritmética dos dois números
  informados.
*/
import java.util.Scanner;
public class Exercicio_01 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        
        double media = (num1+num2)/2;
        
        System.out.println("A média aritmética dos números "+num1+" e "+num2+ ""
                + " é: "+media);
    }
    
}
