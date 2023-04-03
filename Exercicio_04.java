package exercicio_04;

/**
 * @author Maycon Soares RA: 622123119
 */

/*
  4. Escreva um algoritmo para calcular os juros compostos de uma aplicação
financeira. O algoritmo deve ler o valor do capital a ser aplicado, o prazo de
aplicação em meses, a taxa de juros mensal e apresentar na tela o montante a
ser recebido.
OBS: M = C × (1 + i) n
 , em que M é o montante a ser recebido, C é o capital
aplicado, i é a taxa de juros e n é o prazo da aplicação.
*/
import java.util.Scanner;
public class Exercicio_04 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do capital a ser aplicado: ");        
        double capital = entrada.nextDouble();
        
        System.out.println("Informe o prazo de aplicação em meses: ");
        int meses = entrada.nextInt();
        
        System.out.println("Informe a taxa de juros mensal em %: ");
        float juros = entrada.nextFloat()/100;
     
        double montante = (capital * (1 + juros)*meses);
        
        System.out.printf("O valor do montante a ser recebido é %.2f ",  montante);
        
        
        
    }
    
}
