
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ModificarUsuarioServlets", urlPatterns = {"/ModificarUsuarioServlets"})
public class ModificarUsuarioServlets extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id = (int)request.getSession().getAttribute("id");
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        String tipo = request.getParameter("ti");
        
        
        Controladora control = new Controladora();
        
        control.editarUsuario(id,usuario,contrasenia,tipo);
         
        response.sendRedirect("modiusu.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
