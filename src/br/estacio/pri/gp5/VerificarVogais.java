/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp5;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class VerificarVogais {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        String palavra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UMA FRASE: ");
        palavra = teclado.nextLine();
        imprime += "\nQUANTIDADE DE VOGAIS " + quantidadeVogais(palavra);
        imprime += "\nQUANTIDADE DE ESPAÇOS " + quantidadeEspacos(palavra);
        imprime += "\nPRIMEIRAS LETRAS\n ";
        primeirasLetras(palavra);
        System.out.println(imprime);
    }

    static int quantidadeVogais(String frase) {
        int soma = 0;
        String vogais[] = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (frase.substring(i, i + 1).equals(vogais[j])) {
                    soma++;
                }
            }
        }
        return soma;
    }

    static int quantidadeEspacos(String frase) {
        int soma = 0;
        char t[] = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                soma++;
            }
        }
        return soma;
    }

    static void primeirasLetras(String frase) {
        String palavras[] = frase.split(" ");
        char t[] = new char[frase.length()];
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("A " + i + "º LETRA DA PALAVRA" + palavras[i] + " É " + palavras[i].substring(i, i + 1));
        }
    }
}
