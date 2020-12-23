
package Logica;

import Persistencia.ControladoraPersistencia;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    private List<Usuario> lista;
    private List<Empleado> lista1;
    private List<Cliente> lista2;
    private List<Juego> lista3;
    private List<Tarjeta> lista4;
    
    public void crearUsuario(String usuario, String clave, String tipo){
        
        Usuario usu = new Usuario();
        usu.setUsuario(usuario);
        usu.setContrasenia(clave);
        if (tipo.equals("1")){
        
        usu.setTipo(1);
        }else{
            
            usu.setTipo(2);
        }
        
        control.crearUsuario(usu);
        
        
    }
    
     
    public boolean comprobarIngreso(String usuario,String contrasenia){
        
        boolean okONo = false;
        lista = control.buscarTodosUsuario();
        
        for(Usuario usu : lista){
            
            if(usu.getUsuario().equals(usuario) && usu.getContrasenia().equals(contrasenia)){
               
                return okONo = true;
                
            }
        }return okONo;
    }
    
    
    public int buscarTipoUsuario(String usuario, String contrasenia){
        
        int tipo = control.buscarTipoUsuario(usuario, contrasenia);
        
        return tipo;
        
    }
    
    
    
    public List<Usuario> buscarTodoUsuario(){
    
    lista = control.buscarTodosUsuario();
    return lista;
}

   public Usuario buscarUsuario(String usuario){
       
       lista = control.buscarTodosUsuario();
       
       for(Usuario usu : lista){
           
           if(usu.getUsuario().equals(usuario)){
               
               return usu;
           }
       }
        return null;
           
    }

    public void editarUsuario(int id, String usuario, String contrasenia,String tipo) {
        
        lista = control.buscarTodosUsuario();
        
        for(Usuario usu : lista){
          
            if(usu.getId_usuario()== id){
                
        usu.setUsuario(usuario);
        usu.setContrasenia(contrasenia);
        usu.setTipo(Integer.parseInt(tipo));
        control.editarUsuario(usu);
        
            }
            
        }   
    }

   public int BorrarUsuario(String usuario){
       
       lista = control.buscarTodosUsuario();
       
       for(Usuario usu : lista){
           
           if(usu.getUsuario().equals(usuario)){
               
               int id = usu.getId_usuario();
               control.borrarUsuario(id);
               return 1;
           }
       }return 0;
       
   }

    public void crearEmpleado(String nombre, String apellido, String cargo, String dni, String us) {
       
        Empleado emple = new Empleado();
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        emple.setDni(dni);
        
        lista = control.buscarTodosUsuario();
        for(Usuario usu : lista){
            
            if(usu.getUsuario().equals(us)){
                
               emple.setUn_usuario(usu);
            }
            
        }
        
        control.crearEmpleado(emple);
        
       
    }
   
    public Empleado buscarEmpleado(String empleado){
        
        lista1 = control.buscarTodoEmpleado(empleado);
        
        for(Empleado emple : lista1){
            
            if(emple.getNombre().equals(empleado)){
                
                return emple;
            }
        }
        return null;
    }

    public void editarEmpleado(int id, String nombre, String apellido, String cargo, String dni) {
       
        Empleado em = control.buscarEmpleado(id); 
        
        Empleado emple = new Empleado();
        
        emple.setId_empleado(id);
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        emple.setDni(dni);
        emple.setUn_usuario(em.getUn_usuario());
        
        
    
        control.editarEmpleado(emple);
    }

    public int borrarEmpleado(String nombre) {
        
        
        lista1 = control.buscarTodoEmpleado(nombre);
        
        for(Empleado emple : lista1){
            
            if(emple.getNombre().equals(nombre)){
                
                control.borrarEmpleado(emple.getId_empleado());
                return 1;
            }
        }
        
        return 0;
    }
    
    
  public List<Empleado> buscarEmpleado(){
      
      lista1 = control.buscarTodosEmpleados();
      return lista1;
  }
    
    
public List<Usuario> buscarUsuario(){
    
    return control.buscarTodosUsuario();
}  

public List<Horario> buscarHorario(){
    
    
    return control.buscarHorario();
}  

    public void crearCliente(String nombre, String apellido, String dni, String edad) {
        
        Cliente cli = new Cliente();
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setDni(dni);
        cli.setEdad(Integer.parseInt(edad));
        
        control.crearCliente(cli);
        
    }

    public void borrarCliente(String nombre) {
        
        lista2 = control.buscarCliente();
        
        for(Cliente cli : lista2){
            
            if ( cli.getNombre().equals(nombre)){
                
                control.borrarCliente(cli.getId_cliente());
            }
        }}
        
 public List<Cliente> buscarCliente(){
            
            return control.buscarCliente();
            
        }

    public void crearTarjeta(String cliente, String puntos) {
       
        Tarjeta tar = new Tarjeta();
        
        tar.setPuntos(Integer.parseInt(puntos));
        
        lista2 = control.buscarCliente();
        
        for(Cliente cli : lista2){
            if(cli.getNombre().equals(cliente)){
                
            tar.setUn_cliente(cli); 
            control.crearTarjeta(tar);
            }
            
            
        }
       
    }

    public void crearJuego(String nombre, String capacidad, String edad, String puntos) {
       
        Juego jue = new Juego();
        jue.setNombre(nombre);
        jue.setCapacidad(Integer.parseInt(capacidad));
        jue.setEdad_minima(Integer.parseInt(edad));
        jue.setValor_puntos(Integer.parseInt(puntos));
        
        
        control.crearJuego(jue);
        
        
        
    }

   public List<Juego> buscarTodoJuego(){
       
       return control.buscarTodoJuego();
   }

   
   
public String empleNombre(){

lista3 = control.buscarTodoJuego() ;

for(Juego jue : lista3){
    
    lista1 = jue.getUn_empleado();
    
    for(Empleado emple : lista1){
        
        return emple.getNombre();
    }

    
}
        return null;
}

    public int crearEntrada(String cliente, String fecha, String juego, String horario,String usu) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        lista2 = control.buscarCliente();
        
        for(Cliente cli : lista2){
            
            if(cli.getNombre().equals("cliente")){
                
               
                Entrada entra = new Entrada();
                            
                            entra.setUn_cliente(cli);
                lista4 = control.buscarTodoTarjeta();
                for(Tarjeta tar : lista4){
                    if(tar.getUn_cliente().equals(cli)){
                    
                    int num = tar.getPuntos();
                    
                lista3 = control.buscarTodoJuego();
                for(Juego jue : lista3){
                    
                    if(jue.getNombre().equals(juego)){
                        
                        int num2 = jue.getValor_puntos();
                        
                        if(num>=num2){
                            
                            
                            try {
                                entra.setFecha(df.parse(fecha));
                            } catch (ParseException ex) {
                                Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            entra.setUn_juego(jue);
                            
                            lista = control.buscarTodosUsuario();
                            for(Usuario usuar : lista){
                                if(usuar.getUsuario().equals(usu)){
                                    entra.setUn_usuario(usuar);
                                    
                                    control.crearEntrada(entra);
                                    return 1;
                                }
                                
                                
                            }
                            
                            
                            
                            
                            
                        }  
                        }
                                
                    }
                }
                    
                    
                    
                    
                    
                    }
                    
                        
                    }
                    
                }
           return 0;     
                
    }

  
        

        
}    
    

   
   
   
        
        
        
        
        
 




