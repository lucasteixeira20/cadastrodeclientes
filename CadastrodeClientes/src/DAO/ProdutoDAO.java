package DAO;

import bean.Login;
import bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    public void update(Produto p, String EAN) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update produto set ean = ?, nome = ?, valor = ?, quantidade = ? where ean = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodEAN());
            ps.setString(2, p.getNome());
            ps.setFloat(3, p.getValor());
            ps.setInt(4, p.getQuantidade());
            ps.setString(5, EAN);
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
    
    public Produto getProduto(Produto p) {
        Connection conn = null;
        PreparedStatement ps = null;
        String condicao = "";
        if (!p.getCodEAN().equals("")) {
            condicao = "where ean = ?";
        } else if (!p.getNome().equals("")) {
            condicao = "where nome = ?";
        } else {
            condicao = "where ean = ? and nome = ?";
        }
        try {
            conn = Conexao.getConnection();
            String sql = "select ean, nome, valor, quantidade from produto " + condicao;
            ps = conn.prepareStatement(sql);
            if (!p.getCodEAN().equals("")) {
                ps.setInt(1, Integer.parseInt(p.getCodEAN()));
            } else if (!p.getNome().equals("")) {
                ps.setString(1, p.getNome());
            } else {
                ps.setInt(1, Integer.parseInt(p.getCodEAN()));
                ps.setString(2, p.getNome());
            }
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String ean = rs.getString(1);
                String nome = rs.getString(2);
                float valor = rs.getFloat(3);
                int quantidade = rs.getInt(4);
                Produto produto = new Produto();
                produto.setCodEAN(ean);
                produto.setNome(nome);
                produto.setValor(valor);
                produto.setQuantidade(quantidade);
                return produto;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return null;
    }

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

    public void cadastrar(Produto p) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into produto (ean, nome, valor, quantidade) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodEAN());
            ps.setString(2, p.getNome());
            ps.setFloat(3, p.getValor());
            ps.setInt(4, p.getQuantidade());
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
