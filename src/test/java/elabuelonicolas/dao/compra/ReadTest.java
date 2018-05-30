package elabuelonicolas.dao.compra;

import static org.junit.Assert.assertEquals;
import java.sql.Date;
import java.util.List;
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
public class ReadTest {
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

	@Test
	public void read() {
		try {
			Compra compra = compraDao.read(this.compra.getId());
			assertEquals(compra.getId(), this.compra.getId());
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByIdProveedor() {
		try {
			List<Compra> compras = compraDao.readByIdProveedor(this.compra.getIdproveedor());
			assertEquals(compras.get(0).getIdproveedor(), this.compra.getIdproveedor());
		} catch (Exception e) {
			System.out.println("Error readByNombreTest: " + e);
		}
	}

	@Test
	public void readByIdListacompra() {
		try {
			List<Compra> compra = compraDao.readByIdListaCompra(this.compra.getIdlistacompra());
			assertEquals(compra.get(0).getIdlistacompra(), this.compra.getIdlistacompra());
		} catch (Exception e) {
			System.out.println("Error readByDireccionTest: " + e);
		}
	}

	@Test
	public void readByFecha() {
		try {
			List<Compra> compras = compraDao.readByFecha((Date) this.compra.getFecha());
			assertEquals(compras.get(0).getFecha(), this.compra.getFecha());
		} catch (Exception e) {
			System.out.println("Error readByContactoTest: " + e);
		}
	}

	@Test
	public void readByTotal() {
		try {
			List<Compra> compras = compraDao.readByTotal(this.compra.getTotal());
			assertEquals(compras.get(0).getTotal(), this.compra.getTotal());
		} catch (Exception e) {
			System.out.println("Error readByTelefonoTest: " + e);
		}
	}
}
