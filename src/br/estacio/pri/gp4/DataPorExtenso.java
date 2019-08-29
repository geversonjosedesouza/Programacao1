/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp4;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class DataPorExtenso {

    public static void main(String[] args) {
        String arrayData[] = new String[3], data, imprime = "RESULTADO", meses[] = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTURBO", "NOVEMBRO", "DEZEMBRO"};
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE A DATA DE NASCIMENTO: Ex:28/08/2019");
        data = teclado.next();
        arrayData = data.split("/");
        imprime += "A DATA: " + data + " POR EXTENSO É: " + arrayData[0] + " DE " + meses[Integer.parseInt(arrayData[1]) - 1] + " DE " + arrayData[2];
        System.out.println(imprime);
    }

}
