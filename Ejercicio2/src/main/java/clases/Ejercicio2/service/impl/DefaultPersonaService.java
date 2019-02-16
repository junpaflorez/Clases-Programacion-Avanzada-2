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

    @Override
    public String comparacionEntreEdades(int edad1, int edad2) {
        if(edad1>edad2){
            if(edad1%2 ==0){
                return "Eres un grande";
            }
        }
        else{
            if(edad2%2 == 0){
                return "Eres un grande";
            }
        }
        return "";
    }
    
    
    
}
