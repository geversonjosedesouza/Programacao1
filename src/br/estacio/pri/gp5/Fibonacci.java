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
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(sequecia());
    }

    static String sequecia() {
        String resultado = "";
        int fibo[] = new int[6];
        for (int i = 0; i < fibo.length; i++) {
            if (i <= 2) {
                fibo[i] = i;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        for (int i = 0; i < fibo.length; i++) {
            if (i > 0) {
                resultado += "| " + fibo[i] + " ";
            }
        }
        return resultado;
    }
}
