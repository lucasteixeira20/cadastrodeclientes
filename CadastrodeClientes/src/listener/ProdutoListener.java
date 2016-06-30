package listener;

import DAO.ProdutoDAO;
import bean.Produto;
import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import view.ProdutoJIF;

public class ProdutoListener implements ActionListener {

    private ProdutoJIF consultaProduto;
    private Produto p;
    private ProdutoDAO pDAO = new ProdutoDAO();
    
    public ProdutoListener(ProdutoJIF janela) {
        consultaProduto = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            String EAN = p.getCodEAN();
            
            p = new Produto();
            p.setCodEAN(consultaProduto.campoEAN.getText());
            p.setNome(consultaProduto.camponomeProduto.getText());
            p.setValor(Float.parseFloat(consultaProduto.campovalor.getText()));
            p.setQuantidade(Integer.parseInt(consultaProduto.campoqntProduto.getText()));
            
            pDAO.update(p,EAN);
            
            JOptionPane.showMessageDialog(null, "Produto alterado!");
            try {
                SalvaLogs.escrever("Alterou dados do Produto", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            consultaProduto.dispose();
        }
    }

    public void setProduto(Produto p) {
        this.p = p;
    }
}
