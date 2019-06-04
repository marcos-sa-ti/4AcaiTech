package dao;

import connection.ConnectionFactory;
import data.ProdutoData;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.Part;

/**
 *
 * @author Android
 */
public class ProdutoDAO {
    public boolean cadastraProdutoJogo(ProdutoData p) {
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlProduto = "INSERT INTO `produto`(nome, descricao, precovenda, precocompra, quantidade, categoria, genero, anolancamento ) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmtProduto = connection.prepareStatement(sqlProduto);
            
            
            pstmtProduto.setString(1, p.getNome());
            pstmtProduto.setString(2, p.getDescricao());
            pstmtProduto.setInt(3, p.getPrecoVenda());
            pstmtProduto.setInt(4, p.getPrecoCompra());
            pstmtProduto.setInt(5, p.getQuantidade());
            pstmtProduto.setString(6, p.getCategoria());
            pstmtProduto.setString(7, p.getGenero());
            pstmtProduto.setString(8, p.getAnoLancamento());
            
            int deuCertoSQL = pstmtProduto.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados cadastraProduto: " + ex);
        }
        return deuCerto;

    }

    public boolean cadastraProdutoAcessorio(ProdutoData p) {
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlProduto = "INSERT INTO `produto`(nome, descricao, precovenda, precocompra, quantidade, categoria) VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmtProduto = connection.prepareStatement(sqlProduto);
            
            
            pstmtProduto.setString(1, p.getNome());
            pstmtProduto.setString(2, p.getDescricao());
            pstmtProduto.setInt(3, p.getPrecoVenda());
            pstmtProduto.setInt(4, p.getPrecoCompra());
            pstmtProduto.setInt(5, p.getQuantidade());
            pstmtProduto.setString(6, p.getCategoria());
           
            
            int deuCertoSQL = pstmtProduto.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados cadastraProduto: " + ex);
        }
        return deuCerto;

    }
    
    public boolean cadastraProdutoConsole(ProdutoData p) {
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlProduto = "INSERT INTO `produto`(nome, descricao, precovenda, precocompra, quantidade, anolancamento, categoria) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmtProduto = connection.prepareStatement(sqlProduto);
            
            
            pstmtProduto.setString(1, p.getNome());
            pstmtProduto.setString(2, p.getDescricao());
            pstmtProduto.setInt(3, p.getPrecoVenda());
            pstmtProduto.setInt(4, p.getPrecoCompra());
            pstmtProduto.setInt(5, p.getQuantidade());
            pstmtProduto.setString(6, p.getAnoLancamento());
            pstmtProduto.setString(7, p.getCategoria());
            
            
            /* Corrigir essa porra depois 
            
            
            InputStream is = part.getInputStream();
            pstmtProduto.setBlob(6,is);
            
            
            */
            
            
            int deuCertoSQL = pstmtProduto.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados cadastraProduto: " + ex);
        }
        return deuCerto;

    }
    public ArrayList<ProdutoData> getProdutos() {
        ArrayList<ProdutoData> listaProdutos = new ArrayList<>();
        try {
            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome, precovenda, quantidade FROM produto");

            while (rs.next()) {
                ProdutoData p = new ProdutoData();

                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("precovenda"));
                p.setQuantidade(rs.getInt("quantidade"));
                listaProdutos.add(p);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro no banco de dados " + e);
        }

        return listaProdutos;
    }

    public ArrayList<ProdutoData> getProdutoByDescricao(String descricaoProduto) {
        ArrayList<ProdutoData> listaProdutos = new ArrayList<>();
        try {
            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM `produto` WHERE  NOME LIKE '%" + descricaoProduto + "%' OR DESCRICAO LIKE '%" + descricaoProduto + "%' OR PLATAFORMA LIKE '%" + descricaoProduto + "%'");

            //System.out.println("SELECT * FROM `produto` WHERE  NOME LIKE '%" + descricaoProduto + "%' OR DESCRICAO LIKE '%" + descricaoProduto + "%'");
            while (rs.next()) {
                ProdutoData p = new ProdutoData();
                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                listaProdutos.add(p);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro no banco de dados " + e);
        }

        return listaProdutos;
    }

    public ProdutoData getProdutoById(int idProduto) {
        ProdutoData p = new ProdutoData();
        try {

            Connection connection = new ConnectionFactory().getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `produto` where id = " + idProduto);

            while (rs.next()) {
                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
               

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro no banco de dados " + e);
        }
        return p;
    }

    public boolean alterarProduto(ProdutoData p) {
        boolean deuCerto = false;
        try {
            Connection connection;
            connection = new ConnectionFactory().getConnection();

            String altProduto = "UPDATE `produto` SET `nome`=?,`categoria`=?,`descricao`=?,`preco`=?,`ano_lancamento`=?,`quantidade`=? WHERE `id`= ?";
            PreparedStatement pstmtProduto = connection.prepareStatement(altProduto);
            pstmtProduto.setString(1, p.getNome());
            pstmtProduto.setString(3, p.getDescricao());
            pstmtProduto.setInt(6, p.getQuantidade());
            pstmtProduto.setInt(7, p.getId());

            int deuCertoSQL = pstmtProduto.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }

            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados alterarProduto: " + ex);
        }
        return deuCerto;
    }

    public boolean excluirProduto(int id) {
        boolean deuCerto = false;
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sqlProduto = "DELETE FROM PRODUTO WHERE ID = " + id;
            PreparedStatement pstmtProduto = connection.prepareStatement(sqlProduto);

            int deuCertoSQL = pstmtProduto.executeUpdate();

            if (deuCertoSQL == 1) {
                deuCerto = true;
            } else {
                deuCerto = false;
            }
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro no banco de dados excluirProduto: " + ex);
        }
        return deuCerto;

    }
}
