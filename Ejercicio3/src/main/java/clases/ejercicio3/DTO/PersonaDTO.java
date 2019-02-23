package clases.ejercicio3.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PersonaDTO {
    private String nombreCompleto;
    private String telefono;
    private int edad;
    private String correo;
    
}
