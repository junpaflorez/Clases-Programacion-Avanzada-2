package PAII.ConnectMongoDB.service;

import PAII.ConnectMongoDB.entity.Persona;
import PAII.ConnectMongoDB.repository.PersonaRepository;
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
    
    
}
