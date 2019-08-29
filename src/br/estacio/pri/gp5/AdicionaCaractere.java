/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pri.gp5;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class AdicionaCaractere {

    public static void main(String[] args) {
        String imprime = "RESULTADO";
        String palavra, letra;
        int numeroVezes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UMA PALAVRA: ");
        palavra = teclado.next();
        System.out.println("DIGITE UMA LETRA: ");
        char letras[] = teclado.next().toCharArray();
        System.out.println("DIGITE A QUANTIDADE DE VEZES QUE DESEJA ADICIONAR A LETRA NA PALAVRA: ");
        numeroVezes = teclado.nextInt();
        imprime += "\nA PALAVRA ANTIGA É " + palavra;
        imprime += "\nA PALAVRA ANTIGA MAIS OS CARACTERES ADICIONADOS É " + adiciona(palavra, letras[0], numeroVezes);
        System.out.println(imprime);
    }

    static String adiciona(String palavra, char letra, int n) {
        for (int i = 0; i < n; i++) {
            palavra += letra;
        }
        return palavra;
    }
}
