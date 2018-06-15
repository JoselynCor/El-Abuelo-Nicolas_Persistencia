package elabuelonicolas.dao.proveedor;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.dao.proveedor.ProveedorDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {
	@Inject
	ProveedorDao proveedorDao;

	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("Coopel");
		this.proveedor.setContacto("Nicolas");
		this.proveedor.setEmail("coopelhj@gmail.com");
		this.proveedor.setRfc("COPH455672HPLCRD55");
		this.proveedor.setTelefono("9531294557");
		this.proveedor.setEstado("Oaxaca");
		this.proveedor.setMunicipio("Putla");
		this.proveedor.setLocalidad("Putla");
		this.proveedor.setCodigopostal(71000);
		this.proveedor.setAsentamiento("Col. Centro");
		this.proveedor.setCalle("Oaxaca");
		this.proveedor.setNumero(123);
		this.proveedor.setStatus(1);
		proveedorDao.create(this.proveedor);
		this.proveedor.setId(proveedorDao.last().getId());
	}

	@After
	public void tearDown() {
		this.proveedor = null;
	}

	@Test
	public void delete() {
		try {
			int id = this.proveedor.getId();
			
			proveedorDao.delete(id);
			Proveedor p = proveedorDao.read(id);

			assertNull(p);
		} catch (Exception e) {
			System.out.println("Error deleteProveedorTest: " + e);
		}
	}
}
