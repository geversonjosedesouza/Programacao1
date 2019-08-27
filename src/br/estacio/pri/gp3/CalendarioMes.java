/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp3;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class CalendarioMes {

    public static void main(String[] args) {
        String opcoes = "";
        int mes;
        opcoes += "\n0 - SAIR";
        opcoes += "\n1 - JANEIRO";
        opcoes += "\n2 - FEVEREIRO";
        opcoes += "\n3 - MARÇO";
        opcoes += "\n4 - ABRIL";
        opcoes += "\n5 - MAIO";
        opcoes += "\n6 - JUNHO";
        opcoes += "\n7 - JULHO";
        opcoes += "\n8 - AGOSTO";
        opcoes += "\n9 - SETEMBRO";
        opcoes += "\n10 - OUTUBRO";
        opcoes += "\n11 - NOVEMBRO";
        opcoes += "\n12 - DEXEMBRO";
        opcoes += "\nESCOLHA UMA OPÇÃO: ";
        Scanner teclado = new Scanner(System.in);
        System.out.print(opcoes);
        mes = teclado.nextInt();
        switch (mes) {
            case 0:
                System.exit(0);
                break;
            case 1:
                semana(31);
                break;
            case 2:
                semana(28);
                break;
            case 3:
                semana(31);
                break;
            case 4:
                semana(30);
                break;
            case 5:
                semana(31);
                break;
            case 6:
                semana(30);
                break;
            case 7:
                semana(31);
                break;
            case 8:
                semana(31);
                break;
            case 9:
                semana(30);
                break;
            case 10:
                semana(31);
                break;
            case 11:
                semana(30);
                break;
            case 12:
                semana(31);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
    }

    private static void semana(int quantidadeDias) {
        int cont = 0;
        System.out.println(" D   S   T   Q   Q   S   S ");
        for (int i = 1; i <= quantidadeDias / 7; i++) {
            for (int j = 1; j <= quantidadeDias / 4; j++) {
                cont++;
                if (cont < 10) {
                    System.out.print(" 0" + cont + " ");
                } else {
                    System.out.print(" " + cont + " ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j <= quantidadeDias % 4; j++) {
            cont++;
            System.out.print(" " + cont + " ");
        }
        System.out.println();
    }
}
