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
public class GrausAte200 {

    public static void main(String[] args) {
        double c = 0.00, f;
        while (c <= 200) {
            c += 0.5;
            f = 1.8 * c + 32;
            System.out.println(c + "°C É IGUAL A " + f + "°F");
        }
    }

}
