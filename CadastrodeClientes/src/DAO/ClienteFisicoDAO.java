package DAO;

import bean.Cliente;
import bean.ClienteFisico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

public class ClienteFisicoDAO {
    
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void delete(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from clientefisico where codigocliente = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
            sql = "delete from clientes where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
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

    public void insert(ClienteFisico cliente) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into Clientes (nome, telefone, email) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
            ps.execute();

            sql = "insert into ClienteFisico (CodigoCliente, cpf) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, getIdCliente());
            ps.setString(2, cliente.getCPF());
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

    public void update(ClienteFisico cliente) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update ClienteFisico set cpf = ? where codigocliente = ?";

            ps = conn.prepareStatement(sql);
            
            ps.setString(1, cliente.getCPF());
            ps.setInt(2, id);
            ps.execute();
            
            sql = "update clientes set nome = ?, telefone = ?, email = ? where id = ?";
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
            ps.setInt(4, id);
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

    public ArrayList<Cliente> getAll() throws Exception {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome, endereco, telefone from agenda";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String nome = rs.getString(1);
                String Telefone = rs.getString(2);
                String Email = rs.getString(3);

                Cliente cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setTelefone(Telefone);
                cliente.setEmail(Email);
                lista.add(cliente);
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
        return lista;
    }

    public ClienteFisico getCliente(ArrayList<String> DadosConsulta) {
        Connection conn = null;
        PreparedStatement ps = null;
        id = -1;
        String nome = null, telefone = null, email = null, cpf = null;
        String campos[] = {"nome", "telefone", "email"};
        String condicoes = "";
        String sql;
        ResultSet rs;
        try {
            conn = Conexao.getConnection();

            if (!DadosConsulta.get(0).equals("") || !DadosConsulta.get(1).equals("") || !DadosConsulta.get(2).equals("")) {
                for (int i = 0; i < 3; i++) {
                    if (!DadosConsulta.get(i).equals("")) {
                        if (condicoes.equals("")) {
                            condicoes += "where " + campos[i] + " = '" + DadosConsulta.get(i) + "'";
                        } else {
                            condicoes += " AND " + campos[i] + " = '" + DadosConsulta.get(i) + "'";
                        }
                    }
                }
                sql = "select id, nome, telefone, email from clientes " + condicoes;

                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    id = rs.getInt(1);
                    nome = rs.getString(2);
                    telefone = rs.getString(3);
                    email = rs.getString(4);
                }

                if (nome == null) {
                    return null;
                }

                //se informou cpf
                if (!DadosConsulta.get(3).equals("")) {
                    condicoes = " AND cpf = ?";
                } else {
                    condicoes = "";
                }
                sql = "select CodigoCliente, cpf from clientefisico where CodigoCliente = ?" + condicoes;
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                if (!condicoes.equals("")) {
                    ps.setString(2, DadosConsulta.get(3));
                }
            } else {
                sql = "select CodigoCliente, cpf from clientefisico where cpf = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, DadosConsulta.get(3));
            }

            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                cpf = rs.getString(2);
            }

            if (cpf == null) {
                return null;
            }

            //apenas informou cpf
            if (DadosConsulta.get(0).equals("") && DadosConsulta.get(1).equals("") && DadosConsulta.get(2).equals("")) {
                sql = "select nome, telefone, email from clientes where id = ?";

                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);

                rs = ps.executeQuery();
                if (rs.next()) {
                    nome = rs.getString(1);
                    telefone = rs.getString(2);
                    email = rs.getString(3);
                }
            }

            ClienteFisico cliente = new ClienteFisico();
            cliente.setNome(nome);
            cliente.setCPF(cpf);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            return cliente;
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

    //retorna o ultimo id cadastrado
    public int getIdCliente() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "SELECT TOP 1 id FROM Clientes ORDER BY id DESC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
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
        return -1;
    }
    
    //verifica se já existe este cliente físico
    public boolean verificaClienteFisico(ClienteFisico CF) {
        Connection conn = null;
        PreparedStatement ps = null;
        String nome = null, cpf = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome from clientes where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, CF.getNome());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                nome = rs.getString(1);
            }
            
            sql = "select cpf from clientefisico where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, CF.getCPF());
            rs = ps.executeQuery();

            if (rs.next()) {
                cpf = rs.getString(1);
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
        if (nome != null) {
            JOptionPane.showMessageDialog(null, "Cliente "+nome+" já existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cpf != null) {
            JOptionPane.showMessageDialog(null, "Este CPF: "+cpf+" já existe!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
