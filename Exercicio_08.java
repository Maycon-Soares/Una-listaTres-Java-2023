package exercicio_08;
/**
 * @author Maycon Soares RA: 622123119
 */

/*
  8. Em um estacionamento há carros e motos. Escreva um algoritmo que solicite
ao usuário o total de veículos e o total de rodas.
O algoritmo deve determinar quantos carros e quantas motos há no
estacionamento. O resultado deve ser apresentado na tela para o usuário.
*/
import java.util.Scanner;
public class Exercicio_08 {

    public static void main(String[] args) {
    
        int totalVeiculos, totalRodas, totalCarros, totalMotos;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o total de veículos no estacionamento: ");
        totalVeiculos = input.nextInt();
        
        System.out.print("Digite o total de rodas dos veículos: ");
        totalRodas = input.nextInt();
        
        totalCarros = (totalRodas - (totalVeiculos * 2)) / 2;
        totalMotos = totalVeiculos - totalCarros;
        
        System.out.println("Há " + totalCarros + " carros e " + totalMotos + " motos no estacionamento.");
    }
}

