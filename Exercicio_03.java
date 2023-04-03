
package exercicio_03;


/**
 * @author Maycon Soares RA: 622123119
 */

/*
  3. Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir
do teclado em graus Fahrenheit e a converta para o seu equivalente em graus
centígrados.
OBS.: °C = (°F − 32) / 1,8
*/
import java.util.Scanner;
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit para converção: ");
        double temperaturaF = entrada.nextDouble();
        double temperaturaC = (temperaturaF - 32)/ 1.8;
        System.out.printf("A temperatura em graus Celsius é: %.2f°C\n" ,temperaturaC); 
                
    }
    
}
