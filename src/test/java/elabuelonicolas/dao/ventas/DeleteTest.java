package elabuelonicolas.dao.ventas;

import static org.junit.Assert.assertNull;
import java.sql.Date;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Ventas;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {

	@Inject
	VentasDao ventasDao;

	private Ventas venta;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		this.venta = new Ventas();
		this.venta.setIdcliente(1);
		this.venta.setIdlistaventa(1);
		this.venta.setFecha(new Date(2018, 1, 1));
		this.venta.setPreciototal(100.10);
		ventasDao.create(this.venta);
		this.venta.setId(ventasDao.last().getId());
	}

	@After
	public void tearDown() {
		this.venta = null;
	}

	@Test
	public void delete() {
		try {
			ventasDao.delete(this.venta.getId());

			int id = this.venta.getId();
			Ventas v = ventasDao.read(id);

			assertNull(v);
		} catch (Exception e) {
			System.out.println("Error deleteTest: " + e);
		}
	}
}
