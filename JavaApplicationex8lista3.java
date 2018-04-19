package javaapplicationex8lista3;

import java.util.Scanner;

public class JavaApplicationex8lista3 {

    public static void main(String[] args) {
        // Declarando o Scanner para receber os resultados//
        Scanner sc = new Scanner(System.in);
        // Imprimindo a variável n//
        System.out.println(" Digite um numero: ");
        // Declarando e iniciando as variáreis//
        int n = sc.nextInt(), par = 1, impar = 1;
        // Imprimindo os números pares//
        System.out.println("Os números Pares são: ");
        // Declarando a sintaxe para imprimir os números pares//
        while (par <= n) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
            // Acrescentando mais um valor a variável par"    
            par++;
        }
        // Declarando a sintaxe para imprimir os números ímpares//
        System.out.println("Os números Impares são : ");
        while (impar <= n) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
            // Acrescentando mais um valor a variável ímpar//
            impar++;
        }

    }

}
