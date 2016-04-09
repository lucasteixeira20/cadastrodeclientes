
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoAlterarFisico implements ActionListener {

    private JInternalFrame alterarF;

    public EventoAlterarFisico(JInternalFrame janela) {
        alterarF = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("alterar".equals(e.getActionCommand())) {
            System.out.println("alterar!!!!!!!!");
        } else if ("cancelar".equals(e.getActionCommand())) {
            alterarF.dispose();
        }
    }

}
