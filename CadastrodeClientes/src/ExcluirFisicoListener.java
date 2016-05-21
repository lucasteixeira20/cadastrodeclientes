


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class ExcluirFisicoListener implements ActionListener {

    private JInternalFrame excluirF;

    public ExcluirFisicoListener(JInternalFrame janela) {
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
