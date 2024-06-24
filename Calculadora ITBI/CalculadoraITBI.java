import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main (String[] args){
        float valorTransacao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transacao: "));
        float valorVenal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor o venal"));
        float porcentagemImposto = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem de imposto ITBI: "));
        float maiorValor = Math.max(valorTransacao,valorVenal);
        float calculoImposto = maiorValor * (porcentagemImposto/100);

        JOptionPane.showMessageDialog(null, "O valor do imposto ITBI e: " + calculoImposto);

    }
}
