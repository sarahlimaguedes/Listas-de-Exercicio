package javaapplicationex5lista2;

import java.util.Scanner;

public class JavaApplicationex5lista2 {

    public static void main(String[] args) {
// Declarando as variáveis //
        double num1;
        double num2;
        double num3;
        double result;
        String opcao;
// Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
// Imprimindo as variáveis num1, num2 e num3 //
        System.out.println("Digite o primero numero:");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextDouble();
        System.out.println("Digite o terceito numero");
        num3 = sc.nextDouble();
        // Imprimindo a string opcao//
        System.out.println("Escolha s para soma; m para multiplicação; me para media");
        sc = new Scanner(System.in);
        opcao = sc.nextLine();

        switch (opcao) {
            // Condição para imprimir somar //
            case "s":
                result = num1 + num2 + num3;
                System.out.println("A soma é: " + result);
                break;
            // Condição para imprimir a multiplicação //    
            case "m":
                result = num1 * num2 * num3;
                System.out.println("A multiplicacao é: " + result);
                break;
            // Condição para imprimir a media //    
            case "me":
                result = (num1 + num2 + num3) / 3;
                System.out.println("A media é: " + result);
                break;
        }
    }

}
