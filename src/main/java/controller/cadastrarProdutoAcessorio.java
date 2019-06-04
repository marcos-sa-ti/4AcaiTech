/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import data.ProdutoData;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author murilo.aaraujo
 */
@WebServlet(name = "cadastrarAcessorio", urlPatterns = {"/cadastrarAcessorio"})
public class cadastrarProdutoAcessorio extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ProdutoData p = new ProdutoData();
        
        p.setNome(request.getParameter("nomeProduto"));

        p.setDescricao(request.getParameter("descricaoProduto"));

        p.setQuantidade(Integer.parseInt(request.getParameter("quantidadeProduto")));

        p.setPrecoVenda(Integer.parseInt(request.getParameter("precoVendaProduto")));

        p.setPrecoCompra(Integer.parseInt(request.getParameter("precoCompraProduto")));
        
        p.setCategoria(request.getParameter("categoriaProduto"));
        
        ProdutoDAO dao = new ProdutoDAO();

        boolean deuCerto = dao.cadastraProdutoAcessorio(p);

        request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Produto: '" + request.getParameter("nomeProduto") + "'  cadastrado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao cadastrar o produto: '" + request.getParameter("nomeProduto") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("productAcessorios.jsp").forward(request, response);
    }
}
