package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/cadastroClientes", "sa", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "O driver não foi configurado corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return conn;
    }
}
