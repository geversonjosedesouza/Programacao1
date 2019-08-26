/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp2;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class ParImpar {

    public static void main(String[] args) {
        int numero, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            resultado = numero / 2;
            System.out.println("A METADE NO NÚMERO " + numero + " É " + resultado);
        } else {
            resultado = numero * 2;
            System.out.println("O DOBRO NO NÚMERO " + numero + " É " + resultado);
        }
    }
}
