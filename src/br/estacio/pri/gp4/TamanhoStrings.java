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
public class TamanhoStrings {

    public static void main(String[] args) {
        String palavra1 = "GEVERSON", palavra2 = "SOUZA";
        geraResultado(palavra1);
        geraResultado(palavra2);
    }

    private static void geraResultado(String palavra) {
        char palavras[] = palavra.toCharArray();
        String imprime = "IMPRIMINDO O RESULTADO DA PALAVRA: " + palavra;
        Random aleatorio = new Random();
        for (int i = 0; i < palavra.length(); i++) {
            if (i == 0) {
                imprime += "\nA PRIMEIRA LETRA DA PALAVRA: " + palavra + " É " + palavra.substring(i, 1 + i);
            }
            if (i == palavra.length() - 1) {
                imprime += "\nA ULTIMA LETRA DA PALAVRA: " + palavra + " É " + palavra.substring(i, 1 + i);
            }
        }
        imprime += "\n";
        for (int i = 0; i < palavras.length; i++) {
            int indice = aleatorio.nextInt(palavras.length);
            imprime += "| " + palavras[indice] + " ";
        }
        System.err.println(imprime);
    }
}
