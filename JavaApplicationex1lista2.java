package javaapplicationex1lista2;

import java.util.Scanner;

public class JavaApplicationex1lista2 {

    public static void main(String[] args) {
        // Declarando a variável//
        int num1;
        // Declando a classe Scanner para imprimir os resultados//
        Scanner sc = new Scanner(System.in);

        // Imprimindo a variável num1//
        System.out.println("Digite um número");
        num1 = sc.nextInt();

        // Condição para definir os números pares e ímpares//
        if ((num1 % 2) == 0) {
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é ímpar");
        }
        // Condição para definir se o número informado é negativo ou positivo//
        if (num1 < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }
    }
}
