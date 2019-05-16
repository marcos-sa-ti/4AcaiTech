/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import data.ProdutoData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Android
 */
public class ProdutoDAO {
    public boolean cadastraProduto(ProdutoData p) {
        boolean deuCerto = false;
        try {
            Connection connection = new ConnectionFactory().getConnection();

            String sqlProduto = "INSERT INTO `produto`(`nome`, `categoria`, `descricao`, 'preco', `ano_lancamento`, `quantidade`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmtProduto = connection.prepareStatement(sqlProduto);
            pstmtProduto.setString(1, p.getNome());
            pstmtProduto.setInt(2, p.getCategoria());
            pstmtProduto.setString(3, p.getDescricao());
            pstmtProduto.setInt(4, p.getPreco());
            pstmtProduto.setInt(5, p.getAnoLancamento());
            pstmtProduto.setInt(6, p.getQuantidade());
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM `produto` order by id desc");

            while (rs.next()) {
                ProdutoData p = new ProdutoData();

                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setPreco(rs.getInt("PRECO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setCategoria(rs.getInt("CATEGORIA"));
                p.setAnoLancamento(rs.getInt("ANO_LANCAMENTO"));
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
                p.setPreco(rs.getInt("PRECO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setCategoria(rs.getInt("CATEGORIA"));
                p.setAnoLancamento(rs.getInt("ANO_LANCAMENTO"));

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
                p.setPreco(rs.getInt("PRECO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setCategoria(rs.getInt("CATEGORIA"));
                p.setAnoLancamento(rs.getInt("ANO_LANCAMENTO"));
               

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
            pstmtProduto.setInt(2, p.getCategoria());
            pstmtProduto.setString(3, p.getDescricao());
            pstmtProduto.setInt(4, p.getPreco());
            pstmtProduto.setInt(5, p.getAnoLancamento());
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
