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
public class Info {

    public static void main(String[] args) {
        String nomeCompleto, curso;
        long matricula;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE O SEU NOME COMPLETO: ");
        nomeCompleto = teclado.next();
        System.out.print("\nDIGITE O NOME CURSO: ");
        curso = teclado.next();
        System.out.print("\nDIGITE A MATRÍCULA: ");
        matricula = teclado.nextLong();
        System.out.println("\nNOME COMPLETO: " + nomeCompleto + "\nCURSO: " + curso + "\nMATRÍCULA: " + matricula);
    }
}
