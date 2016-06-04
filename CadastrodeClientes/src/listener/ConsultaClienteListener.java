package listener;

import files.SalvaLogs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.ConsultarClienteJIF;

public class ConsultaClienteListener implements ActionListener {

    private ConsultarClienteJIF consultaC;

    public ConsultaClienteListener(ConsultarClienteJIF janela) {
        consultaC = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            try {
                SalvaLogs.escrever("Alterou Cliente", "logs.txt", true);
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado!");
            }
        } else if ("excluir".equals(e.getActionCommand())) {
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
