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
public class Imc {

    public static void main(String[] args) {
        String nome;
        char sexo;
        double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE O SEU NOME: ");
        nome = teclado.next();
        System.out.print("\nDIGITE O SEU SEXO: ");
        sexo = (char) teclado.nextShort();
        System.out.print("\nDIGITE O SEU PESO: ");
        peso = teclado.nextDouble();
        System.out.print("\nDIGITE A SUA ALTURA: ");
        altura = teclado.nextDouble();
        imc = peso / Math.pow(altura, altura);
        System.out.print("\nNOME: " + nome);
        System.out.print("\nO SEU IMC É =: " + imc);
        System.out.print("\nFIM");
    }
}
