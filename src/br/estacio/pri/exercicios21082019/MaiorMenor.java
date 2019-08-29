/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.exercicios21082019;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class MaiorMenor {

    public static void main(String[] args) {
        int quantidadeNotas;
        double maior = 0.00, menor = 0.00, soma = 0.00, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE NOTAS VOCÊ QUE CALCULAR: ");
        quantidadeNotas = teclado.nextInt();
        double notas[] = new double[quantidadeNotas];
        for (int i = 0; i < notas.length; i++) {
            int notaAtual = i + 1;
            System.out.println("DIGITE A " + notaAtual + "º NOTA: ");
            notas[i] = teclado.nextDouble();
            if (maior < notas[i]) {
                maior = notas[i];
            } else {
                if (menor < notas[i]) {
                    menor = notas[i];
                }
            }
            soma += notas[i];
        }
        media = (soma / notas.length);
        System.out.println("A MAIOR NOTA É " + maior);
        System.out.println("A MENOR NOTA É " + menor);
        System.out.println("A MÉDIA DAS NOTAS É " + media);
    }
}
