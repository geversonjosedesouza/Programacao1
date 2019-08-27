
import br.estacio.pri.exercicios.MediaNotas;
import br.estacio.pri.exercicios.MaiorNumero;
import br.estacio.pri.exercicios.TeoremaPitagoras;
import javax.swing.JOptionPane;

/**
 *
 * @author geverson
 */
public class Index {

    public static void main(String[] args) {
        String opcoes = "Escolha um exercício a ser executado:";
        opcoes += "\n1 - Maior entre 2 números;";
        opcoes += "\n2 - Calcular a média entre 2 notas;";
        opcoes += "\n3 - Calcular a hipotenusa;";
        Integer opcao = null;
        try {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Escolha de Exercício", JOptionPane.INFORMATION_MESSAGE));
            switch (opcao) {
                case 1:
                    new MaiorNumero();
                    break;
                case 2:
                    new MediaNotas();
                    break;
                case 3:
                    new TeoremaPitagoras();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não existe!", "Opção inválida", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Isto não é um número: " + opcao + "\nErro: " + nfe.getLocalizedMessage(), "Dado inválido", JOptionPane.ERROR_MESSAGE);
        }
    }
}
