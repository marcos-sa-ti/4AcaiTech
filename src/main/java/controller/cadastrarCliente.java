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

        ClienteData p = new ClienteData();

        p.setNome(request.getParameter("nomeCliente"));

        p.setEmail(request.getParameter("emailCliente"));

        p.setCpf(request.getParameter("cpfCliente"));

        p.setEndereco(request.getParameter("enderecoCliente"));
        
        p.setComplemento(request.getParameter("complementoCliente"));

        p.setNumerocasa(request.getParameter("numerocasaCliente"));
        
        p.setCep(request.getParameter("cepCliente"));

        p.setTelefone(request.getParameter("telefoneCliente"));
        
        p.setDatan(request.getParameter("datanascimentoCliente"));
        
        p.setCidade(request.getParameter("cidadeCliente"));
        
        p.setEstado(request.getParameter("estadoCliente"));
        
        p.setNomet(request.getParameter("nometitularCliente"));
        
        p.setNumeroc(request.getParameter("numerocartaoCliente"));
        
        p.setCodsegcartao(request.getParameter("codsegcartaoCliente"));
        
        p.setSenha(request.getParameter("senhaCliente"));

        ClienteDAO dao = new ClienteDAO();

        boolean deuCerto = dao.cadastraCliente(p);
        
        request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Cliente: '" + request.getParameter("nomeCliente") + "' cadastrado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao cadastrar o cliente: '" + request.getParameter("nomeCliente") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("login.jsp").forward(request, response);

        
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
