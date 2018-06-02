package elabuelonicolas.dao.proveedor;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Proveedor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ProveedorDao proveedorDao;

	@Test
	public void read() {
		try {
			Proveedor p = proveedorDao.read(1);
			assertEquals((int) p.getId(), 1);
		} catch (Exception e) {
			System.out.println("Error readProveedorTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByNombre("José Luis");
			assertEquals(proveedor.get(0).getNombre(), "José Luis");
		} catch (Exception e) {
			System.out.println("Error readProveedorByNombreTest: " + e);
		}
	}

	@Test
	public void readByDireccion() {
		try {
			Proveedor proveedor = proveedorDao.readByDireccion(1);
			assertEquals((int) proveedor.getIddireccion(), 1);
		} catch (Exception e) {
			System.out.println("Error readProveedorByDireccionTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByContacto("Nicolás");
			assertEquals(proveedor.get(0).getContacto(), "Nicolás");
		} catch (Exception e) {
			System.out.println("Error readProveedorByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByTelefono("351354343");
			assertEquals(proveedor.get(0).getTelefono(), "351354343");
		} catch (Exception e) {
			System.out.println("Error readProveedorByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByEmail("josejaime@gmail.com");
			assertEquals(proveedor.get(0).getEmail(), "josejaime@gmail.com");
		} catch (Exception e) {
			System.out.println("Error readProveedorByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByRfc("UHS2K28HJ3N3");
			assertEquals(proveedor.get(0).getRfc(), "UHS2K28HJ3N3");
		} catch (Exception e) {
			System.out.println("Error readProveedorByRfcTest: " + e);
		}
	}
}
