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
public class SalarioLiquido {

    public static void main(String[] args) {
        double salarioBruto, salarioLiquido, previdencia, impostoRenda;
        Scanner teclado = new Scanner(System.in);
        String imprimir = "CONTRA CHEQUE";
        System.out.print("DIGITE SEU SALÁRIO BRUTO: R$");
        salarioBruto = teclado.nextDouble();
        previdencia = salarioBruto * 0.085;
        imprimir += "\nDESCONTO DA PREVIDÊNCIA: R$" + previdencia;
        salarioLiquido = salarioBruto - previdencia;
        imprimir += "\nSALÁRIO BRUTO - PREVIDÊNCIA: R$" + salarioLiquido;
        impostoRenda = salarioLiquido * 0.12;
        imprimir += "\nIMPOSTO DE RENDA: R$" + impostoRenda;
        salarioLiquido -= impostoRenda;
        imprimir += "\nSALÁRIO LÍQUIDO: R$" + salarioLiquido;
        System.out.print(imprimir);
    }
}
