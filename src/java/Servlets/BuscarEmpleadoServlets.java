
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "BuscarEmpleadoServlets", urlPatterns = {"/BuscarEmpleadoServlets"})
public class BuscarEmpleadoServlets extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
          
        String empleado = request.getParameter("empleado");
        
        Controladora control = new Controladora ();        
        
        Empleado emple = control.buscarEmpleado(empleado);
         
        if (emple == null){
            
            response.sendRedirect("noExiteUsuario.jsp");
        }else{
           HttpSession mise1 = request.getSession();
           String nombre = emple.getNombre();
           String apellido = emple.getApellido();
           String cargo = emple.getCargo();
           String dni = emple.getDni();
           
         
           int idem = emple.getId_empleado();
          
           
           mise1.setAttribute("nombre",nombre);
           mise1.setAttribute("apellido",apellido);
           mise1.setAttribute("cargo",cargo);
           mise1.setAttribute("dni",dni);
 
           mise1.setAttribute("idem",idem);
           response.sendRedirect("existeEmpleado.jsp");
            
        
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
