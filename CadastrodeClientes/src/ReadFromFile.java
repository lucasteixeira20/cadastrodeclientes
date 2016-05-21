import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    
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
            ReadFromFile.ler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
