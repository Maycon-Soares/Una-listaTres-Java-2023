package exercicio_05;

/**
 * @author Maycon Soares RA: 622123119
 */

/*
  5. Escreva um algoritmo para calcular e imprimir o salário bruto a ser recebido
por um funcionário em um mês.
O programa deverá utilizar os seguintes dados:
a. Número de horas que o funcionário trabalhou no mês.
b. Valor recebido por hora de trabalho.
c. Valor do salário família.
d. Número de filhos com idade menor que 14 anos, para calcular o salário
família.

*/
import java.util.Scanner;
public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = entrada.nextInt();
        
        System.out.println("Informe o valor recebido por hora de trabalho: ");
        double valorHora = entrada.nextDouble();
        
        System.out.println("Informe o valor do salário família: ");
        double salarioFamilia = entrada.nextDouble();
        
        System.out.println("Informe o número de filhos com idade menor que 14 anos: ");
        int numFilhos = entrada.nextInt();
        
        double salarioBruto = horasTrabalhadas * valorHora + salarioFamilia * numFilhos;
        
        System.out.printf("O salário bruto a ser recebido é: R$%.2f ", salarioBruto);
    }
}
