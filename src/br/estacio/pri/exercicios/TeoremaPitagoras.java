package br.estacio.pri.exercicios;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class TeoremaPitagoras {

    public TeoremaPitagoras() {
        float rampa, base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o comprimento da base da rampa: ");
        base = sc.nextInt();
        System.out.print("Digite altura da rampa: ");
        altura = sc.nextInt();

        rampa = hipotenusa(base, altura);
        System.out.println("O comprimento da rampa é: " + rampa);

    }

    private float hipotenusa(float catetoA, float catetoB) {
        return (float) Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
}
