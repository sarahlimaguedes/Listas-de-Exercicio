package javaapplicationex9lista3;

import java.util.Scanner;

public class JavaApplicationex9lista3 {

    public static void main(String[] args) {
        // Declarando a variável //
        int numero;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
        // Imprimindo a variável numero //
        System.out.print("Digite um numero aleatório : ");
        numero = sc.nextInt();
        // Declarando a variável double //
        double numero2 = numero;
        // Condição para numero primo //
        if ((numero2 / numero2) == (numero / numero)) {

            if (numero2 / 2 != numero / 2 || numero == 2) {
                // Imprimindo se o numero é primo ou não  //
                System.out.println("Este numero é primo!");

            } else {

                System.out.println("Este numero não é primo!");
            }

        }

    }
}
