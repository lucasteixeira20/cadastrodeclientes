package listener;

import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.ProdutoJIF;

public class ProdutoListener implements ActionListener {

    private ProdutoJIF consultaProduto;

    public ProdutoListener(ProdutoJIF janela) {
        consultaProduto = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            try {
                SalvaLogs.escrever("Alterou dados do Produto", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("fechar".equals(e.getActionCommand())) {
            consultaProduto.dispose();
        }
    }
}
