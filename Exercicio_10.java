package exercicio_10;
/**
 * @author Maycon Soares RA: 622123119
 */

/*
  10. Escreva um algoritmo que, dados três valores, calcule e imprima as médias
aritmética, harmônica e geométrica destes valores.
OBS.:
a. Média aritmética:
(a + b + c) / 3
b. Média harmônica:

c. Média geométrica:
*/
import java.util.Scanner;
public class Exercicio_10 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
        System.out.println("Informe o valor do " +i +  "° número");
        
        if (i == 1){
            a = entrada.nextInt();
        }
        else if (i == 2){
            b = entrada.nextInt();
        }
        else if (i == 3){
            c = entrada.nextInt();
        }
        }
        double mediaAri = (a+b+c)/3;
        double mediahar = 3.0 /((1.0/a)+(1.0/b)+(1.0/c));
        double mediaGeo = Math.cbrt(a*b*c);
        
        System.out.println("Média aritmética: " + mediaAri);
        System.out.println("Média harmônica: " + mediahar);
        System.out.println("Média geométrica: " + mediaGeo);
    }
}
    
