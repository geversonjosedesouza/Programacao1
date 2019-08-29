/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

/**
 *
 * @author geverson
 */
public class MostraRepetido {

    public static void main(String[] args) {
        int numeros1[] = {12, 13, 15, 1, 7, 8, 50, 25, 30, 63}, numeros2[] = {12, 13, 15, 1, 7, 8, 50, 25, 30, 63};
        String imprime = "RESULTADO\n";
        for (int i = 0; i < 10; i++) {
            if (numeros1[i] == numeros2[i]) {
                imprime += "| " + numeros1[i] + " ";
            }
        }
        System.err.println(imprime);
    }
}
