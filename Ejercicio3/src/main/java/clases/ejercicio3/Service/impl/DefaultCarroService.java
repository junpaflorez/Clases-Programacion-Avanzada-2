
package clases.ejercicio3.Service.impl;

import clases.ejercicio3.DTO.CarroDTO;
import clases.ejercicio3.Entity.Carro;
import clases.ejercicio3.Repository.CarroRepository;
import clases.ejercicio3.Service.CarroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCarroService implements CarroService{
    @Autowired
    private CarroRepository carroRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CarroDTO crearCarro(String placa, String tipoVehiculo, String color, int modelo) {
        Carro carro = new Carro();
        carro.setPlaca(placa);
        carro.setTipoVehiculo(tipoVehiculo);
        carro.setModelo(modelo);
        carro.setColor(color);
        carroRepository.save(carro);
        return modelMapper.map(carro, CarroDTO.class);
    }
    
    
    
}
