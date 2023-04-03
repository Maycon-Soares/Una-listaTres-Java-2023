/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_02;

/**
 * @author Maycon Soares RA: 622123119
 */

/*
  2. Escreva um algoritmo que leia o preço de um produto a partir do teclado e
apresente na tela o valor do produto acrescido de 10% de seu valor original.
Exemplo:
Informe o valor do produto: 50.00
Novo valor do produto: 55.00
*/
import java.util.Scanner;
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();
        double newValorProduto = (valorProduto*0.1)+valorProduto;
        
        System.out.println("O Valor do produto com acrecimo de 10% é: "+newValorProduto);
    }
    
}
