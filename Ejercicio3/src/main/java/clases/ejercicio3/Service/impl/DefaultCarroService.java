
package clases.ejercicio3.Service.impl;

import clases.ejercicio3.DTO.CarroDTO;
import clases.ejercicio3.Entity.Carro;
import clases.ejercicio3.Repository.CarroRepository;
import clases.ejercicio3.Service.CarroService;
import java.util.Optional;
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

    @Override
    public CarroDTO editarCarro(CarroDTO carro) {
        Carro carroEntidad = new Carro();
        carroEntidad = modelMapper.map(carro, Carro.class);
        carroRepository.save(carroEntidad);
        return carro;
    }

    @Override
    public CarroDTO eliminarCarro(CarroDTO carro) {
        carroRepository.deleteById(carro.getPlaca());
        return carro;
    }

    @Override
    public String existeElCarro(CarroDTO carro) {
        Optional<Carro> consulta = null;
        Carro CarroEncontrado = new Carro();
        consulta = carroRepository.findById(carro.getPlaca());
        if(consulta.isPresent()){
            CarroEncontrado = consulta.get();
            return "el carro Existe : " + CarroEncontrado.getTipoVehiculo();
        }
        return "el carro no existe";
    }
    
}
