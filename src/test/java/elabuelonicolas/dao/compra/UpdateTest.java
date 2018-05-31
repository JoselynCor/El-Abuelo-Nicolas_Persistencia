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
		this.compra.setIdlistacompra(5);
		this.compra.setFecha(Date.valueOf("2018-05-02"));
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
			System.out.println("Update");
			c.setIdproveedor(2);
			c.setIdlistacompra(6);
			c.setFecha(Date.valueOf("2018-12-1"));
			c.setTotal(105.5);
			compraDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateCompraTest: " + e);
		}

		assertNotEquals(this.compra.getIdproveedor(), c.getIdproveedor());
		assertNotEquals(this.compra.getIdlistacompra(), c.getIdlistacompra());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
	}

	@Test
	public void updateIdProveedor() {
		try {
			System.out.println("UpdateProveedor");
			compraDao.updateIdProveedor(this.compra.getId(), 2);
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getIdproveedor(), this.compra.getIdproveedor());
		} catch (Exception e) {
			System.out.println("Error updateCompraProveedorTest: " + e);
		}
	}

	@Test
	public void updateIdListaCompra() {
		try {
			System.out.println("UpdateContact");
			compraDao.updateIdListaCompra(this.compra.getId(), 2);
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getIdlistacompra(), this.compra.getIdlistacompra());
		} catch (Exception e) {
			System.out.println("Error updateCompraListaCompraTest: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateFecha() {
		try {
			System.out.println("UpdateNumber");
			compraDao.updateFecha(this.compra.getId(), new Date(2018, 2, 1));
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getFecha(), this.compra.getFecha());
		} catch (Exception e) {
			System.out.println("Error updateFechaTest: " + e);
		}
	}

	@Test
	public void updateTotal() {
		try {
			System.out.println("UpdateEmail");
			compraDao.updateTotal(this.compra.getId(), 100.112);
			Compra c = compraDao.read(this.compra.getId());
			assertNotEquals(c.getTotal(), this.compra.getTotal());
		} catch (Exception e) {
			System.out.println("Error updateTotalTest: " + e);
		}
	}
}
