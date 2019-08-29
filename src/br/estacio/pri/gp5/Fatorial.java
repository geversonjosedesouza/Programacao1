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
public class Fatorial {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        numero = teclado.nextInt();
        fatorial(numero);
        if (numero == 0) {
            imprime += "O FATORIAL DE " + numero + " É 1!";
        } else {
            imprime += "O FATORIAL DE " + numero + " É " + fatorial(numero) + "!";
        }
        System.out.println(imprime);
    }

    static int fatorial(int numero) {
        int soma = 1;
        for (int i = 1; i <= numero; i++) {
            soma *= i;
        }
        return soma;
    }
}
