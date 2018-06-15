package elabuelonicolas.dao.producto;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.dao.producto.ProductoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {
	@Inject
	ProductoDao productoDao;

	private Producto producto;

	@Before
	public void setUp() {
		this.producto = new Producto();
		this.producto.setTipo("Balón");
		this.producto.setMarca("Puma");
		this.producto.setCostocompra(3.1);
		this.producto.setCostoventa(3.1);
		this.producto.setExistencia(12);
		this.producto.setStatus(1);
		productoDao.create(this.producto);
		this.producto.setId(productoDao.last().getId());
	}

	@After
	public void tearDown() {
		this.producto = null;
	}

	@Test
	public void delete() {
		try {
			int id = this.producto.getId();
			
			productoDao.delete(id);
			Producto p = productoDao.read(id);

			assertNull(p);
		} catch (Exception e) {
			System.out.println("Error deleteProductoTest: " + e);
		}
	}
}
