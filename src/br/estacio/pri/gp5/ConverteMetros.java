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
public class ConverteMetros {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        double metro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UMA QUANTIDADE DE METROS: ");
        metro = teclado.nextDouble();
        imprime += "\n" + metro + " CONVERTIDOS EM PÉS: " + pes(metro);
        imprime += "\n" + metro + " CONVERTIDOS EM POLEGADAS: " + polegadas(metro);
        System.out.println(imprime);
    }

    private static double pes(double metro) {
        double resultado = metro * 3.281;
        return resultado;
    }

    private static double polegadas(double metro) {
        double resultado = metro * 39.37;
        return resultado;
    }
}
