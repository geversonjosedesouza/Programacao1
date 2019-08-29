/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.exercicios21082019;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class Raiz {

    public static void main(String[] args) {
        double x, r;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE UM NÚMERO: ");
        x = teclado.nextInt();
        r = Math.sqrt(x);
        System.out.println("\nA RAÍZ QUADRADA É: " + r);
    }
}
