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

        c.setEndereco(request.getParameter("enderecoCliente"));
        
        c.setComplemento(request.getParameter("complementoCliente"));

        c.setNumerocasa(request.getParameter("numerocasaCliente"));
        
        c.setCep(request.getParameter("cepCliente"));

        c.setTelefone(request.getParameter("telefoneCliente"));
        
        c.setDatan(request.getParameter("datanascimentoCliente"));
        
        c.setCidade(request.getParameter("cidadeCliente"));
        
        c.setEstado(request.getParameter("estadoCliente"));
        
        c.setNomet(request.getParameter("nometitularCliente"));
        
        c.setNumeroc(request.getParameter("numerocartaoCliente"));
        
        c.setCodsegcartao(request.getParameter("codsegcartaoCliente"));
        
        c.setSenha(request.getParameter("senhaCliente"));

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
        request.getRequestDispatcher("arquivoteste.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        
}
}

        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
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
        request.getRequestDispatcher("arquivoteste.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        
}
}
*/