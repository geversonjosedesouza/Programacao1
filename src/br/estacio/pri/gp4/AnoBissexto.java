/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class AnoBissexto {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        int ano;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UM ANO: ");
        ano = teclado.nextInt();
        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 == 0) {
                imprime += "O ANO: " + ano + " NÃO É BISSEXTO!";
            } else {
                imprime += "O ANO: " + ano + " É BISSEXTO!";
            }
        } else {
            imprime += "O ANO: " + ano + "NÃO É BISSEXTO!";
        }
        System.out.println(imprime);
    }
}
