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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteData c = new ClienteData();

        c.setNome(request.getParameter("nome"));

        c.setEmail(request.getParameter("email"));

        c.setCpf(request.getParameter("cpf"));

        c.setEndereco(request.getParameter("endereco"));
        
        c.setComplemento(request.getParameter("complemento"));

        c.setNumerocasa(request.getParameter("numerocasa"));
        
        c.setCep(request.getParameter("cep"));

        c.setTelefone(request.getParameter("telefone"));
        
        c.setDatan(request.getParameter("datanascimento"));
        
        c.setCidade(request.getParameter("cidade"));
        
        c.setEstado(request.getParameter("estado"));
        
        c.setNomet(request.getParameter("nometitular"));
        
        c.setNumeroc(request.getParameter("numerocartao"));
        
        c.setCodsegcartao(request.getParameter("codsegcartao"));
        
        c.setSenha(request.getParameter("senha"));

        ClienteDAO dao = new ClienteDAO();

        boolean deuCerto;
        try {
            deuCerto = dao.cadastraCliente(c);
            request.setAttribute("retorno", "ok");
        String MensagemDeRetorno = null;

        if (deuCerto == true) {
            MensagemDeRetorno = "Cliente: '" + request.getParameter("nome") + "' cadastrado com sucesso!";
        } else {
            MensagemDeRetorno = "Houve um erro ao cadastrar o cliente: '" + request.getParameter("nome") + "'.";
        }
        request.setAttribute("retornoMensagem", MensagemDeRetorno);
        request.getRequestDispatcher("cadastrarCliente.jsp").forward(request, response);
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
