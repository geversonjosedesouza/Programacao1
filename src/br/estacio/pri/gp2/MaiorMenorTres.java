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
public class MaiorMenorTres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[3];
        for (int i = 0; i < notas.length; i++) {
            int notaAtual = i + 1;
            System.out.println("DIGITE O " + notaAtual + "º NÚMERO: ");
            notas[i] = teclado.nextDouble();
        }
        double maior = notas[0], menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (maior < notas[i]) {
                maior = notas[i];
            }
            if (menor > notas[i]) {
                menor = notas[i];
            }
        }
        System.out.println("O MAIOR NÚMERO É " + maior);
        System.out.println("O MENOR NÚMERO É " + menor);
    }
}
