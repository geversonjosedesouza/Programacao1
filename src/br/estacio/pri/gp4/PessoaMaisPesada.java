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
public class PessoaMaisPesada {

    public static void main(String[] args) {
        String pessoa1, pessoa2, imprime = "RESULTADO DA PESSOA MAIS PESADA";
        double peso1, peso2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE O NOME DA 1° PESSOA:");
        pessoa1 = teclado.next();
        System.out.println("DIGITE O PESO DA 1° PESSOA:");
        peso1 = teclado.nextDouble();
        System.out.println("DIGITE O NOME DA 2° PESSOA:");
        pessoa2 = teclado.next();
        System.out.println("DIGITE O PESO DA 2° PESSOA:");
        peso2 = teclado.nextDouble();
        if (peso1 > peso2) {
            imprime += "\nDADOS DA 1º PESSOA";
            imprime += "\nNOME: " + pessoa1;
            imprime += "\nPESO: " + peso1;
        } else {
            imprime += "\nDADOS DA 2º PESSOA";
            imprime += "\nNOME: " + pessoa2;
            imprime += "\nPESO: " + peso2;
        }
        System.out.println(imprime);
    }
}
