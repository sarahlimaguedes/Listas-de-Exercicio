package javaapplicationex02lista1;

import java.util.Scanner;

public class JavaApplicationex02lista1 {

    public static void main(String[] args) {
        //declarando as variáveis//
        double graus;
        double fahrenheit;
        // Declarando a classe Scanner receber os resultados//
        Scanner sc = new Scanner(System.in);
        // Imprimindo a variável graus//
        System.out.println("Informe o grau em C");
        graus = sc.nextDouble();
        // Operação para mostrar o valor convertido de graus ºC para fahrenheit//
        fahrenheit = (9 * graus + 160) / 5;
        // Imprimindo o resultado//
        System.out.println("O valor em Fahrenheit é " + fahrenheit);

    }
}
