package javaapplicationex3lista2;

import java.util.Scanner;

public class JavaApplicationex3lista2 {

    public static void main(String[] args) {
// Declarando as variáveis //
        double nota1;
        double nota2;
        double nota3;
        double media;
// Declarando a classe Scanner para imprimir os resultados//
        Scanner sc = new Scanner(System.in);
        // Imprimindo nota1, nota2 e nota3 //
        System.out.println("Digite a nota 1");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3");
        nota3 = sc.nextDouble();
// Declarando condição para informar quais das três notas informadas é maior //
        if (nota1 > nota2 && nota1 > nota3) {
            System.out.println("A nota 1 é maior");
        } else if (nota2 > nota1 && nota2 > nota3) {
            System.out.println("A nota 2 é a maior");
        } else {
            System.out.println(" A nota 3 é a maior");
        }
// Operação para descobrir a média das três notas //
        media = ((nota1 + nota2 + nota3) / 3);
// Imprimindo a média das notas //
        System.out.println("media " + media);
    }

}
