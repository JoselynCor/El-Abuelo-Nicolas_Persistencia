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
	
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		this.compra = new Compra();
		this.compra.setIdproveedor(1);
		this.compra.setIdlistacompra(1);
		this.compra.setFecha(new Date(2018, 1, 1));
		this.compra.setTotal(100.1);
	}

	@After
	public void tearDown() {
		this.compra = null;
	}

	@SuppressWarnings("deprecation")
	@Test
	public void update() {
		Compra c = compraDao.read(this.compra.getId());
		try {
			System.out.println("Update");
			c.setIdproveedor(1);
			c.setIdlistacompra(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setTotal(100.10);
			compraDao.update(c);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
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
			System.out.println("Error updateNombreTest: " + e);
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
			System.out.println("Error updateContactoTest: " + e);
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
			System.out.println("Error updateTelefonoTest: " + e);
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
			System.out.println("Error updateEmailTest: " + e);
		}
	}
}
