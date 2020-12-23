
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tarjeta implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)        
    int id_tarjeta;
    @Basic 
    int puntos;
    @OneToOne
    Cliente un_cliente;
   

    public Tarjeta() {
    }

    public Tarjeta(int id_tarjeta, int puntos, Cliente un_cliente) {
        this.id_tarjeta = id_tarjeta;
        this.puntos = puntos;
        this.un_cliente = un_cliente;
    }

    public int getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Cliente getUn_cliente() {
        return un_cliente;
    }

    public void setUn_cliente(Cliente un_cliente) {
        this.un_cliente = un_cliente;
    }























}