package elabuelonicolas.dao.ventas;

import static org.junit.Assert.assertNotEquals;
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
public class UpdateTest {
	@Inject
	VentasDao ventasDao;
	private Ventas venta;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		this.venta = new Ventas();
		this.venta.setIdcliente(1);;
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

	@SuppressWarnings("deprecation")
	@Test
	public void update() {
		Ventas v = ventasDao.read(this.venta.getId());
		try {
			System.out.println("Update");
			v.setIdcliente(2);
			v.setIdlistaventa(2);
			v.setFecha(new Date(2019, 1, 1));
			v.setPreciototal(1920812.1);
			ventasDao.update(v);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.venta.getIdcliente(), v.getIdcliente());
		assertNotEquals(this.venta.getIdlistaventa(), v.getIdlistaventa());
		assertNotEquals(this.venta.getFecha(), v.getFecha());
		assertNotEquals(this.venta.getPreciototal(), v.getPreciototal());
	}

	@Test
	public void updateIdCliente() {
		try {
			System.out.println("UpdateIdCliente");
			ventasDao.updateIdCliente(this.venta.getId(), 10);
			Ventas v = ventasDao.read(this.venta.getId());
			assertNotEquals(v.getIdcliente(), this.venta.getIdcliente());
		} catch (Exception e) {
			System.out.println("Error updateIdClienteTest: " + e);
		}
	}

	@Test
	public void updateIdListaVentas() {
		try {
			System.out.println("UpdateIdListaVentas");
			ventasDao.updateIdListaVenta(this.venta.getId(), 11);
			Ventas v = ventasDao.read(this.venta.getId());
			assertNotEquals(v.getIdlistaventa(), this.venta.getIdlistaventa());
		} catch (Exception e) {
			System.out.println("Error updateIdListaVentasTest: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateFecha() {
		try {
			System.out.println("UpdateFecha");
			ventasDao.updateFecha(this.venta.getId(), new Date(2018,12,1));
			Ventas c = ventasDao.read(this.venta.getId());
			assertNotEquals(c.getFecha(), this.venta.getFecha());
		} catch (Exception e) {
			System.out.println("Error updateFechaTest: " + e);
		}
	}

	@Test
	public void updatePrecioTotal() {
		try {
			System.out.println("UpdatePrecioTotal");
			ventasDao.updatePrecioTotal(this.venta.getId(), 1000.1);
			Ventas v = ventasDao.read(this.venta.getId());
			assertNotEquals(v.getPreciototal(), this.venta.getPreciototal());
		} catch (Exception e) {
			System.out.println("Error updatePrecioTotalTest: " + e);
		}
	}
}
