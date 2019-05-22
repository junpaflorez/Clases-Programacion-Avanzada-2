package PAII.ConnectMongoDB.service;

import PAII.ConnectMongoDB.entity.Persona;
import PAII.ConnectMongoDB.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    
    public Persona guardarPersona(Persona persona){
        personaRepository.save(persona);
        return persona;
    }
    
    public Persona consultarPersona(String cedula){
        Optional<Persona> consulta = Optional.empty();
        consulta  = personaRepository.findById(cedula); 
        if(consulta.isPresent()){
            return consulta.get();
        }
        return null;
    }
    
        public void borrarPersona(String cedula){
            personaRepository.deleteById(cedula);
        }
}
