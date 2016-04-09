
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventoConsultarJuridico implements ActionListener {

    private JInternalFrame consultapJ;

    public EventoConsultarJuridico(JInternalFrame janela) {
        consultapJ = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("consultar".equals(e.getActionCommand())) {
            System.out.println("salvo");
        } else if ("cancelar".equals(e.getActionCommand())) {
            consultapJ.dispose();
        }
    }

}
