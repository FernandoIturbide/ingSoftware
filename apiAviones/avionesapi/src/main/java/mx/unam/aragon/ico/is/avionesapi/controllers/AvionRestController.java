package mx.unam.aragon.ico.is.avionesapi.controllers;

import mx.unam.aragon.ico.is.avionesapi.entities.Avion;
import mx.unam.aragon.ico.is.avionesapi.services.interfaz.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v1/aviones")
public class AvionRestController {
    @Autowired
    private AvionService avionService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Avion>> getAviones(){
        return new ResponseEntity<>(avionService.listarTodas(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Avion> createAvion(@RequestBody Avion avion) throws URISyntaxException {

        return ResponseEntity.created(new URI("http://localhost:5656")).body(avionService.crear(avion));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Avion> getAvion(@PathVariable int id){
        //return avionService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(avionService.buscarPorId(id).orElse(null));
    }

}
