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
public class Consorcio {

    public static void main(String[] args) {
        double quantidadeTotalParcelas, quantidadeParcelasPagas, valorPrestacao,
                totalPago, saldoDevedor, parcelasPagas, valorConsorcio, parcelasAPagar;
        String imprimi = "EXTRATO SO CONSORCIADO";
        Scanner teclado = new Scanner(System.in);

        System.out.print("DIGITE QUANTIDADE TOTAL DE PARCELAS: ");
        quantidadeTotalParcelas = teclado.nextDouble();

        System.out.print("\nDIGITE O VALOR DA PRETAÇÃO R$");
        valorPrestacao = teclado.nextDouble();

        System.out.print("\nDIGITE A QUANTIDADE DE PARCELAS PAGAS: ");
        quantidadeParcelasPagas = teclado.nextDouble();

        valorConsorcio = quantidadeTotalParcelas * valorPrestacao;
        imprimi += "\nVALOR TOTAL DO CONSORCIO: R$" + valorConsorcio;

        totalPago = quantidadeParcelasPagas * valorPrestacao;
        imprimi += "\nSALDO PAGO: R$" + totalPago;

        parcelasPagas = quantidadeTotalParcelas - quantidadeParcelasPagas;
        imprimi += "\nQUANTIDADE DE PARCELAS PAGAS: " + parcelasPagas + " PARCELAS";

        saldoDevedor = (quantidadeTotalParcelas * valorPrestacao) - (quantidadeParcelasPagas * valorPrestacao);
        imprimi += "\nSALDO DEVEDOR: R$" + saldoDevedor;

        parcelasAPagar = quantidadeParcelasPagas - quantidadeTotalParcelas;
        imprimi += "\nQUANTIDADE DE PARCELAS A PAGAR: " + parcelasAPagar + " PARCELAS";

        System.out.println(imprimi);
    }
}
