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
public class VetorTemperatura {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        Random aleatorio = new Random();
        int media = 0, soma = 0;
        double temperaturas[] = new double[30];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = aleatorio.nextInt(100);
        }
        for (int i = 0; i < temperaturas.length; i++) {
            media += temperaturas[i];
            if (temperaturas[i] > 35) {
                soma++;
            }
        }
        imprime += "\n" + soma + "x A TEMPERATURA PASSOU DOS 35°";
        imprime += "\nA MEDIA DA TEMPERATURA NO MÊS FOI " + media / temperaturas.length + "°";
        System.err.println(imprime);
    }

}
