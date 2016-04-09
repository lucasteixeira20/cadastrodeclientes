
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoCadastroJuridico implements ActionListener {

    private JInternalFrame cadastraPJ;

    public EventoCadastroJuridico(JInternalFrame janela) {
        cadastraPJ = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            System.out.println("salvo");
        } else if ("cancelar".equals(e.getActionCommand())) {
            cadastraPJ.dispose();
        }
    }

}
