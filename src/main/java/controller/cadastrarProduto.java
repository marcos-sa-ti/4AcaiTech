package controller;

import connection.ConnectionFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author marcos.sbrito2
 * 
 * 
 * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 * * ESSA É UMA CLASSE TESTE PARA SALVAR SOMENTE A IMAGEM DE UM PRODUTO 
 */




@WebServlet (name="cadastrarProduto" , urlPatterns = {"/cadastrarProduto"})
@MultipartConfig(maxFileSize = 16177216)
public class cadastrarProduto extends HttpServlet {
    
    PrintWriter saida;
    
    @Override
     protected void doPost (HttpServletRequest request , HttpServletResponse response)
          throws ServletException, IOException {
     
         
         response.setContentType("text/html;charset=UTF-8");
         saida = response.getWriter();
         int resultado = 0;
         Part part = request.getPart("fotoqueoclienteescolheu");
         if (part != null){
         try{
         Connection conexao = new ConnectionFactory().getConnection();
         PreparedStatement ps = conexao.prepareStatement("INSERT INTO produto(imagem) VALUES (?)");
         InputStream is = part.getInputStream();
         
         
         
         
         ps.setBlob(1, is);
         resultado = ps.executeUpdate();
         if (resultado > 0 ){
         response.sendRedirect("/mavenproject1/index.jsp");
         }
         else{
         response.sendRedirect("/mavenproject1/cadastrarProduto.jsp?message=Some+Error+Ocurred");
         }
         
         }
         
         catch (Exception e){
                 saida.println(e);
                 }
       
             
         }
         
         
         
     
     };
    
    
    
}
