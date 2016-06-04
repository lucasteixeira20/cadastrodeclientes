package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscreverArquivo {
    
    public static void escrever(String mensagem, String logFile) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em quest�o.
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, false);
        int tamanho = 0;
        String msg = mensagem;
        while (tamanho < msg.length()) {
            escritorArquivos.write((int)msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }
    
    public static void main( String[] args ) {
        
        try {
            EscreverArquivo.escrever("Testeeeeeeeeeee", "log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
