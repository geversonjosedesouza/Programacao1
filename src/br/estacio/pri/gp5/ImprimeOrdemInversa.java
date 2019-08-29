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
public class ImprimeOrdemInversa {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        String palavra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UMA PALAVRA: ");
        palavra = teclado.next();
        imprime += "A PALAVRA " + palavra + " É " + inverte(palavra);
        System.out.println(imprime);
    }

    static String inverte(String palavra) {
        String invertida = "";
        for (int i = palavra.length(); i > 0; i--) {
            invertida += palavra.substring(i - 1, i);
        }
        return invertida;
    }
}
