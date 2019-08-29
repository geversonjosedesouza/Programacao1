/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class LerFrase {

    public static void main(String[] args) {
        int soma = 0;
        String imprime = "RESULTADO", frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UMA FRASE: ");
        frase = teclado.next();
        char letras[] = frase.toCharArray(), letra;
        System.out.println("DIGITE UMA LETRA QUE ESTEJA NA FRASE: ");
        letra = teclado.next().charAt(0);
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                soma++;
            }
        }
        imprime += "\nNA FRASE: " + frase + ", TEMOS A LETRA " + letra + " REPETIDA " + soma + "x";
        System.out.println(imprime);
    }

}
