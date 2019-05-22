package PAII.ConnectMongoDB.controller;

import PAII.ConnectMongoDB.entity.Persona;
import PAII.ConnectMongoDB.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @PostMapping("/guardarPersona")
    public ResponseEntity<?> guardarPersona(@RequestBody Persona persona){
        return ResponseEntity.ok(personaService.guardarPersona(persona));
    }
    
    @GetMapping
    public ResponseEntity<?> buscarPersona(@RequestParam("cedula") String cedula){
        return ResponseEntity.ok(personaService.consultarPersona(cedula));
    }
}
