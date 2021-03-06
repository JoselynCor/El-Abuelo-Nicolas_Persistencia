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
		this.proveedor.setContacto("Juan");
		this.proveedor.setTelefono("9515787892");
		this.proveedor.setEmail("juanmb@gmail.com");
		this.proveedor.setRfc("MDOOFJDK847832NJF");
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
		proveedorDao.delete(this.proveedor.getId());
	}

	@Test
	public void update() {
		Proveedor p = proveedorDao.read(this.proveedor.getId());
		try {
			p.setNombre("Bodega");
			p.setContacto("Jose");
			p.setTelefono("987654321");
			p.setEmail("joseortiz@outlook.com");
			p.setRfc("NIOJ950622HOMLCR05");
			p.setEstado("Oaxaca");
			p.setMunicipio("Putla");
			p.setLocalidad("Putla");
			p.setCodigopostal(71000);
			p.setAsentamiento("Col. Centro");
			p.setCalle("Oaxaca");
			p.setNumero(123);
			p.setStatus(1);
			proveedorDao.update(p);
		} catch (Exception e) {
			System.out.println("Error updateProveedorTest: " + e);
		}

		assertNotEquals(this.proveedor.getNombre(), p.getNombre());
		assertNotEquals(this.proveedor.getContacto(), p.getContacto());
		assertNotEquals(this.proveedor.getTelefono(), p.getTelefono());
		assertNotEquals(this.proveedor.getEmail(), p.getEmail());
		assertNotEquals(this.proveedor.getRfc(), p.getRfc());
	}

	@Test
	public void updateNombre() {
		try {
			proveedorDao.updateNombre(this.proveedor.getId(), "Jaime");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getNombre(), this.proveedor.getNombre());
		} catch (Exception e) {
			System.out.println("Error updateProveedorNombreTest: " + e);
		}
	}

	@Test
	public void updateContacto() {
		try {
			proveedorDao.updateContacto(this.proveedor.getId(), "Egremy");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getContacto(), this.proveedor.getContacto());
		} catch (Exception e) {
			System.out.println("Error updateProveedorContactoTest: " + e);
		}
	}

	@Test
	public void updateTelefono() {
		try {
			proveedorDao.updateTelefono(this.proveedor.getId(), "192929929");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getTelefono(), this.proveedor.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateProveedorTelefonoTest: " + e);
		}
	}

	@Test
	public void updateEmail() {
		try {
			proveedorDao.updateEmail(this.proveedor.getId(), "ajsknas@hotmail.com");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getEmail(), this.proveedor.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateProveedorEmailTest: " + e);
		}
	}

	@Test
	public void updateRfc() {
		try {
			proveedorDao.updateRfc(this.proveedor.getId(), "KWUBEUW8B38DNW");
			Proveedor p = proveedorDao.read(this.proveedor.getId());
			assertNotEquals(p.getRfc(), this.proveedor.getRfc());
		} catch (Exception e) {
			System.out.println("Error updateProveedorRfcTest: " + e);
		}
	}
}
