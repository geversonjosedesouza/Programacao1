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
public class DiferencaMaiorMenor {

    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        numero1 = teclado.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.println("O NÚMERO " + numero1 + " É MAIOR QUE O NÚMERO " + numero2);
        } else {
            resultado = numero2 - numero1;
            System.out.println("O NÚMERO " + numero2 + " É MAIOR QUE O NÚMERO " + numero1);
        }
        System.out.println("A DIFERENÇA DO MAIOR PARA O MENOR É " + resultado);
    }

}
