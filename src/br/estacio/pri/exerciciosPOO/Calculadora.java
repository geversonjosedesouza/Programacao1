/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.exerciciosPOO;

/**
 *
 * @author geverson
 */
public class Calculadora {

    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public double potencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double raiz(double numero1) {
        return Math.sqrt(numero1);
    }

    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }
}
