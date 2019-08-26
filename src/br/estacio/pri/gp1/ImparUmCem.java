/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp1;

/**
 *
 * @author geverson
 */
public class ImparUmCem {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                soma += i;
                System.out.println("O número " + i + " é impar! E a soma dos que foram exibidos até agora é " + soma + "!");
            }
        }
    }
}
