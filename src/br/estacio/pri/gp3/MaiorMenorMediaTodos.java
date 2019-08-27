/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp3;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class MaiorMenorMediaTodos {

    public static void main(String[] args) {
        int quantidadeNumeros;
        double maior = 0.00, menor = 0.00, soma = 0.00, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE NÚMEROS: ");
        quantidadeNumeros = teclado.nextInt();
        double numeros[] = new double[quantidadeNumeros];
        for (int i = 0; i < numeros.length; i++) {
            int numeroAtual = i + 1;
            System.out.println("DIGITE O " + numeroAtual + "º NÚMERO: ");
            numeros[i] = teclado.nextDouble();
            if (maior < numeros[i]) {
                maior = numeros[i];
            } else {
                if (menor < numeros[i]) {
                    menor = numeros[i];
                }
            }
            soma += numeros[i];
        }
        media = (soma / numeros.length);
        System.out.println("O MAIOR NÚMERO É " + maior);
        System.out.println("O MENOR NÚMERO É " + menor);
        System.out.println("A MÉDIA DOS NÚMEROS É " + media);
    }
}
