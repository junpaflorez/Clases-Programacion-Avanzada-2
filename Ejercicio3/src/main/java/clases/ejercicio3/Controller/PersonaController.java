/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ejercicio3.Controller;

import clases.ejercicio3.DTO.PersonaDTO;
import clases.ejercicio3.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @PostMapping("/nuevaPersona")
    public ResponseEntity<?> nuevaPersona(
        @RequestParam("nombreCompleto") String nombre,
        @RequestParam("telefono") String telefono,
        @RequestParam("edad") int edad,
        @RequestParam("correo") String correo){
        
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO = personaService.nuevaPersona(nombre,telefono,edad,correo);
        return ResponseEntity.ok(personaDTO);
    }
    
}
