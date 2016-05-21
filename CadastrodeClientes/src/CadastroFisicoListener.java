import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class CadastroFisicoListener implements ActionListener {

    private JInternalFrame cadastraPF;

    public CadastroFisicoListener(JInternalFrame janela) {
        cadastraPF = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            System.out.println("salvo");
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraPF.dispose();
        }
    }

}
