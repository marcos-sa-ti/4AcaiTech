/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.ClienteDAO;
import data.ClienteData;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author murilo.aaraujo
 */
@WebServlet(name = "cadastrarCliente", urlPatterns = {"/cadastrarCliente"})
public class cadastrarCliente extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteData c = new ClienteData();

        c.setNome(request.getParameter("nomeCliente"));

        c.setEmail(request.getParameter("emailCliente"));

        c.setCpf(request.getParameter("cpfCliente"));

        c.setEndereco(request.getParameter("endereco"));

        c.setCep(request.getParameter("cepCliente"));

        c.setTelefone(request.getParameter("telefone"));

        c.setCelular(request.getParameter("celular"));
        
        c.setCidade(request.getParameter("cidade"));
        
        c.setEstado(request.getParameter("estado"));
        
        c.setNomet(request.getParameter("nometitular"));
        
        c.setNumeroc(request.getParameter("numerocartao"));
        
        c.setSenha(request.getParameter("senha"));

        ClienteDAO dao = new ClienteDAO();

        boolean deuCerto;
        try {
            deuCerto = dao.cadastraCliente(c);
            request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Cliente: '" + request.getParameter("nomeCliente") + "' cadastrado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao cadastrar o cliente: '" + request.getParameter("nomeCliente") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("view/cadastrarCliente.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        
}
}
