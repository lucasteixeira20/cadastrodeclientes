package listener;

import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.CadastrarProdutoJIF;

public class CadastrarProdutoListener implements ActionListener {

    private CadastrarProdutoJIF cadastraProduto;

    public CadastrarProdutoListener(CadastrarProdutoJIF janela) {
        cadastraProduto = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cadastrar".equals(e.getActionCommand())) {
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
