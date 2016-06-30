package listener;

import DAO.LoginDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarLoginJIF;
import bean.Login;
import javax.swing.JOptionPane;
import view.ExcluirLoginJIF;
import view.Janela;

public class CadastrarLoginListener implements ActionListener {

    private CadastrarLoginJIF cadastraLogin;
    private LoginDAO loginDAO = new LoginDAO();
    private Login login;

    public CadastrarLoginListener(CadastrarLoginJIF janela) {
        cadastraLogin = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            if (cadastraLogin.campoLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um login!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraLogin.campoSenha.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite uma senha!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            login = new Login();
            login.setLogin(cadastraLogin.campoLogin.getText());
            login.setSenha(cadastraLogin.campoSenha.getText());
            try {
                if (loginDAO.verificaLogin(login)) {
                    loginDAO.cadastrar(login);
                    JOptionPane.showMessageDialog(null, "Login cadastrado com Sucesso!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problema ao cadastrar login!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } else if ("excluir".equals(e.getActionCommand())) {
            cadastraLogin.dispose();
            ExcluirLoginJIF excluirLogin = new ExcluirLoginJIF();
            Janela.gerarJIF(excluirLogin);
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraLogin.dispose();
        }
    }
}
