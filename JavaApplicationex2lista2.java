
package javaapplicationex2lista2;

import java.util.Scanner;


public class JavaApplicationex2lista2 {

    
    public static void main(String[] args) {
        // Declarando as variáveis //
        int l1;
        int l2;
        int l3;
        // Declarando a classe Scanner para receber os valores //
        Scanner sc =  new Scanner(System.in);
        // Imprimindo as variáveis //
        System.out.println("Digite o primeiro valor");
        l1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        l2 = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        l3 = sc.nextInt();
        // condição/operação para definir se trata-se de um triângulo equilatero, isósceles ou escaleno //
       if (l1 + l2 > l3){
           System.out.println("TRIÂNGULO");
       }else {
           System.out.println("NÃO É UM TRIÂNGULO");
       }
       if (l1==l2 && l1 == l3){
            System.out.println("TRIÂNGULO EQUILATERO");
       
       }else if (l1==l2 || l1==l3 || l2==l3){
           System.out.println("TRIÂNGULO ISÓSCELES");
       }else {
           System.out.println("TRIÂNGULO ESCALENO");
       }
        
        
        
    }
    
}


