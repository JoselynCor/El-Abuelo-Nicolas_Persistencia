package elabuelonicolas.dao.venta;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.dao.venta.VentaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {
	@Inject
	VentaDao ventaDao;

	private Venta venta;

	@Before
	public void setUp() {
		this.venta = new Venta();
		this.venta.setIdcliente(1);
		this.venta.setTotal(100.10);
		this.venta.setTotalreal(100.10);
		this.venta.setGanancia(100.10);
		ventaDao.create(this.venta);
		this.venta.setId(ventaDao.last().getId());
	}

	@After
	public void tearDown() {
		this.venta = null;
	}

	@Test
	public void delete() {
		try {
			ventaDao.delete(this.venta.getId());

			int id = this.venta.getId();
			Venta v = ventaDao.read(id);

			assertNull(v);
		} catch (Exception e) {
			System.out.println("Error deleteVentaTest: " + e);
		}
	}
}
