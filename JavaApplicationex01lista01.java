
package javaapplicationex01lista1;

import java.util.Scanner;


public class JavaApplicationex01lista01 {
   
    
    public static void main(String[] args) {
        //Declarando as variáveis//
        int num1;
        int num2;
        double soma;
        double diferenca;
        double produto;
        double media;
        // Declarando a classe Scanner para imprimir os resultados//
        Scanner sc = new Scanner(System.in);
        // Imprimindo as variáveis num1 e num2 //
        System.out.println("Digite o primeitro número");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();
        
        // Recebe--Operação para mostrar a soma, a diferança, o produto e a media dos números informados //
        soma = num1 + num2;
        diferenca = num1 - num2;
        produto = num1 * num2;
        media = (num1 + num2)/2;
        
        // Imprimindo as variáveis para mostrar os resultados//
        System.out.println("soma " + soma);
        System.out.println("diferenca " + diferenca);
        System.out.println("produto " + produto);
        System.out.println("media " + media);
                
        
      
    }
    
}
