
package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "BuscarUsuarioServlets", urlPatterns = {"/BuscarUsuarioServlets"})
public class BuscarUsuarioServlets extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

   
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String usuario = request.getParameter("usuario");
        
        Controladora control = new Controladora ();        
        
        Usuario usu = control.buscarUsuario(usuario);
         
        if (usu == null){
            
            response.sendRedirect("noExiteUsuario.jsp");
        }else{
           HttpSession mise = request.getSession();
           String usua = usu.getUsuario();
           String contra = usu.getContrasenia();
           int ti = usu.getTipo();
           int id = usu.getId_usuario();
          
           
           mise.setAttribute("usua",usua);
           mise.setAttribute("contra",contra);
           mise.setAttribute("ti", ti);
           mise.setAttribute("id",id);
           response.sendRedirect("existeUsuario.jsp");
            
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
