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
public class DiferecaMaioMenor {

    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        numero1 = teclado.nextInt();
        System.out.print("DIGITE OUTRO NÚMERO: ");
        numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.print("A DIFERENÇA DO MAIOR PELO MENOR É: " + resultado);
        } else {
            if (numero1 < numero2) {
                resultado = numero2 - numero2;
                System.out.print("A DIFERENÇA DO MAIOR PELO MENOR É: " + resultado);
            }
        }
    }
}
