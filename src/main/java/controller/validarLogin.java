package controller;

import dao.ClienteDAO;
import data.ClienteData;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "validarLogin", urlPatterns = {"/validarLogin"})
public class validarLogin extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        String retornodapagina = "index.html";
        
        boolean deuCerto = false;
        String nomelogado = null;
        String mensagemdoretorno = null;
        
        
        Date data = new Date ();
        SimpleDateFormat formadata = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
        String dataAtual = formadata.format(data);
        
        
        if ((request.getParameter("emaildigitadopelocliente")) != null || (request.getParameter("senhadidigitadapelocliente") != null )){
        
            ClienteDAO novocliente = new  ClienteDAO();
            
            ClienteData novoobjcliente = novocliente.verificaLogin(request.getParameter("usuariodigitadopelocliente"), request.getParameter("senhadigitadapelocliente"));
        
            if (novoobjcliente != null){
            
            retornodapagina = "index.html";
                HttpSession sessao = request.getSession();
                sessao.setAttribute("getCpf", novoobjcliente.getCpf());
                nomelogado = novoobjcliente.getNome();
                deuCerto = true;
             
            }
  
        }
        
        request.setAttribute("retornodapagina","ok");
        
        if (deuCerto == true){
        mensagemdoretorno = "Seja bem vindo: " +nomelogado+" !" +dataAtual+"";
        }
        else {
        mensagemdoretorno = "Não foi possivel efetuar o login! Verifique os dados digitados";
        }
        request.setAttribute("mensagemdoretorno",mensagemdoretorno);
        request.getServletContext().getRequestDispatcher(retornodapagina).forward(request, response);
        
        
        
        
        
        
        
        
    }



}
