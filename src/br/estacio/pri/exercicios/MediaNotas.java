package br.estacio.pri.exercicios;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class MediaNotas {

    public MediaNotas() {
        float av1, av2, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da AV1: ");
        av1 = sc.nextInt();
        System.out.print("Digite a nota da AV2: ");
        av2 = sc.nextInt();

        media = (av1 + av2) / 2;
        if (media >= 6) {
            System.out.println("Aprovado com média:" + media);
        } else {
            System.out.println("Reprovado com média:" + media);
        }
    }
}
