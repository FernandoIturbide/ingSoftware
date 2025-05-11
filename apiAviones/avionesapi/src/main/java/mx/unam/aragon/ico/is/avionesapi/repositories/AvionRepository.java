package mx.unam.aragon.ico.is.avionesapi.repositories;


import mx.unam.aragon.ico.is.avionesapi.entities.Avion;
import org.springframework.data.repository.CrudRepository;

public interface AvionRepository extends CrudRepository<Avion, Integer> {
    public Avion findAvionsByClave(int clave);
    public Avion deleteByClave(int clave);
}
