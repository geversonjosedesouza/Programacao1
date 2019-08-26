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
public class AnosMesesDias {

    public static void main(String[] args) {
        int a, m, d, r;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE O(S) ANO(S): ");
        a = teclado.nextInt();
        do {
            System.out.print("\nDIGITE O(S) MES(ES): ");
            m = teclado.nextInt();
        } while (m > 12);
        do {
            System.out.print("\nDIGITE O(S) DIA(S): ");
            d = teclado.nextInt();
        } while (d > 30);
        r = (a * 12 * 30) + (m * 30) + d;
        System.out.println("O VALOR DE " + a + "ANO(S) " + m + "MES(ES) " + d + "DIA(S), CONVERTIDOS EM DIAS É " + r + " DIAS");
    }

}
