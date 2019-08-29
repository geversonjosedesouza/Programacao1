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
public class Salario {

    public static void main(String[] args) {
        double salarioMinimo, valorTotalVendas, salario;
        int quantidadeCarroVendido;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIGITE O VALOR DO SALÁRIO MINÍMO: ");
        salarioMinimo = teclado.nextDouble();
        System.out.print("\nDIGITE A QUANTIDADE DE CARROS QUE VOCÊ VENDEU: ");
        quantidadeCarroVendido = teclado.nextInt();
        System.out.print("\nDIGITE O VALOR TOTAL DAS VENDAS RELALIZADSA POR VOCÊ: ");
        valorTotalVendas = teclado.nextInt();
        System.out.print("\nDIGITE SEU NOME: ");
        nome = teclado.next();
        salario = (salarioMinimo * 2) + (quantidadeCarroVendido * 150.00) + (valorTotalVendas * 0.05);
        System.out.print("\nNOME: " + nome);
        System.out.print("\nO SEU SALÁRIO É =: " + salario);
        System.out.print("\nFIM");
    }

}
