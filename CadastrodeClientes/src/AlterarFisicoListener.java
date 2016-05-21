


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class AlterarFisicoListener implements ActionListener {

    private JInternalFrame alterarF;

    public AlterarFisicoListener(JInternalFrame janela) {
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
