
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoAlterarJuridico implements ActionListener {

    private JInternalFrame alterarJ;

    public EventoAlterarJuridico(JInternalFrame janela) {
        alterarJ = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("alterar".equals(e.getActionCommand())) {
            System.out.println("alterar!!!!!!!!");
        } else if ("cancelar".equals(e.getActionCommand())) {
            alterarJ.dispose();
        }
    }

}
