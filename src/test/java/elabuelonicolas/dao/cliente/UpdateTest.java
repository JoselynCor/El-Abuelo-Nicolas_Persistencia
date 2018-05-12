package elabuelonicolas.dao.cliente;

import static org.junit.Assert.assertEquals;

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
		this.cliente.setNombre("Paco");
		this.cliente.setDireccion("Acatlima");
		this.cliente.setContacto("Josué");
		this.cliente.setTelefono("9515007892");
		this.cliente.setEmail("jlcastrogro@gmail.com");
		this.cliente.setRfc("CACG950419HOCSRS00");

		clienteDao.create(this.cliente);

		this.cliente.setId(clienteDao.lastClient().getId());
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void updateCliente() {
		Cliente c_antes = clienteDao.readById(this.cliente.getId());
		try {
			c_antes.setNombre("Luis");
			c_antes.setDireccion("Putla");
			c_antes.setContacto("Guerrero");
			c_antes.setTelefono("9535362391");
			c_antes.setEmail("jlcastrogro@outlook.com");
			c_antes.setRfc("QNEOQINE39NXWO3");
			clienteDao.update(c_antes);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
		Cliente c_despues = clienteDao.readById(this.cliente.getId());
		
		assertEquals(c_despues.getNombre(), c_antes.getNombre());
		assertEquals(c_despues.getDireccion(), c_antes.getDireccion());
		assertEquals(c_despues.getContacto(), c_antes.getContacto());
		assertEquals(c_despues.getTelefono(), c_antes.getTelefono());
		assertEquals(c_despues.getEmail(), c_antes.getEmail());
		assertEquals(c_despues.getRfc(), c_antes.getRfc());
	}

	@Test
	public void updateClienteName() {
		try {
			clienteDao.updateName(this.cliente.getId(), "Pedro");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getNombre(), "Pedro");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void updateClienteDireccion() {
		try {
			clienteDao.updateAddress(this.cliente.getId(), "Oaxaca");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getDireccion(), "Oaxaca");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void updateClienteContact() {
		try {
			clienteDao.updateContact(this.cliente.getId(), "Egremy");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getContacto(), "Egremy");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void updateClienteNumber() {
		try {
			clienteDao.updateNumber(this.cliente.getId(), "192929929");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getTelefono(), "192929929");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void updateClienteEmail() {
		try {
			clienteDao.updateEmail(this.cliente.getId(), "ajsknas@hotmail.com");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getEmail(), "ajsknas@hotmail.com");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void updateClienteRfc() {
		try {
			clienteDao.updateRfc(this.cliente.getId(), "KWUBEUW8B38DNW");
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getRfc(), "KWUBEUW8B38DNW");
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}
}
