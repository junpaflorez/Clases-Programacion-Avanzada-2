
package clases.ejercicio3.Controller;

import clases.ejercicio3.DTO.CarroDTO;
import clases.ejercicio3.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {
    @Autowired
    private CarroService carroService;
    
    @PostMapping("/crearCarro")
    public ResponseEntity<?> crearCarro(
        @RequestParam("placa") String placa,
        @RequestParam("tipoVehiculo") String tipoVehiulo,
        @RequestParam("color") String color,
        @RequestParam("modelo") int modelo){
        
        CarroDTO carro = new CarroDTO();
        carro = carroService.crearCarro(placa, tipoVehiulo, color, modelo);
        
        return ResponseEntity.ok(carro);
        
    }
    
    @PostMapping("/actualizarCarro")
    public ResponseEntity<?> editarCarro(
        @RequestBody CarroDTO carro){
        CarroDTO carroDTO = new CarroDTO();
        carroDTO = carroService.editarCarro(carro);
        return ResponseEntity.ok(carroDTO);
    }
}
