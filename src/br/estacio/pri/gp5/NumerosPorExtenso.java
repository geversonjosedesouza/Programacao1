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
public class NumerosPorExtenso {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO ENTRE 0 E 99: ");
        numero = teclado.nextInt();
        while (numero > 0 && numero < 100) {
            imprime += "\nO NÚMERO POR EXTENSO " + numero + " É " + extenso(numero);
            System.out.println(imprime);
            System.exit(0);
        }
    }

    static String extenso(int n) {
        String resultado = "", numeros[] = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        if (n <= 20) {
            resultado = numeros[n];
        } else {
            if (n % 10 == 0) {
                resultado = numeros[(n / 10) + 18];
            } else {
                String r = String.valueOf(n);

                resultado = numeros[(n / 10) + 18] + " e " + numeros[Integer.parseInt(r.substring(1, 2))];
            }
        }
        return resultado;
    }
}
