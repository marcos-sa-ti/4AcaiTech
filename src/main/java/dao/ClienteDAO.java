package dao;

import connection.ConnectionFactory;
import data.ClienteData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Android
 */
public class ClienteDAO {
    public boolean cadastraCliente(ClienteData c){
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlCliente = "INSERT INTO `cliente`(nome, cpf, datanascimento, telefone, email, senha, endereco, numeroend, complemento, cep, cidade, estado, nometitular, numerocartao, codigoseg) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmtCliente = connection.prepareStatement(sqlCliente);
            pstmtCliente.setString(1, c.getNome());
            pstmtCliente.setString(2, c.getCpf());
            pstmtCliente.setString(3,c.getDatan());
            pstmtCliente.setString(4, c.getTelefone());
            pstmtCliente.setString(5, c.getEmail());
            pstmtCliente.setString(6, c.getSenha());
            pstmtCliente.setString(7, c.getEndereco());
            pstmtCliente.setString(8, c.getNumerocasa());
            pstmtCliente.setString(9, c.getComplemento());
            pstmtCliente.setString(10, c.getCep());
            pstmtCliente.setString(11, c.getCidade());
            pstmtCliente.setString(12, c.getEstado());
            pstmtCliente.setString(13, c.getNomet());
            pstmtCliente.setString(14, c.getNumeroc());
            pstmtCliente.setString(15, c.getCodsegcartao());
            
            pstmtCliente.executeUpdate();

            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados cadastraCliente: " + ex);
            deuCerto = false;
        }
        return deuCerto;
    }

    public boolean alterarCliente(ClienteData c) {
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlCliente = "UPDATE `cliente` SET `nome`=?, `cpf`=?, `email`=?, `endereco`=?, `cep`=?, `telefone`=?, `celular`=?, 'cidade'=?, 'estado'=?, 'nometitular'=?, 'numerocartao'=?, 'senha'=? WHERE `id`=?";
            PreparedStatement pstmtCliente = connection.prepareStatement(sqlCliente);
            pstmtCliente.setString(1, c.getNome());
            pstmtCliente.setString(2, c.getCpf());
            pstmtCliente.setString(3, c.getEmail());
            pstmtCliente.setString(4, c.getEndereco());
            pstmtCliente.setString(5, c.getCep());
            pstmtCliente.setString(6, c.getTelefone());
            pstmtCliente.setString(8, c.getCidade());
            pstmtCliente.setString(9, c.getEstado());
            pstmtCliente.setString(10, c.getNomet());
            pstmtCliente.setString(11, c.getNumeroc());
            pstmtCliente.setString(12, c.getSenha());
            pstmtCliente.setInt(13, c.getId());
            int deuCertoSQL = pstmtCliente.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }

            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados alterarCliente:" + ex);
            deuCerto = false;
        }
        return deuCerto;
    }

    public ArrayList<ClienteData> getClientes() {
        ArrayList<ClienteData> listaCliente = new ArrayList<>();
        try {
            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cliente` order by id desc");

            while (rs.next()) {
                ClienteData c = new ClienteData();
                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                c.setCep(rs.getString("CEP"));
                c.setCpf((rs.getString("CPF")));
                c.setEmail(rs.getString("EMAIL"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setCidade(rs.getString("CIDADE"));
                c.setEstado(rs.getString("ESTADO"));
                c.setNomet(rs.getString("NOMETITULAR"));
                c.setNumeroc(rs.getString("NUMEROCARTAO"));
                c.setSenha(rs.getString("SENHA"));
                listaCliente.add(c);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados getClientes:" + ex);
        }

        return listaCliente;
    }

    public ArrayList<ClienteData> getClienteByNome(String nome) {
        ArrayList<ClienteData> listaCliente = new ArrayList<>();
        try {
            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cliente` WHERE NOME LIKE '%" + nome + "%'order by id desc");

            while (rs.next()) {
                ClienteData c = new ClienteData();
                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                c.setCep(rs.getString("CEP"));
                c.setCpf((rs.getString("CPF")));
                c.setEmail(rs.getString("EMAIL"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setCidade(rs.getString("CIDADE"));
                c.setEstado(rs.getString("ESTADO"));
                c.setNomet(rs.getString("NOMETITULAR"));
                c.setNumeroc(rs.getString("NUMEROCARTAO"));
                c.setSenha(rs.getString("SENHA"));
                listaCliente.add(c);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados getClienteByNome: " + ex);
        }

        return listaCliente;
    }

    public ClienteData getClienteByCpf(String cpf) {
        ClienteData c = new ClienteData();
        try {

            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cliente` WHERE CPF = '" + cpf + "'");

            while (rs.next()) {
                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                c.setCep(rs.getString("CEP"));
                c.setCpf((rs.getString("CPF")));
                c.setEmail(rs.getString("EMAIL"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setCidade(rs.getString("CIDADE"));
                c.setEstado(rs.getString("ESTADO"));
                c.setNomet(rs.getString("NOMETITULAR"));
                c.setNumeroc(rs.getString("NUMEROCARTAO"));
                c.setSenha(rs.getString("SENHA"));

            }

            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados getClienteByCpf:" + ex);
        }
        System.out.println(c.getCpf());
        return c;
    }

    public ClienteData getClienteById(Integer id){
        ClienteData c = new ClienteData();
        try {

            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cliente` WHERE ID = " + id + "");

            while (rs.next()) {

                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                c.setCep(rs.getString("CEP"));
                c.setCpf((rs.getString("CPF")));
                c.setEmail(rs.getString("EMAIL"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setCidade(rs.getString("CIDADE"));
                c.setEstado(rs.getString("ESTADO"));
                c.setNomet(rs.getString("NOMETITULAR"));
                c.setNumeroc(rs.getString("NUMEROCARTAO"));
                c.setSenha(rs.getString("SENHA"));

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados getClienteById:" + ex);
        }

        return c;
    }

    public boolean excluirCliente(int id) {
        boolean deuCerto = false;
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sqlCliente = "DELETE FROM CLIENTE WHERE ID = " + id;
            PreparedStatement pstmtCliente = connection.prepareStatement(sqlCliente);
            int deuCertoSQL = pstmtCliente.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados excluirCliente: " + ex);
        }
        return deuCerto;

    }
    
    public ClienteData verificaLogin (String email, String senha) {
        ClienteData novocliente = new ClienteData();
        try {

            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM `Cliente` WHERE email = '" + email + "' AND senha = '" + senha + "'";
            ResultSet resultado = stmt.executeQuery(sql);

            while (resultado.next()) {
                novocliente.setId(resultado.getInt("id"));
                novocliente.setNome(resultado.getString("nome"));
                novocliente.setCpf(resultado.getString("cpf"));
                novocliente.setCpf(resultado.getString("datanascimento"));
                novocliente.setCpf(resultado.getString("telefone"));
                novocliente.setCpf(resultado.getString("endereco"));
                novocliente.setCpf(resultado.getString("complemento"));
                novocliente.setCpf(resultado.getString("cep"));
                novocliente.setCpf(resultado.getString("cidade"));
                novocliente.setCpf(resultado.getString("cpf"));
                novocliente.setCpf(resultado.getString("estado"));
                novocliente.setCpf(resultado.getString("nometitular"));
                novocliente.setCpf(resultado.getString("numerocartao"));
                novocliente.setCpf(resultado.getString("codigoseg"));
                novocliente.setCpf(resultado.getString("email"));
                novocliente.setCpf(resultado.getString("senha"));

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados verificar o login:" + ex);
        }

        return novocliente;
    }
    
}
