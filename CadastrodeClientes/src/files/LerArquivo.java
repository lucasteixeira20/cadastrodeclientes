package files;

import java.io.FileInputStream;
import java.io.IOException;

public class LerArquivo {
    
    public static String ler(String logFile) throws IOException {
        FileInputStream leitorArquivos = new FileInputStream(logFile);
        String usuario = "";
        
        int lido = leitorArquivos.read();
        while (lido != -1) {
            usuario += (char)lido;
            lido = leitorArquivos.read();
        }
        leitorArquivos.close();
        
        return usuario;
    }
    
    public static void main( String[] args ) {
        
        try {
            LerArquivo.ler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
