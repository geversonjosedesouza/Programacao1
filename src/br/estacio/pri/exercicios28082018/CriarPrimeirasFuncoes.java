/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.exercicios28082018;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class CriarPrimeirasFuncoes {

    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO PARA CALCULAR O FATORIAL: ");
        numero = teclado.nextInt();
        System.out.println("O RESULTADO DE " + numero + " É " + calculaFatorial(numero));
    }

    private static int calculaFatorial(int numero) {
        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }
}
