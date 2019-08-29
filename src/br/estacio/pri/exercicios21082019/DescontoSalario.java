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
public class DescontoSalario {

    public static void main(String[] args) {
        double salarios[] = new double[3];
        double total = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < salarios.length; i++) {
            int f = i + 1;
            System.out.print("\nDIGITE O SALÁRIO DO FUNCIONÁRIO " + f + ":");
            salarios[i] = teclado.nextDouble();
        }
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] <= 500.00) {
                salarios[i] -= 60.00;
            }
            if (salarios[i] >= 500.00) {
                salarios[i] -= 90.00;
            }
            total += salarios[i];
        }
        System.out.println("\nO VALOR DA FOLHA SALARIAL LIQUIDA É =: " + total);
    }

}
