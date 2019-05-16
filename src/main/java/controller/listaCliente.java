/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import data.ClienteData;
import dao.ClienteDAO;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "listaCliente", urlPatterns = {"/listaCliente"})
public class listaCliente extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ClienteDAO Clientes = new ClienteDAO();

        List<ClienteData> lista;
        try {
            lista = Clientes.getClientes();
            request.setAttribute("lista", lista);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
