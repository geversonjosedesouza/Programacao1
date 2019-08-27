/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp3;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class VerificaIntervalos {

    public static void main(String[] args) {
        int cont = 0, numero = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("DIGITE UM NÚMERO A SER VERIFICADO: ");
            numero = teclado.nextInt();
            if (numero > 0 && numero < 25) {
                cont++;
            } else if (numero > 26 && numero < 50) {
                cont++;
            } else if (numero > 51 && numero < 75) {
                cont++;
            } else if (numero > 76 && numero < 100) {
                cont++;
            }
        } while (numero >= 0);
        System.out.println("OS NÚMEROS DIGITADOS " + cont + " ESTIVERAM ENTRE OS INTEVALOS [0.25], [26,50], [51,75] e [76,100]");
    }
}
