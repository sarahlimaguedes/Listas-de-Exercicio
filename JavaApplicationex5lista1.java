package javaapplicationex5lista1;

import java.util.Scanner;

public class JavaApplicationex5lista1 {

    public static void main(String[] args) {
        // Declarando as variáveis //
        int num1;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
        // Imprimindo a variável num' //
        System.out.println(" Digite um número ");
        num1 = sc.nextInt();
        // Realizando a operação para descobrir o valor atribuido a variável num1 //
        num1 = num1 * num1;
        // Imprimindo a variável num1 elevada ao quadrado //
        System.out.println(" O valor desse número ao quadrado é " + num1);

    }

}
