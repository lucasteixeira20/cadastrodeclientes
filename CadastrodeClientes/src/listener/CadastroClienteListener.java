package listener;

import bean.ClienteFisico;
import bean.ClienteJuridico;
import DAO.ClienteFisicoDAO;
import DAO.ClienteJuridicoDAO;
import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.CadastrarClienteJIF;
import view.ConsultarClienteJIF;
import view.Janela;

public class CadastroClienteListener implements ActionListener {

    private CadastrarClienteJIF cadastraC;
    private ClienteFisico CF = new ClienteFisico();
    private ClienteJuridico CJ = new ClienteJuridico();
    private ClienteFisicoDAO cfDAO = new ClienteFisicoDAO();
    private ClienteJuridicoDAO cjDAO = new ClienteJuridicoDAO();

    public CadastroClienteListener(CadastrarClienteJIF janela) {
        cadastraC = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            if (!cadastraC.pessoaFisica.isSelected() && !cadastraC.pessoaJuridica.isSelected()) {
                JOptionPane.showMessageDialog(null, "Selecione pessoa física ou jurídica!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraC.camponomerazao.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um Nome ou Razão Social!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraC.campocpfcnpj.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um CPF ou CNPJ!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraC.campotelefone.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um Telefone!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraC.campoemail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um Email!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (cadastraC.pessoaFisica.isSelected()) {
                //Salva dados no objeto bean
                CF.setNome(cadastraC.camponomerazao.getText());
                CF.setCPF(cadastraC.campocpfcnpj.getText());
                CF.setTelefone(cadastraC.campotelefone.getText());
                CF.setEmail(cadastraC.campoemail.getText());

                try {
                    cfDAO.insert(CF);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente físico!");
                }
            } else {
                CJ.setNome(cadastraC.camponomerazao.getText());
                CJ.setCNPJ(cadastraC.campocpfcnpj.getText());
                CJ.setTelefone(cadastraC.campotelefone.getText());
                CJ.setEmail(cadastraC.campoemail.getText());

                try {
                    cjDAO.insert(CJ);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente jurídico!");
                }
            }

            try {
                SalvaLogs.escrever("Cliente Cadastrado", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso!");

        } else if ("consultar".equals(e.getActionCommand())) {
            if (cadastraC.camponomerazao.getText().equals("") && cadastraC.campocpfcnpj.getText().equals("") && cadastraC.campotelefone.getText().equals("") && cadastraC.campoemail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha um dos campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ArrayList<String> DadosConsulta = new ArrayList();
            DadosConsulta.add(cadastraC.camponomerazao.getText());
            DadosConsulta.add(cadastraC.campotelefone.getText());
            DadosConsulta.add(cadastraC.campoemail.getText());
            DadosConsulta.add(cadastraC.campocpfcnpj.getText());

            CF = cfDAO.getCliente(DadosConsulta);

            //se encontrar um cliente físico
            if (CF != null) {
                ConsultarClienteJIF consultaC = new ConsultarClienteJIF();
                consultaC.camponomerazao.setText(CF.getNome());
                consultaC.campocpfcnpj.setText(CF.getCPF());
                consultaC.campotelefone.setText(CF.getTelefone());
                consultaC.campoemail.setText(CF.getEmail());
                consultaC.pessoaFisicaalteracao.setSelected(true);
                Janela.gerarJIF(consultaC);
                try {
                    SalvaLogs.escrever("Consulta Cliente", "logs.txt", true);
                } catch (IOException ex) {
                    System.out.println("Arquivo não encontrado!");
                }
                return;
            }
            
            CJ = cjDAO.getCliente(DadosConsulta);
            if (CJ != null) {
                ConsultarClienteJIF consultaC = new ConsultarClienteJIF();
                consultaC.camponomerazao.setText(CJ.getNome());
                consultaC.campocpfcnpj.setText(CJ.getCNPJ());
                consultaC.campotelefone.setText(CJ.getTelefone());
                consultaC.campoemail.setText(CJ.getEmail());
                consultaC.pessoaJuridicaalteracao.setSelected(true);
                Janela.gerarJIF(consultaC);
                try {
                    SalvaLogs.escrever("Consulta Cliente", "logs.txt", true);
                } catch (IOException ex) {
                    System.out.println("Arquivo não encontrado!");
                }
                return;
            }
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraC.dispose();
        }
    }
}
