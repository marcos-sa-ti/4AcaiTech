package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet (name="expulsardapaginasemlogar" , urlPatterns= {"/expulsardapaginasemlogar"})
public class expulsardapaginasemlogar extends HttpServlet {
    
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException{
        
        HttpSession session = request.getSession();
        session.setAttribute("getId", null);
        session.setAttribute("getNome", null);
        session.setAttribute("getCpf", null);
        session.setAttribute("getTelefone", null);
        session.setAttribute("getEmail", null);
        session.setAttribute("getEndereco", null);
        session.setAttribute("getNumerocasa", null);
        session.setAttribute("getComplemento", null);
        session.setAttribute("getCep", null);
        session.setAttribute("getCidade", null);
        session.setAttribute("getEstado", null);
        session.setAttribute("getNomet", null);
        session.setAttribute("getNumeroc", null);
        session.setAttribute("getCodsegcartao", null);
        
        request.setAttribute("retorno","expulsar");
        
        String mensagemRetorno = "Seu acesso à essa página bloqueada, você não está logado!";
    
        request.setAttribute("mensagemRetorno",mensagemRetorno);
        
        request.getServletContext().getRequestDispatcher("/telalogin.jsp").forward(request, response);
        
    
    
    
    }
    
    
    
    
    
    }
    


