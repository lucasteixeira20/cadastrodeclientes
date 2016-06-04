package listener;

import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.ConsultarProdutoJIF;
import view.Janela;
import view.ProdutoJIF;

public class ConsultarProdutoListener implements ActionListener {

    private ConsultarProdutoJIF consultaProduto;

    public ConsultarProdutoListener(ConsultarProdutoJIF janela){
        consultaProduto = janela;
    }

    public void actionPerformed(ActionEvent e) {
        if ("consultar".equals(e.getActionCommand())) {
            try {
                SalvaLogs.escrever("Consultar Produto", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
            ProdutoJIF produto = new ProdutoJIF();
            Janela.gerarJIF(produto);
        } else if ("fechar".equals(e.getActionCommand())) {
            consultaProduto.dispose();
        }
    }
}
