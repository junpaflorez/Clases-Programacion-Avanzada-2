/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Ejercicio2.controller;

import clases.Ejercicio2.dto.PersonaDTO;
import clases.Ejercicio2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/comparacionEdad")
    public ResponseEntity<?> comparacionEdad(
        @RequestParam("edad")int edad){
        
        String resultado = "";
        resultado = personaService.comparacionEdad(edad);
        return ResponseEntity.ok(resultado);
    }
    
    @PostMapping("/ingresarPersona")
    public ResponseEntity<?> ingresarPersona(
        @RequestParam("nombre") String nombre,
        @RequestParam("edad") int edad,
        @RequestParam("correo") String correo,
        @RequestParam("telefono") String telefono){
        
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setTelefono(telefono);
        persona.setCorreo(correo);
        
        return ResponseEntity.ok(persona);
    }
    
    @GetMapping("/comparacionEntreEdades")
    public ResponseEntity<?> comparacionEntreEdades(
        @RequestParam("edad1") int edad1,
        @RequestParam("edad2") int edad2){
        
        String resultado ="";
        resultado = personaService.comparacionEntreEdades(edad1,edad2);
        
        return ResponseEntity.ok(resultado);
        
    }
}
