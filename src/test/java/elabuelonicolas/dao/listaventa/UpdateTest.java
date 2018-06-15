package elabuelonicolas.dao.listaventa;

import static org.junit.Assert.assertEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventa;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	ListaventaDao listaventaDao;

	private Listaventa listaventa;

	@Before
	public void setUp() {
		this.listaventa = new Listaventa();
		this.listaventa.setIdventa(4);
		this.listaventa.setIdproducto(1);
		this.listaventa.setCantidad(10);
		this.listaventa.setSubtotal(99.0);
		this.listaventa.setSubtotalreal(100.12);
		this.listaventa.setGanancia(12.1);

		listaventaDao.create(this.listaventa);

		this.listaventa.setId(listaventaDao.last().getId());
	}

	@After
	public void tearDown() {
		listaventaDao.delete(this.listaventa.getId());
	}

	@Test
	public void update() {
		Listaventa c = listaventaDao.read(this.listaventa.getId());
		try {
			c.setIdventa(2);
			c.setIdproducto(3);
			c.setCantidad(100);
			c.setSubtotal(105.5);
			c.setSubtotalreal(100.12);
			c.setGanancia(12.1);
			listaventaDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateListaventaTest: " + e);
		}

		assertEquals(2, c.getIdventa(), 1);
		assertEquals(3, c.getIdproducto(), 1);
		assertEquals(100, c.getCantidad(), 1);
		assertEquals(105.5, c.getSubtotal(), 1);
	}

	@Test
	public void updateIdVenta() {
		try {
			listaventaDao.updateIdVenta(this.listaventa.getId(), 2);
			Listaventa c = listaventaDao.read(this.listaventa.getId());
			assertEquals(c.getIdventa(), 2, 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			listaventaDao.updateSubtotal(this.listaventa.getId(), 100.0);
			Listaventa c = listaventaDao.read(this.listaventa.getId());
			assertEquals(c.getSubtotal(), 100.0, 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaSubtotalTest: " + e);
		}
	}
}
