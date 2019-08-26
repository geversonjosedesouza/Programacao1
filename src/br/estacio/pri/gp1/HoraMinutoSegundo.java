/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp1;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class HoraMinutoSegundo {

    public static void main(String[] args) {
        int h, m, s, r;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("DIGITE A(S) HORA: ");
            h = teclado.nextInt();
        } while (h > 24);
        do {
            System.out.print("\nDIGITE O(S) MINUTOS: ");
            m = teclado.nextInt();
        } while (m > 60);
        do {
            System.out.print("\nDIGITE O(S) SEGUNDOS: ");
            s = teclado.nextInt();
        } while (s > 60);
        r = (h * 60 * 60) + (m * 60) + s;
        System.out.println("O VALOR DE " + h + "HORA(S) " + m + "MINUTO(S) " + s + "SEGUNDOS, CONVERTIDOS EM SEGUNDOS É " + r + " SEGUNDOS");
    }
}
