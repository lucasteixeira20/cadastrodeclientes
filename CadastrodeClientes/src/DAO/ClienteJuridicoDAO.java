package DAO;

import bean.Cliente;
import bean.ClienteFisico;
import bean.ClienteJuridico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteJuridicoDAO {

    public void delete(ClienteFisico cliente) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from agenda where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
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

    public void insert(ClienteJuridico cliente) throws Exception {
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

            sql = "insert into ClienteJuridico (CodigoCliente, cnpj) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, getIdCliente());
            ps.setString(2, cliente.getCNPJ());
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

    public void update(Cliente cliente) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update agenda set nome = ?, endereco = ?, telefone = ? where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
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

    public ClienteJuridico getCliente(ArrayList<String> DadosConsulta) {
        Connection conn = null;
        PreparedStatement ps = null;
        int id = -1;
        String nome = null, telefone = null, email = null, cnpj = null;
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

                //se informou cnpj
                if (!DadosConsulta.get(3).equals("")) {
                    condicoes = " AND cnpj = ?";
                } else {
                    condicoes = "";
                }
                sql = "select CodigoCliente, cnpj from clientejuridico where CodigoCliente = ?" + condicoes;
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                if (!condicoes.equals("")) {
                    ps.setString(2, DadosConsulta.get(3));
                }
            } else {
                sql = "select CodigoCliente, cnpj from clientejuridico where cnpj = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, DadosConsulta.get(3));
            }

            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                cnpj = rs.getString(2);
            }

            if (cnpj == null) {
                return null;
            }

            //apenas informou cnpj
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

            ClienteJuridico cliente = new ClienteJuridico();
            cliente.setNome(nome);
            cliente.setCNPJ(cnpj);
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
    
    //obtem o ultimo id cadastrado
    public int getIdCliente() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            //String sql = "select codigo, descricao from produtos where codigo = ?";
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
}
