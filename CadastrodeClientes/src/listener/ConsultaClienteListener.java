package listener;

import DAO.ClienteFisicoDAO;
import DAO.ClienteJuridicoDAO;
import bean.ClienteFisico;
import bean.ClienteJuridico;
import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.ConsultarClienteJIF;

public class ConsultaClienteListener implements ActionListener {

    private ConsultarClienteJIF consultaC;
    private ClienteFisicoDAO cfDAO = new ClienteFisicoDAO();
    private ClienteJuridicoDAO cjDAO = new ClienteJuridicoDAO();
    private ClienteFisico CF = new ClienteFisico();
    private ClienteJuridico CJ = new ClienteJuridico();
    private int id;

    public ConsultaClienteListener(ConsultarClienteJIF janela) {
        consultaC = janela;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {

            //altera para os novos dados dos campos
            if (consultaC.pessoaFisicaalteracao.isSelected()) {
                try {
                    CF.setNome(consultaC.camponomerazao.getText());
                    CF.setCPF(consultaC.campocpfcnpj.getText());
                    CF.setTelefone(consultaC.campotelefone.getText());
                    CF.setEmail(consultaC.campoemail.getText());
                    cfDAO.setId(id);
                    cfDAO.update(CF);
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                CJ.setNome(consultaC.camponomerazao.getText());
                CJ.setCNPJ(consultaC.campocpfcnpj.getText());
                CJ.setTelefone(consultaC.campotelefone.getText());
                CJ.setEmail(consultaC.campoemail.getText());
                cjDAO.setId(id);
                try {
                    cjDAO.update(CJ);
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Cliente modificado!");
            try {
                SalvaLogs.escrever("Alterou Cliente", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("excluir".equals(e.getActionCommand())) {
            //se for uma pessoa física
            if (consultaC.pessoaFisicaalteracao.isSelected()) {
                try {
                    cfDAO.delete(id);
                    consultaC.camponomerazao.setText("");
                    consultaC.campocpfcnpj.setText("");
                    consultaC.campotelefone.setText("");
                    consultaC.campoemail.setText("");
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    cjDAO.delete(id);
                    consultaC.camponomerazao.setText("");
                    consultaC.campocpfcnpj.setText("");
                    consultaC.campotelefone.setText("");
                    consultaC.campoemail.setText("");
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            consultaC.dispose();
            JOptionPane.showMessageDialog(null, "Cliente excluído!");
            try {
                SalvaLogs.escrever("Excluiu Cliente", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            consultaC.dispose();
        }
    }
}
