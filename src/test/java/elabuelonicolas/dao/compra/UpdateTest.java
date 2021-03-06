package elabuelonicolas.dao.compra;

import static org.junit.Assert.assertNotEquals;

import java.sql.Date;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	CompraDao compraDao;

	private Compra compra;
	
	@Before
	public void setUp() {
		this.compra = new Compra();
		this.compra.setIdproveedor(1);
		this.compra.setTotal(100.1);
		compraDao.create(this.compra);
		this.compra.setId(compraDao.last().getId());
	}

	@After
	public void tearDown() {
		compraDao.delete(this.compra.getId());
	}

	@Test
	public void update() {
		Compra c = compraDao.read(this.compra.getId());
		try {
			c.setIdproveedor(2);
			c.setFecha(Date.valueOf("2018-12-1"));
			c.setTotal(105.5);
			compraDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateCompraTest: " + e);
		}

		assertNotEquals(this.compra.getIdproveedor(), c.getIdproveedor());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
	}

	@Test
	public void updateIdProveedor() {
		try {
			compraDao.updateIdProveedor(this.compra.getId(), 2);
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getIdproveedor(), this.compra.getIdproveedor());
		} catch (Exception e) {
			System.out.println("Error updateCompraProveedorTest: " + e);
		}
	}

	@Test
	public void updateTotal() {
		try {
			compraDao.updateTotal(this.compra.getId(), 100.112);
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getTotal(), this.compra.getTotal());
		} catch (Exception e) {
			System.out.println("Error updateCompraTotalTest: " + e);
		}
	}
}
