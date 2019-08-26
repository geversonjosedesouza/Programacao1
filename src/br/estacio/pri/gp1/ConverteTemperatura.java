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
public class ConverteTemperatura {

    public static void main(String[] args) {
        double c, f;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE A TEMPERATUTA EM GRAUS CELCIUS: ");
        c = teclado.nextDouble();
        f = 1.8 * c + 32;
        System.out.println(c + "°C É IGUAL A " + f + "°F");
    }

}
