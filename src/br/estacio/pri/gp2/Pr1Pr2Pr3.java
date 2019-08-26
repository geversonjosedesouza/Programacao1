/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp2;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class Pr1Pr2Pr3 {

    public static void main(String[] args) {
        double pr1, pr2, pr3, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE A NOTA DA PROVA 1: ");
        pr1 = teclado.nextDouble();
        System.out.print("\nDIGITE A NOTA DA PROVA 2: ");
        pr2 = teclado.nextDouble();
        media = (pr1 + pr2) / 2;
        if (media >= 6) {
            System.out.println("APROVADO COM MÉDIA: " + media);
        } else {
            System.out.print("\nVOCÊ NÃO ALCANÇOU A MÉDIA DIGITE A NOTA DA PROVA 3: ");
            pr3 = teclado.nextDouble();
            media = (media + pr3) / 2;
            if (media >= 6) {
                System.out.println("APROVADO COM MÉDIA: " + media);
            } else {
                System.out.println("REPROVADO COM MÉDIA: " + media);
            }
        }
    }
}
