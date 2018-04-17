package javaapplicationex7lista3;

import java.util.Scanner;

public class JavaApplicationex7lista3 {

    public static void main(String[] args) {
        // declarando as variáveis //
        double media, maiorMedia = 0, menorMedia = 0, mediaGeral = 0;
        int cont = 0;
        // Declarando a classe Scanner para receber os resultados //
        Scanner sc = new Scanner(System.in);
        do {
            // Imprimindo a média //
            System.out.println(" Informar a média ");
            media = sc.nextDouble();
            cont++;
            if (media >= 0) {
                mediaGeral = mediaGeral + media;
            }
            if (media > maiorMedia) {
                maiorMedia = media;
            } else {
                if (media >= 0) {
                    menorMedia = media;
                }
            }
        } while (media >= 0);

        // Imprimindo as médias //
        System.out.println(" A maior média é " + maiorMedia);
        System.out.println(" A menor média é  " + menorMedia);
        System.out.println(" A média geral é : " + mediaGeral / (cont - 1));
    }
}
