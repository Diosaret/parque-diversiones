
package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Horario;
import Logica.Juego;
import Logica.Tarjeta;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    HorarioJpaController horaJPA = new HorarioJpaController();
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    JuegoJpaController jueJPA = new JuegoJpaController();
    EntradaJpaController entraJPA = new EntradaJpaController();
    ClienteJpaController clienJPA = new ClienteJpaController();
    TarjetaJpaController tarjeJPA = new TarjetaJpaController();
    
    
    private List<Usuario> listaUsuario;
    private List<Juego> listaJuego;
    private List<Entrada> listaEntrada;
    private List<Empleado> listaEmpleado;
    
    
public void crearHorario(Horario hora){
    
    
  horaJPA.create(hora);
    
}    
    
public void crearEmpleado(Empleado emple){
    
  empleJPA.create(emple);
}
    

public void crearJuego(Juego jue){
    
    jueJPA.create(jue);
}

public void crearUsuario(Usuario usu){
    
    usuJPA.create(usu);
}

public void crearEntrada(Entrada entra){
    
    entraJPA.create(entra);
}

public void crearCliente(Cliente clien){
    
    clienJPA.create(clien);
}

public void crearTarjeta(Tarjeta tarje){
    
    tarjeJPA.create(tarje);
}

public void editarHorario(Horario hora){
    
        try {
            horaJPA.edit(hora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void editarEmpleado(Empleado emple){
    
        try {
            empleJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void editarJuego(Juego jue){
    
        try {
            jueJPA.edit(jue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}



public void editarUsuario(Usuario usu){
    
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void editarEntrada(Entrada entra){
    
        try {
            entraJPA.edit(entra);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void editarCliente(Cliente clien){
    
        try {
            clienJPA.edit(clien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void editarTarjeta(Tarjeta tarje){
    
        try {
            tarjeJPA.edit(tarje);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarHorario(int id_horario){
    
        try {
            horaJPA.destroy(id_horario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarUsuario(int id_usuario){
    
        try {
            usuJPA.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void borrarEmpleado(int id_empleado){
    
        try {
            empleJPA.destroy(id_empleado);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarJuego(int id_juego){
    
        try {
            jueJPA.destroy(id_juego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarEntrada(int id_entrada){
    
        try {
            entraJPA.destroy(id_entrada);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarCliente(int id_cliente){
    
        try {
            clienJPA.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void borrarTarjeta(int id_tarjeta){
    
        try {
            tarjeJPA.destroy(id_tarjeta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public Horario buscarHorario(int id_horario){
    
    Horario hor = horaJPA.findHorario(id_horario);
   
    return hor;
}

public Usuario buscarUsuario(int id_usuario){
    
    Usuario usu = usuJPA.findUsuario(id_usuario);
    
    return usu;
}


public Empleado buscarEmpleado(int id_empleado){
    
    Empleado emple = empleJPA.findEmpleado(id_empleado);
    
    return emple;
}


public Entrada buscarEntrada(int id_entrada){
    
    Entrada entra = entraJPA.findEntrada(id_entrada);
    
    return entra;
}

public Juego buscarJuego(int id_juego){
    
    Juego jue = jueJPA.findJuego(id_juego);
    
    return jue;
}

public Cliente buscarCliente(int id_cliente){
    
    Cliente clien = clienJPA.findCliente(id_cliente);
    
    return clien;
}

public Tarjeta buscarTarjeta(int id_tarjeta){
    
    Tarjeta tarje = tarjeJPA.findTarjeta(id_tarjeta);
    
    return tarje;
}

public int buscarTipoUsuario(String usuario, String contrasenia){
  
    
    listaUsuario = usuJPA.findUsuarioEntities();
    
    
    for(Usuario usu : listaUsuario){
        
        if(usu.getUsuario().equals(usuario) && usu.getContrasenia().equals(contrasenia)){
            
          return usu.getTipo();
        }
    }
        return 0;
   
}



public List<Empleado> buscarListaEmpleadoJuego(String nombre){
    
  listaJuego = jueJPA.findJuegoEntities();
  
  for(Juego jue : listaJuego){
      
      if(jue.getNombre().equals(nombre)){
        
          return jue.getUn_empleado();
      }
  }
        return null;
  
  
}

public List<Empleado> buscarTodoEmpleado(String empleado){
    
   return listaEmpleado = empleJPA.findEmpleadoEntities();
    
  
    
}

public int cantidadEntradaDia(Date fecha){
    
    listaEntrada = entraJPA.findEntradaEntities();
    int con = 0;
    
    for(Entrada entra : listaEntrada){
      
        if(entra.getFecha().equals(fecha)){
          
            con++;
            
        }
        
    }return con;
    
}


public int cantidadEntradaJuegoDia(Date fecha,String nombre){
    
    listaEntrada = entraJPA.findEntradaEntities();
    int con = 0;
    
    for(Entrada entra : listaEntrada){
        
       if((entra.getFecha().equals(fecha)) && (entra.getUn_juego().getNombre().equals(nombre)) ){
           
        con++;
       }
    }return con;
    
    
}

public List<Usuario> buscarTodosUsuario(){
    
    listaUsuario = usuJPA.findUsuarioEntities();
    
    return listaUsuario;
}


public List<Empleado> buscarTodosEmpleados(){
    
   listaEmpleado = empleJPA.findEmpleadoEntities();
   
   return listaEmpleado;
}


public List<Horario> buscarHorario(){
    
    return horaJPA.findHorarioEntities();
}


public List<Cliente> buscarCliente(){
    
    return clienJPA.findClienteEntities();
}


public List<Tarjeta> buscarTodoTarjeta(){
    
    return tarjeJPA.findTarjetaEntities();
}
public List<Juego> buscarTodoJuego(){
    
    return jueJPA.findJuegoEntities();
}

public String empleNombre(){

listaJuego = jueJPA.findJuegoEntities();

for(Juego jue : listaJuego){
    
    listaEmpleado = jue.getUn_empleado();
    
    for(Empleado emple : listaEmpleado){
        
        return emple.getNombre();
    }

    
}
        return null;
}



}




