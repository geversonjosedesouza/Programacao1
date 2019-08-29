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
public class MediaXValores {

    public static void main(String[] args) {
        int quantidadeNumeros, positivos = 0, negativos = 0;
        double somaTotal = 0.00;
        double porcentagemPositivos = 0.00;
        double porcentagemNegativos = 0.00;
        double media;
        String imprimir = "RESULTADO";
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE A QUANTIDADE DE NÚMEROS QUE DESEJA CALCULAR A MÉDIA: ");
        quantidadeNumeros = teclado.nextInt();
        int valores[] = new int[quantidadeNumeros];
        for (int i = 0; i < valores.length; i++) {
            int numeroAtual = i + 1;
            System.out.print("\nDIGITE A O VALOR DO NÚMERO " + numeroAtual + ": ");
            if (valores[i] < 0) {
                negativos++;
            } else {
                positivos++;
            }
            valores[i] = teclado.nextInt();
            somaTotal += valores[i];
        }
        media = somaTotal / valores.length;
        porcentagemPositivos = (positivos / valores.length) * 100;
        porcentagemNegativos = (negativos / valores.length) * 100;
        imprimir += "\nA SOMA DE TODOS OS NÚMEROS É = " + somaTotal;
        imprimir += "\nA MÉDIA TODOS OS NÚMEROS É = " + media;
        imprimir += "\nA PORCENTAGEM TOTAL É = " + ((valores.length / valores.length) * 100) + "%";
        imprimir += "\nA QUANTIDADE DE NÚMEROS POSITIVOS É = " + positivos;
        imprimir += "\nA PORCENTAGEM DE NÚMEROS POSITIVOS É = " + porcentagemPositivos + "%";
        imprimir += "\nA QUANTIDADE DE NÚMEROS NEGATIVOS É = " + negativos;
        imprimir += "\nA PORCENTAGEM DE NÚMEROS NEGATIVOS É = " + porcentagemNegativos + "%";
        imprimir += "\n";
        System.out.print(imprimir);
    }

}
