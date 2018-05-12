package elabuelonicolas.dao.cliente;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.dao.cliente.ClienteDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {

	@Inject
	ClienteDao clienteDao;

	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("Luis");
		this.cliente.setContacto("Josué");
		this.cliente.setDireccion("Acatlima");
		this.cliente.setEmail("jlcastrogro@gmail.com");
		this.cliente.setRfc("CACG950419HOCSRS00");
		this.cliente.setTelefono("9515007892");
		clienteDao.create(this.cliente);
		this.cliente = clienteDao.lastClient();
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void deleteCliente() {
		try {
			clienteDao.delete(this.cliente.getId());

			int id = this.cliente.getId();
			Cliente c = clienteDao.readById(id);

			assertNull(c);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
