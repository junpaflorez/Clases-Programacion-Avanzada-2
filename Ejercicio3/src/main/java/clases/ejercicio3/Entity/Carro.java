package clases.ejercicio3.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Carro implements Serializable {
    @Id
    private String placa;
    
    private String tipoVehiculo;
    private String color;
    private int modelo;

}
