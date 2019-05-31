package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet (name = "fazerLogoff", urlPatterns = {"/fazerLogoff"})
public class fazerLogoff extends HttpServlet {
    
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
    
    HttpSession sessao = request.getSession();
    
        sessao.setAttribute("getId", null);
        sessao.setAttribute("getNome", null);
        sessao.setAttribute("getCpf", null);
        sessao.setAttribute("getTelefone", null);
        sessao.setAttribute("getEmail", null);
        sessao.setAttribute("getEndereco", null);
        sessao.setAttribute("getNumerocasa", null);
        sessao.setAttribute("getComplemento", null);
        sessao.setAttribute("getCep", null);
        sessao.setAttribute("getCidade", null);
        sessao.setAttribute("getEstado", null);
        sessao.setAttribute("getNomet", null);
        sessao.setAttribute("getNumeroc", null);
        sessao.setAttribute("getCodsegcartao", null);
        request.setAttribute("fazerLogoff", "fazerLogoff");
        request.getServletContext().getRequestDispatcher("/telalogin.jsp").forward(request, response);         
    }
  
}
