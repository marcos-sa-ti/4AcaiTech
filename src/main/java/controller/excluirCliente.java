/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import data.ClienteData;
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
@WebServlet(name = "excluirCliente", urlPatterns = {"/excluirCliente"})
public class excluirCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idCliente = Integer.parseInt(request.getParameter("idCliente"));

        ClienteDAO cliente = new ClienteDAO();

        ClienteData clienteSendoExcluido;
        clienteSendoExcluido = cliente.getClienteById(idCliente);
        boolean deuCerto;
        deuCerto = cliente.excluirCliente(idCliente);
        request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;
        if (deuCerto == true) {
            MensagemDeRetorno = "Cliente: '" + clienteSendoExcluido.getNome() + "' excluido com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao excluir o cliente: '" + clienteSendoExcluido.getNome() + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("view/listaCliente.jsp").forward(request, response);

    }
}
