package javaapplicationex4lista2;

import java.util.Scanner;

public class JavaApplicationex4lista2 {

    public static void main(String[] args) {
// Declarando as variáveis //
        int a, b, c;
        String opcao;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
// Imprimindo as variáveis a, b e c //
        System.out.println("Digite o primeiro valor:");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        b = sc.nextInt();
        System.out.println("Digite o terceito valor:");
        c = sc.nextInt();
// Imprimindo a String opcao //
        System.out.println("Escolha C ou D");
        sc = new Scanner(System.in);

        opcao = sc.nextLine();
        char opcao2 = opcao.charAt(0);
        switch (opcao2) {
            // case c, declarando condições para imprimir os valores em ordem crescente //
            case 'C':
                if (a < b && b < c) {
                    System.out.println(a + "-" + b + "-" + c);
                } else if (a < c && c < b) {
                    System.out.println(a + "-" + c + "-" + b);
                } else if (b < a && a < c) {
                    System.out.println(b + "-" + a + "-" + c);
                } else if (b < c && c < a) {
                    System.out.println(b + "-" + c + "-" + a);
                } else if (c < a && a < b) {
                    System.out.println(c + "-" + a + "-" + b);
                } else if (c < b && b < a) {
                    System.out.println(c + "-" + b + "-" + a);
                } else {
                    System.out.println("Numeros Iguais");
                }
                break;
            // case d, declarando condições para imprimir os valores em ordem decrescente //
            case 'd':

                if (a > b && b > c) {
                    System.out.println(a + "-" + b + "-" + c);
                } else if (a > c && c > b) {
                    System.out.println(a + "-" + c + "-" + b);
                } else if (b > a && a > c) {
                    System.out.println(b + "-" + a + "-" + c);
                } else if (b > c && c > a) {
                    System.out.println(b + "-" + c + "-" + a);
                } else if (c > a && a > b) {
                    System.out.println(c + "-" + a + "-" + b);
                } else if (c > b && b > a) {
                    System.out.println(c + "-" + b + "-" + a);
                } else {
                    System.out.println("Numeros Iguais");
                }
                break;
        }

    }
}
