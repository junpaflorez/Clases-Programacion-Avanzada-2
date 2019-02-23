/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ejercicio3.Service;

import clases.ejercicio3.DTO.PersonaDTO;

/**
 *
 * @author Estudiantes
 */
public interface PersonaService {
    
    public PersonaDTO nuevaPersona(String nombre,String telefono,int edad, String correo);
}
