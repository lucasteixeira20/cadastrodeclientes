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
import view.ConsultarProdutoJIF;
import view.Janela;
import view.ProdutoJIF;

public class ConsultarProdutoListener implements ActionListener {

    private ConsultarProdutoJIF consultaProduto;
    private Produto p;
    private ProdutoDAO pDAO = new ProdutoDAO();

    public ConsultarProdutoListener(ConsultarProdutoJIF janela) {
        consultaProduto = janela;
    }

    public void actionPerformed(ActionEvent e) {
        if ("consultar".equals(e.getActionCommand())) {
            if (consultaProduto.campoEAN.getText().equals("") && consultaProduto.camponomeProduto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha um dos campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            p = new Produto();
            p.setCodEAN(consultaProduto.campoEAN.getText());
            p.setNome(consultaProduto.camponomeProduto.getText());

            try {
                p = pDAO.getProduto(p);
                if (p == null) {
                    JOptionPane.showMessageDialog(null, "Este produto não existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                consultaProduto.dispose();
                ProdutoJIF consultaP = new ProdutoJIF();
                consultaP.setProduto(p);
                Janela.gerarJIF(consultaP);

            } catch (Exception ex) {
                Logger.getLogger(CadastrarProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                SalvaLogs.escrever("Consultar Produto", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            consultaProduto.dispose();
        }
    }
}
