
package javaapplicationex1lista3;

import java.util.Scanner;


public class JavaApplicationex1lista3 {

    
    public static void main(String[] args) {
        //Declarando as váriáveis//
     double num1;
     double maior = 0;
     double menor = 200;
     // Declarando a variável Scanner para imprimir os resultados//
     Scanner sc = new Scanner(System.in);
     
     //Imprimindo num1 para o usuário digitar 15 números//
     System.out.println("Digite 15 números");
        
        // Declarando a estrutura de repetição para leitura de todos  numeros digitados//
        for (int i = 0; i < 15; i++) {
            num1 = sc.nextDouble();
            
        if (num1 > maior){
            maior = num1;
        }
        if (num1< menor){    
            menor = num1;      
        }
            
        
        
    }
   System.out.println(" O maior número digitado foi: " + maior); 
   System.out.println(" O menor número digitado foi: " + menor); 
}
    
}
