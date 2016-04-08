
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class EventosJanela implements ActionListener {

    private Janela jan;

    public EventosJanela(Janela jan) {
        this.jan = jan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jan.getmenupessoafisica()) {
            mostrarJanela(jan.getcadastrarPF());
        } else if (e.getSource() == jan.getmenupessoajuridica()) {
            mostrarJanela(jan.getcadastrarPJ());
        } else if (e.getSource() == jan.getmenuconsultarfisico()) {
            mostrarJanela(jan.getconsultaPF());
        } else if (e.getSource() == jan.getmenuconsultarjuridico()) {
            mostrarJanela(jan.getconsultaPJ());
        } else if (e.getSource() == jan.getmenuexcluirclienteFi()) {
            mostrarJanela(jan.getexcluirPF());
        } else if (e.getSource() == jan.getmenuexcluirclienteJu()) {
            mostrarJanela(jan.getexcluirPJ());
        }
    }

    public void mostrarJanela(JInternalFrame janela) {
        // Centralizar janela
        janela.setLocation(jan.getWidth() / 2 - janela.getWidth() / 2, jan.getHeight() / 2 - janela.getHeight() / 2);
        // Tornar janela visível
        janela.setVisible(true);
    }
}
