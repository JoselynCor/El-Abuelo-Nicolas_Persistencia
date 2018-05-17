package elabuelonicolas.dao.proveedor;

import static org.junit.Assert.assertNotEquals;
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
public class UpdateTest {
	@Inject
	ProveedorDao proveedorDao;
	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("MiniBodega");
		this.proveedor.setDireccion("Acatlan");
		this.proveedor.setContacto("Juan");
		this.proveedor.setTelefono("9515787892");
		this.proveedor.setEmail("juanmb@gmail.com");
		this.proveedor.setRfc("MDOOFJDK847832NJF");

		proveedorDao.create(this.proveedor);

		this.proveedor.setId(proveedorDao.last().getId());
	}

	@After
	public void tearDown() {
		this.proveedor = null;
	}

	@Test
	public void update() {
		Proveedor p = proveedorDao.read(this.proveedor.getId());
		try {
			System.out.println("Update");
			p.setNombre("Bodega");
			p.setDireccion("Puebla");
			p.setContacto("Jose");
			p.setTelefono("987654321");
			p.setEmail("joseortiz@outlook.com");
			p.setRfc("NIOJ950622HOMLCR05");
			proveedorDao.update(p);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.proveedor.getNombre(), p.getNombre());
		assertNotEquals(this.proveedor.getDireccion(), p.getDireccion());
		assertNotEquals(this.proveedor.getContacto(), p.getContacto());
		assertNotEquals(this.proveedor.getTelefono(), p.getTelefono());
		assertNotEquals(this.proveedor.getEmail(), p.getEmail());
		assertNotEquals(this.proveedor.getRfc(), p.getRfc());
	}

	@Test
	public void updateNombre() {
		try {
			System.out.println("UpdateName");
			proveedorDao.updateNombre(this.proveedor.getId(), "Jaime");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getNombre(), this.proveedor.getNombre());
		} catch (Exception e) {
			System.out.println("Error updateNombreTest: " + e);
		}
	}

	@Test
	public void updateDireccion() {
		try {
			System.out.println("UpdateAddress");
			proveedorDao.updateDireccion(this.proveedor.getId(), "Huajuapan");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getDireccion(), this.proveedor.getDireccion());
		} catch (Exception e) {
			System.out.println("Error updateDireccionTest: " + e);
		}
	}

	@Test
	public void updateContacto() {
		try {
			System.out.println("UpdateContact");
			proveedorDao.updateContacto(this.proveedor.getId(), "Egremy");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getContacto(), this.proveedor.getContacto());
		} catch (Exception e) {
			System.out.println("Error updateContactoTest: " + e);
		}
	}

	@Test
	public void updateTelefono() {
		try {
			System.out.println("UpdateNumber");
			proveedorDao.updateTelefono(this.proveedor.getId(), "192929929");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getTelefono(), this.proveedor.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateTelefonoTest: " + e);
		}
	}

	@Test
	public void updateEmail() {
		try {
			System.out.println("UpdateEmail");
			proveedorDao.updateEmail(this.proveedor.getId(), "ajsknas@hotmail.com");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getEmail(), this.proveedor.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateEmailTest: " + e);
		}
	}

	@Test
	public void updateRfc() {
		try {
			System.out.println("UpdateRfc");
			proveedorDao.updateRfc(this.proveedor.getId(), "KWUBEUW8B38DNW");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getRfc(), this.proveedor.getRfc());
		} catch (Exception e) {
			System.out.println("Error updateRfcTest: " + e);
		}
	}
}
