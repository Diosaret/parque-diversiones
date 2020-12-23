
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CrearJuegoServlets", urlPatterns = {"/CrearJuegoServlets"})
public class CrearJuegoServlets extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String capacidad = request.getParameter("capacidad");
        String edad = request.getParameter("edad");
        String puntos = request.getParameter("puntos");
                
        Controladora control = new Controladora();
        
        control.crearJuego(nombre,capacidad,edad,puntos);
        
        
        response.sendRedirect("listoUsuario.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
