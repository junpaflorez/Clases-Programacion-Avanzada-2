package clases.ejercicio3.Service.impl;

import clases.ejercicio3.Service.PersonaService;
import clases.ejercicio3.DTO.PersonaDTO;
import clases.ejercicio3.Entity.Persona;
import clases.ejercicio3.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultPersonaService implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public PersonaDTO nuevaPersona(String nombreCompleto, String telefono, int edad, String correo) {
        Persona persona = new Persona();
        persona.setNombre(nombreCompleto);
        persona.setApellido(nombreCompleto);
        persona.setEdad(edad);
        persona.setCorreo(correo);
        persona.setTelefono(telefono);
        personaRepository.save(persona);
        return PersonaToPersonaDTO(persona);        
    }
    
    //Cambiamos el objeto Persona a PersonaDTO para que el controlador pueda trabajar con el
    public PersonaDTO PersonaToPersonaDTO(Persona persona){
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombreCompleto(persona.getNombre());
        personaDTO.setEdad(persona.getEdad());
        personaDTO.setTelefono(persona.getTelefono());
        personaDTO.setCorreo(persona.getCorreo());
        return personaDTO;
    }
    
}
