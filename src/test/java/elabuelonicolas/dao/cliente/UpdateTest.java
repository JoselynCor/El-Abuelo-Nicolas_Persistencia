package elabuelonicolas.dao.cliente;

import static org.junit.Assert.assertNotEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Cliente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	ClienteDao clienteDao;
	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("Pedro");
		this.cliente.setContacto("José");
		this.cliente.setTelefono("9515787892");
		this.cliente.setEmail("pedro@gmail.com");
		this.cliente.setRfc("QBUE72BDU");
		this.cliente.setEstado("Oaxaca");
		this.cliente.setMunicipio("Putla");
		this.cliente.setLocalidad("Putla");
		this.cliente.setCodigopostal(71000);
		this.cliente.setAsentamiento("Col. Centro");
		this.cliente.setCalle("Oaxaca");
		this.cliente.setNumero(123);
		this.cliente.setStatus(1);
		clienteDao.create(this.cliente);

		this.cliente.setId(clienteDao.last().getId());
	}

	@After
	public void tearDown() {
		clienteDao.delete(this.cliente.getId());
	}

	@Test
	public void update() {
		Cliente c = clienteDao.read(this.cliente.getId());
		try {
			c.setNombre("Luis");
			c.setContacto("Guerrero");
			c.setTelefono("9535362398");
			c.setEmail("jlcastrogro@outlook.com");
			c.setRfc("QNEOQINE39NXWO3");
			clienteDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.cliente.getNombre(), c.getNombre());
		assertNotEquals(this.cliente.getContacto(), c.getContacto());
		assertNotEquals(this.cliente.getTelefono(), c.getTelefono());
		assertNotEquals(this.cliente.getEmail(), c.getEmail());
		assertNotEquals(this.cliente.getRfc(), c.getRfc());
	}

	@Test
	public void updateNombre() {
		try {
			clienteDao.updateNombre(this.cliente.getId(), "Jaime");
			Cliente c = clienteDao.read(this.cliente.getId());
			assertNotEquals(c.getNombre(), this.cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error updateNombreTest: " + e);
		}
	}

	@Test
	public void updateContacto() {
		try {
			clienteDao.updateContacto(this.cliente.getId(), "Egremy");
			Cliente c = clienteDao.read(this.cliente.getId());
			assertNotEquals(c.getContacto(), this.cliente.getContacto());
		} catch (Exception e) {
			System.out.println("Error updateContactoTest: " + e);
		}
	}

	@Test
	public void updateTelefono() {
		try {
			clienteDao.updateTelefono(this.cliente.getId(), "192929929");
			Cliente c = clienteDao.read(this.cliente.getId());
			assertNotEquals(c.getTelefono(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateTelefonoTest: " + e);
		}
	}

	@Test
	public void updateEmail() {
		try {
			clienteDao.updateEmail(this.cliente.getId(), "ajsknas@hotmail.com");
			Cliente c = clienteDao.read(this.cliente.getId());
			assertNotEquals(c.getEmail(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateEmailTest: " + e);
		}
	}

	@Test
	public void updateRfc() {
		try {
			clienteDao.updateRfc(this.cliente.getId(), "KWUBEUW8B38DNW");
			Cliente c = clienteDao.read(this.cliente.getId());
			assertNotEquals(c.getRfc(), this.cliente.getRfc());
		} catch (Exception e) {
			System.out.println("Error updateRfcTest: " + e);
		}
	}
}
