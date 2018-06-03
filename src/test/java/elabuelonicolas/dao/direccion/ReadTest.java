package elabuelonicolas.dao.direccion;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Direccion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	DireccionDao direccionDao;

	@Test
	public void read() {
		try {
			Direccion direccion = direccionDao.read(1);
			assertEquals((int) direccion.getId(), 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByPais() {
		try {
			List<Direccion> direccion = direccionDao.readByPais("México");
			assertEquals(direccion.get(0).getPais(), "México");
		} catch (Exception e) {
			System.out.println("Error readByPaisTest: " + e);
		}
	}

	@Test
	public void readByNumero() {
		try {
			Direccion direccion = direccionDao.readByNumero(22);
			assertEquals((int) direccion.getNumero(), 22);
		} catch (Exception e) {
			System.out.println("Error readByNumeroTest: " + e);
		}
	}

	@Test
	public void readByEstado() {
		try {
			List<Direccion> direccion = direccionDao.readByEstado("Oaxaca");
			assertEquals(direccion.get(0).getEstado(), "Oaxaca");
		} catch (Exception e) {
			System.out.println("Error readByEstadoTest: " + e);
		}
	}

	@Test
	public void readByCiudad() {
		try {
			List<Direccion> direccion = direccionDao.readByCiudad("Huajuapan");
			assertEquals(direccion.get(0).getCiudad(), "Huajuapan");
		} catch (Exception e) {
			System.out.println("Error readByCiudadTest: " + e);
		}
	}

	@Test
	public void readByColonia() {
		try {
			List<Direccion> direccion = direccionDao.readByColonia("Centro");
			assertEquals(direccion.get(0).getColonia(), "Centro");
		} catch (Exception e) {
			System.out.println("Error readByColoniaTest: " + e);
		}
	}

	@Test
	public void readByCalle() {
		try {
			List<Direccion> direccion = direccionDao.readByCalle("Oaxaca");
			assertEquals(direccion.get(0).getCalle(), "Oaxaca");
		} catch (Exception e) {
			System.out.println("Error readByCalleTest: " + e);
		}
	}
}
