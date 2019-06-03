package controller;

import connection.ConnectionFactory;
import dao.ProdutoDAO;
import data.ProdutoData;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author marcos.sbrito2
 *
 *
 * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É
 * UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA
 * CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA CLASSE
 * TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA CLASSE TESTE
 * PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA CLASSE TESTE PARA
 * SALVAR SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA CLASSE TESTE PARA SALVAR
 * SOMENTE A IMAGEM DE UM PRODUTO * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE
 * A IMAGEM DE UM PRODUTO
 */
@WebServlet(name = "cadastrarProduto", urlPatterns = {"/cadastrarProduto"})
@MultipartConfig(maxFileSize = 16177216)
public class cadastrarProduto extends HttpServlet {

    PrintWriter saida;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProdutoData p = new ProdutoData();

        p.setNome(request.getParameter("nomeProduto"));

        p.setDescricao(request.getParameter("descricaoProduto"));

        p.setQuantidade(Integer.parseInt(request.getParameter("quantidadeProduto")));

        p.setPrecoVenda(Integer.parseInt(request.getParameter("precoVendaProduto")));

        p.setPrecoCompra(Integer.parseInt(request.getParameter("precoCompraProduto")));

        p.setAnoLancamento(request.getParameter("anolancamentoProduto"));

        p.setCategoria(request.getParameter("categoriaProduto"));

        p.setGenero(request.getParameter("generoJogo"));

        ProdutoDAO dao = new ProdutoDAO();

        boolean deuCerto = dao.cadastraProdutoJogo(p);
        request.setAttribute("retorno", "ok");

        String mensagemRetorno = null;

        if (deuCerto == true) {
            mensagemRetorno = "Produto: " + request.getParameter("nomeProduto") + " cadastrado com sucesso! ";
        } else {
            mensagemRetorno = "Houve um erro ao cadastrar o produto: " + request.getParameter("nomeProduto") + " ";
        }
        request.setAttribute("mensagemRetorno", mensagemRetorno);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
