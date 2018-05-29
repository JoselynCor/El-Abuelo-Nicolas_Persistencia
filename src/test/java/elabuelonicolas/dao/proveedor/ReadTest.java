package elabuelonicolas.dao.proveedor;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
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

	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("Similares");
		this.proveedor.setIddireccion(1);
		this.proveedor.setContacto("Juan");
		this.proveedor.setTelefono("9551228766");
		this.proveedor.setEmail("simihj@gmail.com");
		this.proveedor.setRfc("SIMI874310YECMOI79");

		proveedorDao.create(this.proveedor);

		this.proveedor.setId(proveedorDao.last().getId());
	}

	@After
	public void tearDown() {
		this.proveedor = null;
	}

	@Test
	public void read() {
		try {
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertEquals(p.getId(), this.proveedor.getId());
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByNombre(this.proveedor.getNombre());
			assertEquals(proveedor.get(0).getNombre(), this.proveedor.getNombre());
		} catch (Exception e) {
			System.out.println("Error readByNombreTest: " + e);
		}
	}

	@Test
	public void readByDireccion() {
		try {
			Proveedor proveedor = proveedorDao.readByDireccion(this.proveedor.getIddireccion());
			assertEquals(proveedor.getIddireccion(), this.proveedor.getIddireccion());
		} catch (Exception e) {
			System.out.println("Error readByDireccionTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByContacto(this.proveedor.getContacto());
			assertEquals(proveedor.get(0).getContacto(), this.proveedor.getContacto());
		} catch (Exception e) {
			System.out.println("Error readByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByTelefono(this.proveedor.getTelefono());
			assertEquals(proveedor.get(0).getTelefono(), this.proveedor.getTelefono());
		} catch (Exception e) {
			System.out.println("Error readByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByEmail(this.proveedor.getEmail());
			assertEquals(proveedor.get(0).getEmail(), this.proveedor.getEmail());
		} catch (Exception e) {
			System.out.println("Error readByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			List<Proveedor> proveedor = proveedorDao.readByRfc(this.proveedor.getRfc());
			assertEquals(proveedor.get(0).getRfc(), this.proveedor.getRfc());
		} catch (Exception e) {
			System.out.println("Error readByRfcTest: " + e);
		}
	}
}
