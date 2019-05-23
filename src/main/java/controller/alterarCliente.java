/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.ClienteData;
import dao.ClienteDAO;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author murilo.aaraujo
 */
@WebServlet(name = "alterarCliente", urlPatterns = {"/alterarCliente"})
public class alterarCliente {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {

        ClienteDAO dao = new ClienteDAO();
        ClienteData c = new ClienteData();

        c.setId(Integer.parseInt(request.getParameter("id")));
       c.setNome(request.getParameter("nomeCliente"));

        c.setEmail(request.getParameter("emailCliente"));

        c.setCpf(request.getParameter("cpfCliente"));

        c.setEndereco(request.getParameter("endereco"));

        c.setCep(request.getParameter("cepCliente"));

        c.setTelefone(request.getParameter("telefone"));
        
        c.setCidade(request.getParameter("cidade"));
        
        c.setEstado(request.getParameter("estado"));
        
        c.setNomet(request.getParameter("nometitular"));
        
        c.setNumeroc(request.getParameter("numerocartao"));
        
        c.setSenha(request.getParameter("senha"));

        boolean deuCerto = dao.alterarCliente(c);

        request.setAttribute("retorno", "ok");

        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Cliente: '" + request.getParameter("nomeCliente") + "' alterado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao alterar o cliente '" + request.getParameter("nomeCliente") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);

        RequestDispatcher requestDispatcher;
        requestDispatcher = request.getRequestDispatcher("/view/alterarCliente.jsp");
        requestDispatcher.forward(request, response);

    }
}
