/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Ejercicio2.service.impl;

import clases.Ejercicio2.service.PersonaService;

/**
 *
 * @author junpa
 */
public class DefaultPersonaService implements PersonaService{

    @Override
    public String edad(int edad) {
        if(edad>=50){
            return "hola Señor de edad adulta";
        }
        return "hola jovenzuelo de corta edad";
    }
    
}
