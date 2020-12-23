
package Logica;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Horario implements Serializable{
  
    @Id 
    @GeneratedValue (strategy=GenerationType.SEQUENCE) 
    int id_horario;
    @Basic        
    Time hora_turno;
   

    public Horario() {
    }

    public Horario(int id_horario, Time hora_turno) {
        this.id_horario = id_horario;
        this.hora_turno = hora_turno;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Time getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(Time hora_turno) {
        this.hora_turno = hora_turno;
    }


   
    
    

}