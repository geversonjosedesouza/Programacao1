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
public class ProgramaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome(JOptionPane.showInputDialog("Digite o nome da 1º pessoa: "));
        p1.setSexo(JOptionPane.showInputDialog("Digite o sexo da 1º pessoa: ").charAt(0));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1º pessoa: ")));
        p1.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da 1º pessoa: ")));

        Pessoa p2 = new Pessoa();
        p2.setNome(JOptionPane.showInputDialog("Digite o nome da 2º pessoa: "));
        p2.setSexo(JOptionPane.showInputDialog("Digite o sexo da 2º pessoa: ").charAt(0));
        p2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2º pessoa: ")));
        p2.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da 2º pessoa: ")));

        float imcP1 = (float) (p1.getPeso() / Math.pow(p1.getAltura(), 2));
        JOptionPane.showMessageDialog(null, "Dados d 1º pessoa \nNome: " + p1.getNome() + "\nSexo: " + p1.getSexo() + "\nIdade: " + p1.getIdade() + "\nPeso: " + p1.getPeso() + "\nIMC: " + imcP1);

        float imcP2 = (float) (p2.getPeso() / Math.pow(p2.getAltura(), 2));
        JOptionPane.showMessageDialog(null, "Dados d 2º pessoa \nNome: " + p2.getNome() + "\nSexo: " + p2.getSexo() + "\nIdade: " + p2.getIdade() + "\nPeso: " + p2.getPeso() + "\nIMC: " + imcP2);
    }

}
