
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


@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        
        boolean okONo = false;
        
        Controladora control = new Controladora();
        
        okONo = control.comprobarIngreso(usuario,contrasenia);
        
        if(okONo==true){
            
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usuario);
            misession.setAttribute("contrasenia", contrasenia);
            
            int tipo = control.buscarTipoUsuario(usuario,contrasenia);
            
            misession.setAttribute("tipo", tipo);
            
            if (tipo == 1){
           
            response.sendRedirect("admin.jsp");
            
            }else{
           
            response.sendRedirect("index.jsp");
            }
        }else{
            response.sendRedirect("loginError.jsp");
        }
        
       
       
        
        
        
   
    
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
