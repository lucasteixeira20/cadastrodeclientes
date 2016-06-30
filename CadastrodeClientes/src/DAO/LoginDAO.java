package DAO;

import bean.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {

    public void excluir(Login login) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from login where login = ? and senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
            ps.setString(2, login.getSenha());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
    
    public boolean verificaLoginSenha(Login login) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String loginStr = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select login from login where login = ? AND senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
            ps.setString(2, login.getSenha());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                loginStr = rs.getString(1);
            }
            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        if (loginStr != null) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos!", "Erro!", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean verificaLogin(Login login) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String loginStr = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select login from login where login = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                loginStr = rs.getString(1);
            }
            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        if (loginStr != null) {
            JOptionPane.showMessageDialog(null, "Este Login já existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void cadastrar(Login login) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into login (login, senha) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
            ps.setString(2, login.getSenha());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
