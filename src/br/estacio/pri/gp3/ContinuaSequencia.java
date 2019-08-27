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
public class ContinuaSequencia {

    public static void main(String[] args) {
        int quantidade, inicio = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE A QUANDIDADE DE VALORES PARA ONTINUAR A SEQUÊNCIA: 1-1/2+1/4-1/6+1/8-1/10+...");
        quantidade = teclado.nextInt();
        for (int i = 1; i <= quantidade; i++) {
            inicio += 2;
            if (i % 2 == 0) {
                System.out.print("+1/" + inicio);
            } else {
                System.out.print("-1/" + inicio);
            }
        }
    }
}
