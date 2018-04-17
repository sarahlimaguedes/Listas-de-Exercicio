package javaapplicationex5lista3;

import java.util.Scanner;

public class JavaApplicationex5lista3 {

    public static void main(String[] args) {
        // Declarando as variáveis //
        int num = 0;
        int par = 0;
        int imp = 0;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);

        while (num < 1000) {

            System.out.println(" Digite um número");
            num = sc.nextInt();
            // Condição para imprimir os numeros pares e ímapres //
            if (num % 2 == 0) {
                par = par + num;

            } else {
                imp = imp + num;

            }

        }
        System.out.println(" PARES " + par);
        System.out.println(" ÍMPAR " + imp);
    }

}
