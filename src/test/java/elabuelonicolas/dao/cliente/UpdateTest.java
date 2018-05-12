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
		this.cliente.setDireccion("Oaxaca");
		this.cliente.setContacto("José");
		this.cliente.setTelefono("9515787892");
		this.cliente.setEmail("pedro@gmail.com");
		this.cliente.setRfc("QBUE72BDU");

		clienteDao.create(this.cliente);

		this.cliente.setId(clienteDao.lastClient().getId());
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void update() {
		Cliente c = clienteDao.readById(this.cliente.getId());
		try {
			System.out.println("Update");
			c.setNombre("Luis");
			c.setDireccion("Putla");
			c.setContacto("Guerrero");
			c.setTelefono("9535362398");
			c.setEmail("jlcastrogro@outlook.com");
			c.setRfc("QNEOQINE39NXWO3");
			clienteDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.cliente.getNombre(), c.getNombre());
		assertNotEquals(this.cliente.getDireccion(), c.getDireccion());
		assertNotEquals(this.cliente.getContacto(), c.getContacto());
		assertNotEquals(this.cliente.getTelefono(), c.getTelefono());
		assertNotEquals(this.cliente.getEmail(), c.getEmail());
		assertNotEquals(this.cliente.getRfc(), c.getRfc());
	}

	@Test
	public void updateName() {
		try {
			System.out.println("UpdateName");
			clienteDao.updateName(this.cliente.getId(), "Jaime");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getNombre(), this.cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error updateNameTest: " + e);
		}
	}

	@Test
	public void updateAddress() {
		try {
			System.out.println("UpdateAddress");
			clienteDao.updateAddress(this.cliente.getId(), "Huajuapan");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getDireccion(), this.cliente.getDireccion());
		} catch (Exception e) {
			System.out.println("Error updateAddressTest: " + e);
		}
	}

	@Test
	public void updateContact() {
		try {
			System.out.println("UpdateContact");
			clienteDao.updateContact(this.cliente.getId(), "Egremy");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getContacto(), this.cliente.getContacto());
		} catch (Exception e) {
			System.out.println("Error updateContactTest: " + e);
		}
	}

	@Test
	public void updateNumber() {
		try {
			System.out.println("UpdateNumber");
			clienteDao.updateNumber(this.cliente.getId(), "192929929");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getTelefono(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateNumberTest: " + e);
		}
	}

	@Test
	public void updateEmail() {
		try {
			System.out.println("UpdateEmail");
			clienteDao.updateEmail(this.cliente.getId(), "ajsknas@hotmail.com");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getEmail(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateEmailTest: " + e);
		}
	}

	@Test
	public void updateRfc() {
		try {
			System.out.println("UpdateRfc");
			clienteDao.updateRfc(this.cliente.getId(), "KWUBEUW8B38DNW");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertNotEquals(c.getRfc(), this.cliente.getRfc());
		} catch (Exception e) {
			System.out.println("Error updateRfcTest: " + e);
		}
	}
}
