
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Juego implements Serializable {
    
    
    @Id 
    @GeneratedValue (strategy=GenerationType.SEQUENCE) 
    int id_juego;
    @Basic
    String nombre;
    int capacidad;
    int edad_minima;
    int valor_puntos;
    @OneToMany
    List<Horario> un_horario;
    @OneToMany
    List<Empleado> un_empleado;

    public Juego() {
    }

    public Juego(int id_juego, String nombre, int capacidad, int edad_minima, int valor_puntos, List<Horario> un_horario, List<Empleado> un_empleado) {
        this.id_juego = id_juego;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edad_minima = edad_minima;
        this.valor_puntos = valor_puntos;
        this.un_horario = un_horario;
        this.un_empleado = un_empleado;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public int getValor_puntos() {
        return valor_puntos;
    }

    public void setValor_puntos(int valor_puntos) {
        this.valor_puntos = valor_puntos;
    }

    public List<Horario> getUn_horario() {
        return un_horario;
    }

    public void setUn_horario(List<Horario> un_horario) {
        this.un_horario = un_horario;
    }

    public List<Empleado> getUn_empleado() {
        return un_empleado;
    }

    public void setUn_empleado(List<Empleado> un_empleado) {
        this.un_empleado = un_empleado;
    }

    
}