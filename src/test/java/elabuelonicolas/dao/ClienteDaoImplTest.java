package elabuelonicolas.dao;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.dao.cliente.ClienteDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/applicationContext.xml"})
public class ClienteDaoImplTest {
	
	@Inject
	ClienteDao clienteDao;
	
	@Test
	public void pruebaConsultarTodo() {
		try {
			List<Cliente> lista = clienteDao.findAllClientes();
			assertEquals(lista.size(), 1);
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
