package PA2.ejemplo1.Controller;

import PA2.ejemplo1.DTO.PersonaDTO;
import PA2.ejemplo1.Services.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//necesario para indicar que son servicios Rest
@RequestMapping("/api/persona")//necesario para indicar cual es la URL, del controlador
public class PersonaController {
    private PersonaService personaService;
    //constructor super necesario para poder ejecutar los servicios y demas metodos de clases diferentes a los metodos presentados en esta
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
    
    /*
        Funcion encargada de registrar Personas en la base de datos
        PostMapping: URL, que indica cual es el metodo a utilizar y recibir por POST
        @RequestBody: permite recibir un objeto tipo JSON en el Body de la peticion HTTP
    */
    @PostMapping("/registrarPersona")
    public ResponseEntity<?> registrarPersona(@RequestBody PersonaDTO personaDTO){
        boolean respuesta = false;
        respuesta = personaService.registrarPersona(personaDTO);
        if(respuesta){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
