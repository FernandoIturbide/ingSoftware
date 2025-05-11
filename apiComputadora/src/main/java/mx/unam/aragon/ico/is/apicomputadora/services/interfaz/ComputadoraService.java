package mx.unam.aragon.ico.is.apicomputadora.services.interfaz;

import mx.unam.aragon.ico.is.apicomputadora.entities.Computadora;

import java.util.Optional;

public interface ComputadoraService {
    public abstract Computadora crear(Computadora computadora);
    public abstract Iterable<Computadora> listarTodas();
    public abstract Optional<Computadora> buscarPorId(Long clave);
    public abstract Computadora actualizar(Long clave, Computadora computadora);
    public abstract Computadora eliminar(Long clave);
}
