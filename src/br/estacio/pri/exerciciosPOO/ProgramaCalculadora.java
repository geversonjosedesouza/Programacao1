/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.exerciciosPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author geverson
 */
public class ProgramaCalculadora {

    private static double numero1, numero2, resultado;

    private static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        String menu = "ESCOLHA UMA OPÇÃO:";
        menu += "\n1 - PARA SOMAR: ";
        menu += "\n2 - PARA SUBTRAIR: ";
        menu += "\n3 - PARA MULTIPLICAR: ";
        menu += "\n4 - PARA DIVIDIR: ";
        menu += "\n5 - PARA RAIZ QUADRADA: ";
        menu += "\n6 - PARA POTÊNCIA: ";
        menu += "\n7 - PARA SAIR";
        int opcao = 1;
        while (opcao != 7) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número:"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número:"));
            switch (opcao) {
                case 1:
                    resultado = calculadora.soma(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.subtrair(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
                    break;
                case 5:
                    resultado = calculadora.raiz(numero1);
                    JOptionPane.showMessageDialog(null, "O resultado da raiz quadrada é: " + resultado);
                    break;
                case 6:
                    resultado = calculadora.potencia(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "O resultado da potência é: " + resultado);
                    break;
                            

            }
        }
    }

    //private static void
}
