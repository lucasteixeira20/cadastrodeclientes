package listener;

import DAO.ProdutoDAO;
import bean.Produto;
import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadastrarProdutoJIF;

public class CadastrarProdutoListener implements ActionListener {

    private CadastrarProdutoJIF cadastraProduto;
    private Produto p;
    private ProdutoDAO pDAO = new ProdutoDAO();

    public CadastrarProdutoListener(CadastrarProdutoJIF janela) {
        cadastraProduto = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            if (cadastraProduto.campoEAN.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um código EAN!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraProduto.camponomeProduto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o nome do produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraProduto.campovalor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o valor do produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cadastraProduto.campoqntProduto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite a quantidade em estoque!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            p = new Produto();
            p.setCodEAN(cadastraProduto.campoEAN.getText());
            p.setNome(cadastraProduto.camponomeProduto.getText());
            p.setValor(Float.valueOf(cadastraProduto.campovalor.getText()));
            p.setQuantidade(Integer.parseInt(cadastraProduto.campoqntProduto.getText()));
            
            try {
                pDAO.cadastrar(p);
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                SalvaLogs.escrever("Cadastrar Produto", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraProduto.dispose();
        }
    }
}
