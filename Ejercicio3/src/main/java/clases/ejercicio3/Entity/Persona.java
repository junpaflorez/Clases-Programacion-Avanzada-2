package clases.ejercicio3.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "persona_id_seq")
    @SequenceGenerator(name = "auto_gen", sequenceName = "persona_id_seq")
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String correo;
    
    
    
}
