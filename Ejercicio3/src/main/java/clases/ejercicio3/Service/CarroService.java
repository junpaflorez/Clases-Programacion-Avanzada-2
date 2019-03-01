package clases.ejercicio3.Service;

import clases.ejercicio3.DTO.CarroDTO;
import clases.ejercicio3.Entity.Carro;

public interface CarroService {
    
    public CarroDTO crearCarro(String placa,String tipoVehiculo, String color, int modelo);
    
    public CarroDTO editarCarro(CarroDTO carro);
    
    public CarroDTO eliminarCarro(CarroDTO carro); 
}
