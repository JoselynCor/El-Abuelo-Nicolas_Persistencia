package elabuelonicolas.dao.listaventa;

import static org.junit.Assert.assertNotEquals;
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

		assertNotEquals(this.listaventa.getIdventa(), c.getIdventa());
		assertNotEquals(this.listaventa.getIdproducto(), c.getIdproducto());
		assertNotEquals(this.listaventa.getCantidad(), c.getCantidad());
		assertNotEquals(this.listaventa.getSubtotal(), c.getSubtotal());
	}

	@Test
	public void updateIdVenta() {
		try {
			listaventaDao.updateIdVenta(this.listaventa.getId(), 2);
			Listaventa c = listaventaDao.read(this.listaventa.getId());
			assertNotEquals(c.getIdventa(), this.listaventa.getIdventa(), 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			listaventaDao.updateSubtotal(this.listaventa.getId(), 100.0);
			Listaventa c = listaventaDao.read(this.listaventa.getId());
			assertNotEquals(c.getSubtotal(), this.listaventa.getSubtotal(), 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaSubtotalTest: " + e);
		}
	}
}
