package mx.unam.aragon.ico.is.avionesapi.services;

import mx.unam.aragon.ico.is.avionesapi.entities.Avion;
import mx.unam.aragon.ico.is.avionesapi.repositories.AvionRepository;
import mx.unam.aragon.ico.is.avionesapi.services.interfaz.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionesServiceIMPL implements AvionService {
    @Autowired
    private AvionRepository avionRepository;

    @Override
    public Avion crear(Avion avion) {
        return avionRepository.save(avion);
    }

    @Override
    public Iterable<Avion> listarTodas() {
        return avionRepository.findAll();
    }

    @Override
    public Optional<Avion> buscarPorId(int id) {
        return avionRepository.findById(id);
    }

    @Override
    public Avion actualizar(int id, Avion avion) {
        Optional<Avion> avionActualizado = avionRepository.findById(id);
        if (avionActualizado.isPresent()) {
            Avion avionActualizadoAux = avionActualizado.get();
            avionActualizadoAux.setModeloAvion(avion.getModeloAvion());
            avionActualizadoAux.setClave(avion.getClave());
            avionActualizadoAux.setUrlFoto(avion.getUrlFoto());
            avionActualizadoAux.setFabricanteAvion(avion.getFabricanteAvion());
            avionActualizadoAux.setCapacidadAvion(avion.getCapacidadAvion());
            return avionRepository.save(avionActualizadoAux);
        }
        else {
            return null;
        }
    }

    @Override
    public Avion eliminar(int id) {
        return avionRepository.deleteByClave(id);
    }
}
