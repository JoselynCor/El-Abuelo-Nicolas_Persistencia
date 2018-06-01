package elabuelonicolas.dao.listacompra;

import static org.junit.Assert.assertNotEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listacompra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	ListacompraDao listacompraDao;

	private Listacompra listaCompra;
	
	@Before
	public void setUp() {
		this.listaCompra = new Listacompra();
		this.listaCompra.setIdcompra(4);
		this.listaCompra.setIdproducto(1);
		this.listaCompra.setCantidad(10);
		this.listaCompra.setSubtotal(100.12);
		
		listacompraDao.create(this.listaCompra);

		this.listaCompra.setId(listacompraDao.last().getId());
	}

	@After
	public void tearDown() {
		listacompraDao.delete(this.listaCompra.getId());
	}

	@Test
	public void update() {
		Listacompra c = listacompraDao.read(this.listaCompra.getId());
		try {
			System.out.println("Update");
			c.setIdcompra(2);
			c.setIdproducto(5);
			c.setCantidad(100);
			c.setSubtotal(105.5);
			listacompraDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateListaCompraTest: " + e);
		}

		assertNotEquals(this.listaCompra.getIdcompra(), c.getIdcompra());
		assertNotEquals(this.listaCompra.getIdproducto(), c.getIdproducto());
		assertNotEquals(this.listaCompra.getCantidad(), c.getCantidad());
		assertNotEquals(this.listaCompra.getSubtotal(), c.getSubtotal());
	}

	@Test
	public void updateIdCompra() {
		try {
			System.out.println("UpdateProveedor");
			listacompraDao.updateIdCompra(this.listaCompra.getIdcompra(), 2);
			Listacompra c = listacompraDao.read(this.listaCompra.getId());
			assertNotEquals(c.getIdcompra(), this.listaCompra.getIdcompra());
		} catch (Exception e) {
			System.out.println("Error updateListaCompraProveedorTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			System.out.println("UpdateEmail");
			listacompraDao.updateSubtotal(this.listaCompra.getId(), 100.112);
			Listacompra c = listacompraDao.read(this.listaCompra.getId());
			assertNotEquals(c.getSubtotal(), this.listaCompra.getSubtotal());
		} catch (Exception e) {
			System.out.println("Error updateTotalTest: " + e);
		}
	}
}