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
public class SomaProduto {

    public static void main(String[] args) {
        double x, y, s, p;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE O VALOR DA PRIMEIRA VARIÁVEL: ");
        x = teclado.nextDouble();
        System.out.print("\nDIGITE O VALOR DA SEGUNDA VARIÁVEL: ");
        y = teclado.nextDouble();
        s = x + y;
        p = x * y;
        System.out.print("\nO VALOR DA SOMA = : " + s);
        System.out.print("\nO VALOR DO PRODUTO = : " + p);
        System.out.print("\nFIM");
    }
}
