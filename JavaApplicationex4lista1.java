package javaapplicationex4lista1;

import java.util.Scanner;

public class JavaApplicationex4lista1 {

    public static void main(String[] args) {
        // Declarando as variáveis //
        double A;
        double B;
        double aux;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
        // Imprimindo os valores de A e B //
        System.out.println("Informe o valor de A");
        A = sc.nextDouble();
        System.out.println("Informe o valor de B");
        B = sc.nextDouble();
        // OPERAÇÃO -- Guardando na variável 'aux' o valor de A, para realizar a troca de valores entre A e B //
        aux = A;
        A = B;
        B = aux;
        // Imprimindo os valores de A e B //
        System.out.println(" O valor de A é igual a " + A);
        System.out.println(" O valor de B é igual a " + B);

    }

}
