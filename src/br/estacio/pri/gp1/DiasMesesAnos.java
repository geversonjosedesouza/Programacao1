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
public class DiasMesesAnos {

    public static void main(String[] args) {
        int d, m, a, entrada;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE O(S) DIA(S): ");
        entrada = teclado.nextInt();
        a = entrada / 365;
        m = (entrada % 365) / 30;
        d = (entrada % 365) % 30;
        System.out.println("O VALOR DE " + d + "DIAS(S)" + ", CONVERTIDOS EM ANO(S), MES(ES) E DIA(S) É " + a + " ANO(S), " + m + " MES(ES) E " + d + " DIA(S)");
    }
}
