/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

import java.util.Random;

/**
 *
 * @author geverson
 */
public class JuntaVertoresAB {

    public static void main(String[] args) {
        int a[] = new int[10], b[] = new int[15], c[] = new int[25];
        Random gerador = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gerador.nextInt();
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = gerador.nextInt();
            c[i + 10] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("VALOR DA POSIÇÃO " + i + " = " + c[i]);
        }
    }
}
