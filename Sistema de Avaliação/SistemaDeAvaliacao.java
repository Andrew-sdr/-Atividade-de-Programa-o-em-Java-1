import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args){
        float notaP1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1: "));
        float notaP2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2: "));
        float trabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho: "));

        float media = (notaP1 + notaP2 + trabalho) / 3;
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "A sua media e: " + media + ". Voce foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "A sua media e: " + media + ". Voce foi Reprovado.");
        }
    }
}
