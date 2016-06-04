package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class SalvaLogs {

    public static void escrever(String mensagem, String logFile, boolean trunc) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em quest�o.
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, trunc);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + System.getProperty("line.separator");;
        while (tamanho < msg.length()) {
            escritorArquivos.write((int) msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }

    public static void main(String[] args) {

    }
}
