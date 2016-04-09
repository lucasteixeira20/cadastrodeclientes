
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoExcluirJuridico implements ActionListener {

    private JInternalFrame excluirJ;

    public EventoExcluirJuridico(JInternalFrame janela) {
        excluirJ = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("excluir".equals(e.getActionCommand())) {
            System.out.println("excluiu");
        } else if ("cancelar".equals(e.getActionCommand())) {
            excluirJ.dispose();
        }
    }

}
