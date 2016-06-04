package validacoes;

import java.awt.event.KeyEvent;

public class ImpedirCaracteres {

    public static void bloquearCaracteres(boolean numeros, boolean letras, String extras, KeyEvent evt) {
        String caracteres = "";
        if (numeros) {
            caracteres += "0987654321";
        }
        if (letras) {
            caracteres += "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        }
        if(extras != null)
        {
            caracteres += extras;
        }
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
}
