/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp3;

/**
 *
 * @author geverson
 */
public class ChicoZe {

    public static void main(String[] args) {
        double chico = 1.50, ze = 1.10, crescimentoAnoChico = 2, crescimentoAnoZe = 3;
        int contaAnos = 0;
        String imprimir = "DADOS PESSOAIS INICIAIS";
        imprimir += "\nCHICO";
        imprimir += "\nALTURA: " + chico + "m";
        imprimir += "\nCRESCE POR ANO: " + crescimentoAnoChico + "cm";
        imprimir += "\nZÉ";
        imprimir += "\nALTURA: " + ze + "m";
        imprimir += "\nCRESCE POR ANO: " + crescimentoAnoZe + "cm";
        while (ze <= chico) {
            contaAnos++;
            chico += (crescimentoAnoChico / 100);
            ze += (crescimentoAnoZe / 100);
        }
        imprimir += "\nDADOS PESSOAIS FINAIS";
        imprimir += "\nCHICO";
        imprimir += "\nALTURA: " + chico + "m";
        imprimir += "\nCRESCE POR ANO: " + crescimentoAnoChico + "cm";
        imprimir += "\nZÉ";
        imprimir += "\nALTURA: " + ze + "m";
        imprimir += "\nCRESCE POR ANO: " + crescimentoAnoZe + "cm";
        imprimir += "\nDUROU " + contaAnos + " ANOS PARA ZÉ FICASSE MAIOR QUE CHICO";
        System.out.println(imprimir);
    }

}
