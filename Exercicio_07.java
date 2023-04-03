package exercicio_07;
/**
 * @author Maycon Soares RA: 622123119
 */

/*
  7. Escreva um algoritmo que leia o salário fixo de um vendedor, o valor total das
vendas que ele realizou no mês e o percentual que ele ganha sobre o total das
vendas mensais. O algoritmo deve calcular o salário total do vendedor e
apresentá-lo na tela.
*/
import java.util.Scanner;
public class Exercicio_07 {

    public static void main(String[] args) {
        double salarioFixo, vendas, percentualComissao, salarioTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do vendedor: ");
        salarioFixo = entrada.nextDouble();
        
        System.out.print("Digite o valor total das vendas realizadas: ");
        vendas = entrada.nextDouble();
        
        System.out.print("Digite o percentual de comissão sobre as vendas (em %): ");
        percentualComissao = entrada.nextDouble();
        
        salarioTotal = salarioFixo + (vendas * percentualComissao) / 100;
        
        System.out.printf("O salário total do vendedor é: R$ %.2f", salarioTotal);
    }
}