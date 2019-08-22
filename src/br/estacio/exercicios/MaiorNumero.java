package br.estacio.exercicios;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class MaiorNumero {

    public MaiorNumero() {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é " + num1);
        } else if (num1 < num2) {
            System.out.printf("O maior é %d\n", num2);
        } else {
            System.out.println("São iguais.");
        }
    }

}
