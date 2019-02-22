package clases.ejercicio3.Service;

import clases.ejercicio3.Entity.Carro;

public interface CarroService {
    
    public Carro crearCarro(String placa,String tipoVehiculo, String color, int modelo);
}
