package elabuelonicolas.dao;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.dao.cliente.ClienteDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ClienteDaoImplTest {

	@Inject
	ClienteDao clienteDao;

	@Test
	public void createClient() {
		try {
			Cliente c = new Cliente();
			c.setNombre("José Luis");
			c.setContacto("Josué");
			c.setDireccion("Acatlima");
			c.setEmail("jlcastrogro@gmail.com");
			c.setRfc("CACG950419HOCSRS00");
			c.setTelefono("9515007892");
			clienteDao.create(c);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void readCliente() {
		try {
			Cliente c = clienteDao.read(1);
			System.out.println("Id: " + c.getId());
			System.out.println("Nombre: " + c.getNombre());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void updateCliente() {
		Cliente c = clienteDao.read(1);
		try {
			c.setNombre("Luis");
			c.setContacto("Castro");
			c.setDireccion("Acatlima");
			c.setEmail("jlcastrogro@gmail.com");
			c.setRfc("CACG950419HOCSRS00");
			c.setTelefono("9515007892");
			clienteDao.update(c);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void deleteCliente() {
		try {
			if (clienteDao.read(2) != null)
				clienteDao.delete(2);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Cliente> list = clienteDao.findAll();
			for (Cliente c : list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
