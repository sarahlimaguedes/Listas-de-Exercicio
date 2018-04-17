package ex10lista3;

import java.util.Scanner;

public class Ex10lista3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Imprimindo a variavel num0 //
        System.out.println("Digite um número: ");
        int num0 = sc.nextInt();
        System.out.println(" Os números primos são: ");
        for (int j = 1; j <= num0; j++) {
            int contador = 0;
            // testando os números primos //  

            for (int i = 1; i <= num0; i++) {
                if (j % i == 0) {
                    contador++;
                }

            }
            if (contador == 2) {
                // Imprimindo os números primos //
                System.out.println(j);

            }
        }

    }

}
