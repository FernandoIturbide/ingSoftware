package mx.unam.aragon.ico.is.avionesapi;

import mx.unam.aragon.ico.is.avionesapi.entities.Avion;
import mx.unam.aragon.ico.is.avionesapi.repositories.AvionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AvionesapiApplicationTests {
	@Autowired
	private AvionRepository avionRepository;


	@Test
	void contextLoads() {
	}

	@Test
	void insertAvion() {
		Avion avion = new Avion(0,"A320", "Airbus", 180,"");
		avionRepository.save(avion);
	}
	@Test
	void leerAvion() {
		int idTmp = 2;
		Avion tmp = avionRepository.findAvionsByClave(idTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarAvion() {
		int idTmp = 11;
		avionRepository.deleteById(idTmp);
	}

	@Test
	public void actualizarAvion() {
		int claveTmp=4;
		Avion tmp = avionRepository.findAvionsByClave(claveTmp);
		tmp.setModeloAvion("Boeing 3000");

		avionRepository.save(
				tmp
		);
	}

}
