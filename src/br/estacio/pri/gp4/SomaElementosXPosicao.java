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
public class SomaElementosXPosicao {

    public static void main(String[] args) {
        int soma = 0, numeros[] = {12, 13, 15, 1, 7, 8, 50, 25};
        String imprime = "RESULTADO\n";
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[i]) {
                soma += numeros[i] * i;
            }
        }
        imprime += "A SOMA TOTAL É " + soma;
        System.err.println(imprime);
    }
}
