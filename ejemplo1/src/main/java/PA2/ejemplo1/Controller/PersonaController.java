package PA2.ejemplo1.Controller;

import PA2.ejemplo1.DTO.PersonaDTO;
import PA2.ejemplo1.Services.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//necesario para indicar que son servicios Rest
@RequestMapping("/api/persona")//necesario para indicar cual es la URL, del controlador
public class PersonaController {
    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    /*
    Consult = consultar
    Registry = registrar
    Update = actualizar
    Delete = eliminar
    */
    /*
        GetMapping: URL, que indica cual es el metodo a utilizar
        RequestParam: recibe para recibir valores por URL
    */
    @GetMapping("/consultarPersona")
    public ResponseEntity<?> consultarPersona(@RequestParam("nombre") String nombre){
        if(!nombre.matches("")){
            //PersonaDTO personaDTO = personaService.consultarPersona(nombre);
            //return ResponseEntity.ok(personaDTO);
            return ResponseEntity.ok(personaService.consultarPersona(nombre));
        }
        return ResponseEntity.notFound().build();
    }
    
}
