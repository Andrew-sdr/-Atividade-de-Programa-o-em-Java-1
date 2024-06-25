import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        int tentativas = 3;
        
        while (tentativas > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            
            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido.");
                return;
            } else {
                tentativas--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativas restantes: " + tentativas);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Acesso bloqueado. Entre em contato com o suporte.");
    }
}
