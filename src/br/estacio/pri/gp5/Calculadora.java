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
public class Calculadora {

    public static void main(String[] args) {
        String imprime = "ESCOLHA UMA OPÇÃO";
        imprime += "\n1 - SOMAR";
        imprime += "\n2 - SUBTRAIR";
        imprime += "\n3 - MULTIPLICAR";
        imprime += "\n4 - DIVIDIR";
        imprime += "\n5 - FINALIZAR";
        int opcao = 0, numero1, numero2, resultado;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println(imprime);
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("DIGITE O 1º NÚMERO:");
                    numero1 = teclado.nextInt();
                    System.out.println("DIGITE O 2º NÚMERO:");
                    numero2 = teclado.nextInt();
                    System.out.println("O RESULTADO DA SOMA É: " + soma(numero1, numero2));
                    break;
                case 2:
                    System.out.println("DIGITE O 1º NÚMERO:");
                    numero1 = teclado.nextInt();
                    System.out.println("DIGITE O 2º NÚMERO:");
                    numero2 = teclado.nextInt();
                    System.out.println("O RESULTADO DA SUBTRAÇÃO É: " + subtracao(numero1, numero2));
                    break;
                case 3:
                    System.out.println("DIGITE O 1º NÚMERO:");
                    numero1 = teclado.nextInt();
                    System.out.println("DIGITE O 2º NÚMERO:");
                    numero2 = teclado.nextInt();
                    System.out.println("O RESULTADO DA MULTIPLICAÇÃO É: " + multiplicacao(numero1, numero2));
                    break;
                case 4:
                    System.out.println("DIGITE O 1º NÚMERO:");
                    numero1 = teclado.nextInt();
                    System.out.println("DIGITE O 2º NÚMERO:");
                    numero2 = teclado.nextInt();
                    System.out.println("O RESULTADO DA DIVISÃO É: " + divisao(numero1, numero2));
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
            System.out.println(imprime);
        }
    }

    private static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    private static int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    private static int divisao(int numero1, int numero2) {
        return numero1 / numero2;
    }

}
