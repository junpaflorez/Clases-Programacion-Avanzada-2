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
    
    //Funcion que me permite "guardar" una persona en base de datos (cabe resaltar que falta la conexion a base de datos)
    public boolean registrarPersona(PersonaDTO personaDTO){
        Persona persona = new Persona();
        persona = PersonaDTOToPersona(personaDTO);
        if(persona.getNombre().matches(personaDTO.getNombre())){
            return true;
        }
        return false;
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
    
    /*
        funcion necesaria, para pasar del objeto PersonaDTO a Persona,
        recordar el ejemplo de los gemelos.
    */
    public Persona PersonaDTOToPersona(PersonaDTO personaDTO){
        Persona persona = new Persona();
        persona.setNombre(personaDTO.getNombre());
        persona.setApellido(personaDTO.getApellido());
        persona.setEdad(personaDTO.getEdad());
        persona.setCorreo(personaDTO.getCorreo());
        persona.setCiudad_nacimiento(personaDTO.getCiudad_nacimiento());
        return persona;
    }
    
    
    
}
