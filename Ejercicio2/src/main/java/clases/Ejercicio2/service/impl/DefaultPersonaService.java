package clases.Ejercicio2.service.impl;

import clases.Ejercicio2.service.PersonaService;
import org.springframework.stereotype.Service;

@Service
public class DefaultPersonaService implements PersonaService{

    @Override
    public String comparacionEdad(int edad) {
        if(edad>=50){
            return "hola Señor de edad adulta";
        }
        return "hola jovenzuelo de corta edad";
    }
    
}
