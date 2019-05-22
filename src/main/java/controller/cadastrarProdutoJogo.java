/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.ProdutoData;
import dao.ProdutoDAO;
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
@WebServlet(name = "cadastrarProduto", urlPatterns = {"/cadastrarProduto"})
public class cadastrarProdutoJogo extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProdutoData p = new ProdutoData();
        p.setNome(request.getParameter("nomeProduto"));

        p.setDescricao(request.getParameter("descricao"));
        
        p.setPreco(Integer.parseInt(request.getParameter("preco")));
        
        p.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        
        p.setAnoLancamento(Integer.parseInt(request.getParameter("anolancamento")));

        p.setCategoria(Integer.parseInt(request.getParameter("categoria")));
        
        ProdutoDAO dao = new ProdutoDAO();

        boolean deuCerto = dao.cadastraProduto(p);

        request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Produto: '" + request.getParameter("nomeProduto") + "'  cadastrado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao cadastrar o produto: '" + request.getParameter("nomeProduto") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("productJogos.html").forward(request, response);
    }
}    