/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Ejercicio2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Persona")
public class PersonaController {
    
    @GetMapping("/nombre")
    public ResponseEntity<?> nombre(){
        return ResponseEntity.ok("juan pablo");
    }
    
}
