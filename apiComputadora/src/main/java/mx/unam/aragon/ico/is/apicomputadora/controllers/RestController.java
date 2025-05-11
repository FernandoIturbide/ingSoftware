package mx.unam.aragon.ico.is.apicomputadora.controllers;

import mx.unam.aragon.ico.is.apicomputadora.entities.Computadora;
import mx.unam.aragon.ico.is.apicomputadora.services.interfaz.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/computadoras")
public class RestController {
    @Autowired
    private ComputadoraService computadoraService;

    @GetMapping
    public ResponseEntity<Iterable<Computadora>> getComputadoras(){
        //return computadoraService.listarTodas();
        return new ResponseEntity<>(computadoraService.listarTodas(), HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Computadora> getComputadora(@PathVariable Long id){
        //return  computadoraService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(computadoraService.buscarPorId(id).orElse(null));
    }

    @PostMapping
    public ResponseEntity<Computadora> createComputadora(@RequestBody Computadora computadora) throws URISyntaxException {
        //return computadoraService.crear(computadora);
        return ResponseEntity.created(new URI("http://localhost:8082")).body(computadoraService.crear(computadora));
    }
}
