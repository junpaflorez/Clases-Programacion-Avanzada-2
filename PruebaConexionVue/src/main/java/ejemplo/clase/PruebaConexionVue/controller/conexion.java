/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.clase.PruebaConexionVue.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/saludo")
public class conexion {
    
    @GetMapping("/saludo1")
    public ResponseEntity<?> saludo1(){
        return ResponseEntity.ok("hola completada la prueba");
    }
    
    @GetMapping("/imc")
    public ResponseEntity<?> icm(
        @RequestParam("peso") double peso,
        @RequestParam("altura") double altura){
        
        double icm = peso/((altura)*(altura));
        if(icm<=20){
            return ResponseEntity.ok("estas muy delgado");
        }
        else if(icm>20.1 && icm<=24){
            return ResponseEntity.ok("tenemos buen peso");
        }
        else if(icm>24.1 && icm<=30){
            return ResponseEntity.ok("obsidad");
        }
        return ResponseEntity.ok("Datos erroneos");
    }
}
