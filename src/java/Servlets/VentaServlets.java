
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "VentaServlets", urlPatterns = {"/VentaServlets"})
public class VentaServlets extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String cliente = request.getParameter("cliente");
        String fecha = request. getParameter("fecha");
        String juego = request.getParameter("juego");
        String horario = request.getParameter("horario");
        
        HttpSession misession = request.getSession();
    String usu = (String)request.getSession().getAttribute("usuario");
        Controladora control = new Controladora();
        
        int num =control.crearEntrada(cliente,fecha,juego,horario,usu);
        
        if(num==1){
            
            response.sendRedirect("listoCliente.jsp");
        }else{
            response.sendRedirect("noexiste.jsp");
        }
        
        
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
