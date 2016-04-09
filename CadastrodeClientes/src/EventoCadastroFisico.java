
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoCadastroFisico implements ActionListener {

    private JInternalFrame cadastraPF;

    public EventoCadastroFisico(JInternalFrame janela) {
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
