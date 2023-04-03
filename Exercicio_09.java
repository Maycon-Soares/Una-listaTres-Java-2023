package exercicio_09;
/**
 * @author Maycon Soares RA: 622123119
 */

/*
  9. Escreva um algoritmo que receba um número inteiro de segundos a partir do
teclado e imprima na tela a quantidade correspondente em horas, minutos e
segundos.
*/
import java.util.Scanner;
public class Exercicio_09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor em segundos: ");
        double segundos = entrada.nextInt();
        
        double horas = segundos/3600;
        double minutos = segundos % 3600/60;
        double restanteSeg = segundos%60;
        
        System.out.printf("O valor %.0f segundos, representa %.0fh:%.0fm:%.0fs",segundos , horas , minutos, restanteSeg);
        
    }
    
}
