package br.estacio.pri.exerciciosPOO;

import javax.swing.JOptionPane;

public class ProgramaConta {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        int opcao = 1;
        String opcoes
                = "Programa de Conta Corrente\n\n"
                + "1-Criar Conta\n"
                + "2-Depositar Valor\n"
                + "3-Sacar Valor\n"
                + "4-Consultar Saldo\n"
                + "5-Mostrar Histórico\n"
                + "0-Finalizar\n\n"
                + "Digite a opção desejada:";
        
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes,
                    "Exercício de Conta Corrente", JOptionPane.QUESTION_MESSAGE));
            if (opcao == 0) {
                continue;
            }
            
            switch (opcao) {
                case 1:
                    // opção 1
                    conta.criarConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta: ")), JOptionPane.showInputDialog("Digite seu nome:"));
                    break;
                case 2:
                    // opçãoo 2
                    conta.movimentar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do depósito:")), 'c');
                    break;
                case 3:
                    // opção 3
                    conta.movimentar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do saque:")), 'd');
                    break;
                case 4: {
                    // opção 4
                    JOptionPane.showMessageDialog(null, "O saldo da conta é: " + conta.consultarSaldo());
                    break;
                }
                case 5:
                    // opção 5
                    //JOptionPane.showMessageDialog(null, "Histórico da conta: "+);
                    conta.mostrarHistorico();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção Inválida.\nSelecione uma opção do Menu",
                            "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }
        System.out.println("# Fim do Programa #");
        System.out.println("bye...");
    }
    
}
