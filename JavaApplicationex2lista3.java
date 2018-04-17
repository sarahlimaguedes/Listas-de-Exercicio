package javaapplicationex2lista3;

import java.util.Scanner;

public class JavaApplicationex2lista3 {

    public static void main(String[] args) {
        //Declarando as variáveis//
        int i;
        //Declarando a classe Scanner para imprimir o resultado//        
        Scanner sc = new Scanner(System.in);
        // Declarando a estrutura de repetição para leitura de todos os números de 0 a 9//
        for (i = 0; i < 10; i++) {
            // Imprimindo a tabuada de 9//
            System.out.println(" O valor da tabuada de 9 x " + i + " é " + i * 9);
        }
    }

}
