package elabuelonicolas.dao.cliente;

import static org.junit.Assert.assertEquals;

import java.util.List;
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
public class ReadTest {
	@Inject
	ClienteDao clienteDao;

	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("Paco");
		this.cliente.setDireccion("Acatlima");
		this.cliente.setContacto("Josué");
		this.cliente.setTelefono("951507892");
		this.cliente.setEmail("jlgro@gmail.com");
		this.cliente.setRfc("CACG960419HOCSRS00");

		clienteDao.create(this.cliente);

		this.cliente.setId(clienteDao.lastClient().getId());
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void readCliente() {
		try {
			Cliente c = clienteDao.readById(this.cliente.getId());
			assertEquals(c.getId(), this.cliente.getId());
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readClienteByName() {
		try {
			List<Cliente> clientes = clienteDao.readByName(this.cliente.getNombre());
			assertEquals(clientes.get(0).getNombre(), this.cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error readByNameTest: " + e);
		}
	}

	@Test
	public void readClienteAddress() {
		try {
			List<Cliente> clientes = clienteDao.readByAddress(this.cliente.getDireccion());
			assertEquals(clientes.get(0).getDireccion(), this.cliente.getDireccion());
		} catch (Exception e) {
			System.out.println("Error readByAddresTest: " + e);
		}
	}

	@Test
	public void readClienteByContact() {
		try {
			List<Cliente> clientes = clienteDao.readByContact(this.cliente.getContacto());
			assertEquals(clientes.get(0).getContacto(), this.cliente.getContacto());
		} catch (Exception e) {
			System.out.println("Error readByContactTest: " + e);
		}
	}

	@Test
	public void readClienteByNumber() {
		try {
			List<Cliente> clientes = clienteDao.readByNumber(this.cliente.getTelefono());
			assertEquals(clientes.get(0).getTelefono(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error readByNumberTest: " + e);
		}
	}

	@Test
	public void readClienteByEmail() {
		try {
			List<Cliente> clientes = clienteDao.readByEmail(this.cliente.getEmail());
			assertEquals(clientes.get(0).getEmail(), this.cliente.getEmail());
		} catch (Exception e) {
			System.out.println("Error readByEmailTest: " + e);
		}
	}

	@Test
	public void readClienteByRfc() {
		try {
			List<Cliente> clientes = clienteDao.readByRfc(this.cliente.getRfc());
			assertEquals(clientes.get(0).getRfc(), this.cliente.getRfc());
		} catch (Exception e) {
			System.out.println("Error readByRfcTest: " + e);
		}
	}
}
