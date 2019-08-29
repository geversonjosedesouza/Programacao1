/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

import java.util.Random;

/**
 *
 * @author geverson
 */
public class SomaVetorPosNegNul {

    public static void main(String[] args) {
        int positivos = 0, negativos = 0, nulos = 0, numeros[] = new int[20];
        String imprime = "RESULTADO";
        Random gerador = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            }
            if (numeros[i] < 0) {
                negativos++;
            }
            if (numeros[i] == 0) {
                nulos++;
            }
        }
        imprime += "\nQUANTIDADE DE NÚMEROS POSITIVOS: " + positivos;
        imprime += "\nQUANTIDADE DE NÚMEROS NEGATIVOS: " + negativos;
        imprime += "\nQUANTIDADE DE NÚMEROS NULOS: " + nulos;
        System.out.println(imprime);
    }
}
