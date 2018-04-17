package javaapplicationex6lista3;

import java.util.Scanner;

public class JavaApplicationex6lista3 {

    public static void main(String[] args) {
        //Declarando as variáveis //
        double num1, num2, num3;
        double soma;
        double produto;
        double media;
        // Declarando a classe Scanner para imprimir os resultados //
        Scanner sc = new Scanner(System.in);

        boolean a = true;
        // Condição//
        while (a) {
// Imprimindo as variáveis num1, num2 e num3 //
            System.out.println(" Informe a nota 1: ");
            num1 = sc.nextInt();
            System.out.println(" Informe a nota 2: ");
            num2 = sc.nextInt();
            System.out.println("Informe a nota 3: ");
            num3 = sc.nextInt();
// Condição-- Operação para o resultado da soma, produto e media //
            if ((num3 > num2) && (num3 > num1) && (num2 > num1)) {
                soma = num1 + num2 + num3;
                produto = num1 * num2 * num3;
                media = (num1 + num2 + num3) / 3;

                System.out.println("Soma: " + soma);
                System.out.println("Produto: " + produto);
                System.out.println("Media: " + media);
            } else {
                System.out.println(" Inválido! ");
                break;
            }

        }

    }

}
