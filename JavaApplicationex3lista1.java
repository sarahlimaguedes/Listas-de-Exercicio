package javaapplicationex3lista1;

import java.util.Scanner;

public class JavaApplicationex3lista1 {

    public static void main(String[] args) {
        // Declarando as variáveis //
        double pi = 3.14;
        double raio;
        double altura;
        double volume;
        // Declarando a classe Scanner para imprimir os resultado//
        Scanner sc = new Scanner(System.in);
        // Imprimindo as variáveis raio e altura //
        System.out.println("Digite o valor de raio");
        raio = sc.nextDouble();
        System.out.println("Digite o valor da altura");
        altura = sc.nextDouble();

        // Operação para mostrar o valor de volume //
        volume = (pi * (raio * raio) * altura);
        // Imprimindo a variável volume //
        System.out.println("O valor do volume da lata de óleo é " + volume);

    }

}
