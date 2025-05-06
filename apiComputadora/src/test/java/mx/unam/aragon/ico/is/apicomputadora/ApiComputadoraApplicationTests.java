package mx.unam.aragon.ico.is.apicomputadora;

import mx.unam.aragon.ico.is.apicomputadora.entities.Computadora;
import mx.unam.aragon.ico.is.apicomputadora.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiComputadoraApplicationTests {
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertComputadora() {

        Computadora computadora = new Computadora(0, "HP", "Pavillion 2000",null,13000);
        computadoraRepository.save(computadora);

    }

    @Test
    void leerComputadora() {
        Long claveTmp=4L;
        Computadora tmp=computadoraRepository.findComputadoraByClave(claveTmp);
        System.out.println(tmp);
    }

    @Test
    public void eliminarComputadora() {
        Long claveTmp=3L;
        computadoraRepository.deleteById(claveTmp);
    }

    @Test
    public void actualizarComputadora() {
        Long claveTmp=4L;
        Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
        tmp.setModelo("Patita 3000");

        computadoraRepository.save(
                tmp
        );
    }

}
