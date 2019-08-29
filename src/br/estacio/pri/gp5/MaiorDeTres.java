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
public class MaiorDeTres {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        int numero1, numero2, numero3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE PRIMEIRO NÚMERO: ");
        numero1 = teclado.nextInt();
        System.out.println("DIGITE SEGUNDO NÚMERO: ");
        numero2 = teclado.nextInt();
        System.out.println("DIGITE TERCEIRO NÚMERO: ");
        numero3 = teclado.nextInt();
        imprime += "\nO MAIOR NÚMERO É " + maior(numero1, numero2, numero3);
        imprime += "\nO MENOR NÚMERO É " + menor(numero1, numero2, numero3);
        System.out.println(imprime);
    }

    static int maior(int n1, int n2, int n3) {
        int maior = 0;
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else {
            if (n2 > n1 && n2 > n3) {
                maior = n2;
            } else {
                maior = n3;
            }
        }
        return maior;
    }

    static int menor(int n1, int n2, int n3) {
        int menor = 0;
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else {
            if (n2 < n1 && n2 < n3) {
                menor = n2;
            } else {
                menor = n3;
            }
        }
        return menor;
    }
}
