package elabuelonicolas.dao.proveedor;

import static org.junit.Assert.assertEquals;
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
public class CreateTest {
	@Inject
	ProveedorDao proveedorDao;

	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("Elektra");
		this.proveedor.setContacto("Jose");
		this.proveedor.setDireccion("Huajuapan");
		this.proveedor.setEmail("elektrahj@gmail.com");
		this.proveedor.setRfc("EKHJ984317HPLCRM09");
		this.proveedor.setTelefono("9551239856");
	}

	@After
	public void tearDown() {
		this.proveedor = null;
	}
	
	@Test
	public void create() {
		try {
			proveedorDao.create(this.proveedor);
			
			Proveedor c = proveedorDao.last();

			assertEquals(c.getNombre(), this.proveedor.getNombre());
		} catch (Exception e) {
			System.out.println("Error createTest: " + e);
		}
	}
}
