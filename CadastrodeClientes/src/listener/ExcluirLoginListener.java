package listener;

import DAO.LoginDAO;
import bean.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.ExcluirLoginJIF;

public class ExcluirLoginListener implements ActionListener {

    private ExcluirLoginJIF excluirLogin;
    private LoginDAO loginDAO = new LoginDAO();
    private Login login;

    public ExcluirLoginListener(ExcluirLoginJIF janela) {
        excluirLogin = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("excluir".equals(e.getActionCommand())) {
            if (excluirLogin.campoLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um login!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (excluirLogin.campoSenha.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite uma senha!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            login = new Login();
            login.setLogin(excluirLogin.campoLogin.getText());
            login.setSenha(excluirLogin.campoSenha.getText());

            try {
                if (loginDAO.verificaLoginSenha(login)) {
                    loginDAO.excluir(login);
                    JOptionPane.showMessageDialog(null, "Login excluido com Sucesso!");
                }
            } catch (Exception ex) {
                Logger.getLogger(ExcluirLoginListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("cancelar".equals(e.getActionCommand())) {
            excluirLogin.dispose();
        }
    }
}
