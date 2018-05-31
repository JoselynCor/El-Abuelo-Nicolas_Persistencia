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
public class CreateTest {
	@Inject
	ClienteDao clienteDao;

	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("José");
		this.cliente.setContacto("Josué");
		this.cliente.setIddireccion(5);
		this.cliente.setEmail("jlcastro@gmail.com");
		this.cliente.setRfc("CACG950419HCSRS00");
		this.cliente.setTelefono("9515007893");
	}

	@After
	public void tearDown() {
		clienteDao.delete(this.cliente.getId());
	}
	
	@Test
	public void create() {
		try {
			clienteDao.create(this.cliente);
			Cliente c = clienteDao.last();
			
			assertEquals(c.getNombre(), this.cliente.getNombre());
			
			this.cliente.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createTest: " + e);
		}
	}
}
