package mx.unam.aragon.ico.is.avionesapi.services.interfaz;

import mx.unam.aragon.ico.is.avionesapi.entities.Avion;

import java.util.Optional;

public interface AvionService {
    public abstract Avion crear(Avion avion);
    public abstract Iterable<Avion> listarTodas();
    public abstract Optional<Avion> buscarPorId(int id);
    public abstract Avion actualizar(int id, Avion avion);
    public abstract Avion eliminar(int id);
}
