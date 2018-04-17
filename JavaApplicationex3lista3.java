package javaapplicationex3lista3;

public class JavaApplicationex3lista3 {

    public static void main(String[] args) {
        // Declarando as variáveis //
        int soma = 0;
        int j = 1;
        // Declarando estrutura de repetição para a leitura de todos os números de 0 a 99, com incremento de 2 //
        for (int i = 1; i <= 99; i += 2) {
            // Operação para descobrir a soma final //
            soma = (i / j) + soma;
            j = j + 1;
            // Imprimindo a variável soma //        
            System.out.println("A soma é" + soma);
        }
    }

}
