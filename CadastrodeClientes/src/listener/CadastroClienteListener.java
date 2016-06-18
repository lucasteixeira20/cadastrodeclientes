package listener;

import bean.ClienteFisico;
import bean.ClienteJuridico;
import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.CadastrarClienteJIF;
import view.ConsultarClienteJIF;
import view.Janela;

public class CadastroClienteListener implements ActionListener {

    private CadastrarClienteJIF cadastraC;
    private ClienteFisico CF = new ClienteFisico();
    private ClienteJuridico CJ = new ClienteJuridico();

    public CadastroClienteListener(CadastrarClienteJIF janela) {
        cadastraC = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            try {
                SalvaLogs.escrever("Cliente Cadastrado", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }

            if (cadastraC.pessoaFisica.hasFocus()) {
                //Salva dados no objeto bean
                CF.setNome(cadastraC.camponomerazao.getText());
                CF.setCPF(cadastraC.campocpfcnpj.getText());
                CF.setTelefone(cadastraC.campotelefone.getText());
                CF.setEmail(cadastraC.campoemail.getText());
            } else {
                CJ.setNome(cadastraC.camponomerazao.getText());
                CJ.setCNPJ(cadastraC.campocpfcnpj.getText());
                CJ.setTelefone(cadastraC.campotelefone.getText());
                CJ.setEmail(cadastraC.campoemail.getText());
            }
            //Cadastra cliente no banco
            
            

        } else if ("consultar".equals(e.getActionCommand())) {
            try {
                SalvaLogs.escrever("Consulta Cliente", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
            ConsultarClienteJIF consultaC = new ConsultarClienteJIF();
            Janela.gerarJIF(consultaC);
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraC.dispose();
        }
    }
}
