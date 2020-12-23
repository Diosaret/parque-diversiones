
package Logica;

import Persistencia.ControladoraPersistencia;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
       
       ControladoraPersistencia control = new ControladoraPersistencia();
       
       
       
    
       
       
         /* Probando los metodos
       
       Entrada entra = control.buscarEntrada(3);
       
       entra.setFecha(new Date("12/23/2020"));
       
       control.editarEntrada(entra);
       
       
       
        
        int c = control.cantidadEntradaJuegoDia(new Date("12/23/2020"),"calecita");
       
       
        System.out.println(c);
     
       
       Entrada entra = control.buscarEntrada(3);
       
       entra.setHora(new Time(10,0,0));
       
       control.editarEntrada(entra);
       
      
       Juego jue = control.buscarJuego(2);
       Usuario usu =  control.buscarUsuario(5);
       
       Entrada en = new Entrada();
       
       en.setNombre("Pepe");
       en.setApellido("Gonzalo");
       en.setEdad(5);
       en.setHora(new Time(9,0,0));
       en.setFecha(new Date(5,6,8));
       en.setUn_juego(jue);
       en.setUn_usuario(usu);
       
       control.crearEntrada(en);
      
       
    
      
       
       Usuario usu = new Usuario();
       
       usu.setUsuario("humber");
       usu.setContrasenia("2342");
       usu.setTipo(2);
       
       control.crearUsuario(usu);
       
       Empleado emple = new Empleado();
       
       emple.setNombre("Humberto");
       emple.setApellido("Parra");
       emple.setDni("128999");
       emple.setCargo("Taxi");
       emple.setUn_usuario(usu);
       
       control.crearEmpleado(emple);
       
      
        Usuario usu1 = new Usuario();
       
       usu1.setUsuario("luci");
       usu1.setContrasenia("2342");
       usu1.setTipo(1);
       
       control.crearUsuario(usu1);
       
       Empleado emple1 = new Empleado();
       
       emple1.setNombre("lucila");
       emple1.setApellido("Perdomo");
       emple1.setDni("1289994343");
       emple1.setCargo("Cajera");
       emple1.setUn_usuario(usu1);
       
       control.crearEmpleado(emple1);
       
       Horario hor2 = new Horario();
       
       hor2.setHora_turno(new Time(8,9,0));
       
       control.crearHorario(hor2);
       
       Juego jue = new Juego();
       
       jue.setNombre("calecita");
       jue.setCapacidad(50);
       jue.setEdad_minima(2);
       
       List lista1 = new ArrayList();
       lista1.add(hor2);
       
       jue.setUn_horario(lista1);
       
       List lista2 = new ArrayList();
       lista2.add(emple);
       
       jue.setUn_empleado(lista2);
       
       
       control.crearJuego(jue);
       
    
        
      
       
       Horario hor = new Horario();
       
       hor.setHora_turno(new Time(5,8,9));
       
       control.crearHorario(hor);
     
       Juego jue1 = new Juego();
       
       jue1.setNombre("rueda");
       jue1.setCapacidad(60);
       jue1.setEdad_minima(12);
       
       List lista = new ArrayList();
       lista2.add(hor);
       
       jue.setUn_horario(lista);
       
       List lista3 = new ArrayList();
       lista3.add(emple1);
       
       jue.setUn_empleado(lista3);
       
       
       control.crearJuego(jue1);
       
      
       Entrada entra = new Entrada();
       
       entra.setNombre("Flavio");
       entra.setApellido("Oberto");
       entra.setEdad(15);
       entra.setHora(new Time(10,0,0));
       entra.setFecha(new Date("12/23/2020"));
       entra.setUn_juego(jue);
       entra.setUn_usuario(usu);
       
       control.crearEntrada(entra);
       
       
       
        
       
       
      
       Usuario usu2 = new Usuario();
       
       usu2.setUsuario("flavio");
       usu2.setContrasenia("12");
       usu2.setTipo(2);
       control.crearUsuario(usu2);
       
        Usuario usu3 = new Usuario();
       
       usu3.setUsuario("luciano");
       usu3.setContrasenia("112345");
       usu3.setTipo(1);
       control.crearUsuario(usu3);
       
       
        Usuario usu4 = new Usuario();
       
       usu4.setUsuario("zoila");
       usu4.setContrasenia("122");
       usu4.setTipo(2);
       control.crearUsuario(usu4);
    
       Horario hor4 = new Horario();
        
       hor4.setHora_turno(new Time(18,0,0));
       control.crearHorario(hor4);
       
       Horario hor5 = new Horario();
       
       hor5.setHora_turno(new Time(7,0,45));
       
       control.crearHorario(hor5);
      
       
       Usuario usu6 = new Usuario();
       
       usu6.setUsuario("mary");
       usu6.setContrasenia("1234");
       usu6.setTipo(1);
       
       control.crearUsuario(usu6);
       
       Usuario usu7 = new Usuario();
       
       usu7.setUsuario("camilo");
       usu7.setContrasenia("45654");
       usu7.setTipo(2);
       
       control.crearUsuario(usu7);
       
       
       usu.setUsuario("marycielo");
       control.editarUsuario(usu);
       
       Empleado emple3 = new Empleado();
       
       emple3.setNombre("Luciano");
       emple3.setApellido("Taccarelli");
       emple3.setDni("12334545");
       emple3.setCargo("Ingeniero");
       emple3.setUn_usuario(usu);
       
       control.crearEmpleado(emple3);
       
      
       Juego jue3 = new Juego();
       
       jue3.setNombre("silla voladora");
       jue3.setCapacidad(20);
       jue3.setEdad_minima(12);
       
       control.crearJuego(jue3);
       
       List lista4 = new ArrayList();
       lista1.add(hor2);
       
       jue.setUn_horario(lista1);
       
       List lista5 = new ArrayList();
       lista2.add(emple);
       
       jue.setUn_empleado(lista2);
       
       
       control.crearJuego(jue);
       
    
        
       Entrada entra4 = new Entrada();
       
       entra4.setNombre("Flavio");
       entra4.setApellido("Oberto");
       entra4.setEdad(15);
       entra4.setHora(new Time(10,0,0));
       entra4.setFecha(new Date("12/23/2020"));
       entra4.setUn_juego(jue);
       entra4.setUn_usuario(usu);
       
       control.crearEntrada(entra4);
      
     
      
      /* 
      Horario hor = control.buscarHorario(2);
       
      hor.setHora_turno(new Time(22,0,0));
      control.editarHorario(hor);
        System.out.println("estos son los datos");
        
        System.out.println(hor.getHora_turno());
       */


      
       
       
       
       
    }
    
}
