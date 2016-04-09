
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoExcluirFisico implements ActionListener {

    private JInternalFrame excluirF;

    public EventoExcluirFisico(JInternalFrame janela) {
        excluirF = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("excluir".equals(e.getActionCommand())) {
            System.out.println("excluir");
        } else if ("cancelar".equals(e.getActionCommand())) {
            excluirF.dispose();
        }
    }

}
