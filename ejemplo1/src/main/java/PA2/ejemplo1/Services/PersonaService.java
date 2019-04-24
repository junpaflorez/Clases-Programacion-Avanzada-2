package PA2.ejemplo1.Services;

import PA2.ejemplo1.DTO.PersonaDTO;
import PA2.ejemplo1.Entity.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    //Funcion para enviar una persona al controlador -> como un DTO
    public PersonaDTO consultarPersona(String nombre){
        Persona persona = new Persona();
        persona.setNombre("juanito");
        persona.setApellido("alimaña");
        persona.setEdad(18);
        persona.setCorreo("alimaña18@gmail.com");
        persona.setCiudad_nacimiento("Pereira");
        if(nombre.matches(persona.getNombre())){
            return PersonaToPersonaDTO(persona);
        }
        return null;
    }
    
    /*
        funcion necesaria, para pasar del objeto Persona a PersonaDTO,
        recordar el ejemplo de los gemelos.
    */
    public PersonaDTO PersonaToPersonaDTO(Persona persona){
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombre(persona.getNombre());
        personaDTO.setApellido(persona.getApellido());
        personaDTO.setEdad(persona.getEdad());
        personaDTO.setCorreo(persona.getCorreo());
        personaDTO.setCiudad_nacimiento(persona.getCiudad_nacimiento());
        return personaDTO;
    }
    
    
    
}
