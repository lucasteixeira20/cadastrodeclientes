
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoConsultarFisico implements ActionListener {

    private JInternalFrame consultapF;

    public EventoConsultarFisico(JInternalFrame janela) {
        consultapF = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("consultar".equals(e.getActionCommand())) {
            System.out.println("salvo");
        } else if ("cancelar".equals(e.getActionCommand())) {
            consultapF.dispose();
        }
    }

}
