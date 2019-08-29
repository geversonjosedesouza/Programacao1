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
public class Emprestimo {

    public static void main(String[] args) {
        double valorEmprestimo, quantidadeParcela, valorSalario, resultado;
        String mensagem;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE O VALOR DO SEU SALÁRIO: ");
        valorSalario = teclado.nextDouble();
        System.out.print("\nDIGITE O VALOR DO EMPRÉSTIMO: ");
        valorEmprestimo = teclado.nextInt();
        System.out.print("\nDIGITE A QUANTIDADE DE PARCELAS: ");
        quantidadeParcela = teclado.nextInt();
        resultado = (valorEmprestimo / quantidadeParcela);
        if (resultado < (valorSalario * 0.3)) {
            mensagem = "EMPRÉSTIMO CONCEDIDO!";
            mensagem += "\nSALÁRIO: " + valorSalario;
            mensagem += "\nVALOR DO EMPRÉSTIMO: " + valorEmprestimo;
            mensagem += "\nQUANTIDADE DE PARCELAS: " + quantidadeParcela;
            mensagem += "\nVALOR DAS PARCELAS: " + resultado;
        } else {
            mensagem = "EMPRÉSTIMO NÃO CONCEDIDO!";
            mensagem += "\nSALÁRIO: " + valorSalario;
            mensagem += "\nVALOR DO EMPRÉSTIMO: " + valorEmprestimo;
            mensagem += "\nQUANTIDADE DE PARCELAS: " + quantidadeParcela;
            mensagem += "\nVALOR DAS PARCELAS: " + resultado;
        }
        System.out.println(mensagem);
    }
}
