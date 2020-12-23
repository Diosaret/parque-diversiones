
package Logica;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)        
    int id_entrada;
    @Basic
    @Temporal(TemporalType.DATE)
    Date fecha;
    @OneToOne
    Cliente un_cliente;
    @OneToOne
    Juego un_juego;
    @OneToOne
    Usuario un_usuario;
   
    public Entrada() {
    }

    public Entrada(int id_entrada, Date fecha, Cliente un_cliente, Juego un_juego, Usuario un_usuario) {
        this.id_entrada = id_entrada;
        this.fecha = fecha;
        this.un_cliente = un_cliente;
        this.un_juego = un_juego;
        this.un_usuario = un_usuario;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getUn_cliente() {
        return un_cliente;
    }

    public void setUn_cliente(Cliente un_cliente) {
        this.un_cliente = un_cliente;
    }

    public Juego getUn_juego() {
        return un_juego;
    }

    public void setUn_juego(Juego un_juego) {
        this.un_juego = un_juego;
    }

    public Usuario getUn_usuario() {
        return un_usuario;
    }

    public void setUn_usuario(Usuario un_usuario) {
        this.un_usuario = un_usuario;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}