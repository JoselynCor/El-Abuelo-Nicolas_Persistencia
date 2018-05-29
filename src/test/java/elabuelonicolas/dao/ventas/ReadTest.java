package elabuelonicolas.dao.ventas;

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
import elabuelonicolas.bd.domain.Ventas;
import elabuelonicolas.dao.venta.VentaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	VentaDao ventaDao;

	private Ventas venta;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		this.venta = new Ventas();
		this.venta.setIdcliente(1);
		this.venta.setIdlistaventa(1);
		this.venta.setFecha(new Date(2018, 1, 1));
		this.venta.setPreciototal(100.10);

		ventaDao.create(this.venta);

		this.venta.setId(ventaDao.last().getId());
	}

	@After
	public void tearDown() {
		this.venta = null;
	}

	@Test
	public void read() {
		try {
			Ventas c = ventaDao.read(this.venta.getId());
			assertEquals(c.getId(), this.venta.getId());
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByIdCliente() {
		try {
			List<Ventas> ventas = ventaDao.readByIdCliente(this.venta.getIdcliente());
			assertEquals(ventas.get(0).getIdcliente(), this.venta.getIdcliente());
		} catch (Exception e) {
			System.out.println("Error readByIdClienteTest: " + e);
		}
	}

	@Test
	public void readByIdListaVenta() {
		try {
			List<Ventas> ventas = ventaDao.readByIdListaVenta(this.venta.getIdlistaventa());
			assertEquals(ventas.get(0).getIdlistaventa(), this.venta.getIdlistaventa());
		} catch (Exception e) {
			System.out.println("Error readByIdListaVentaTest: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void readByFecha() {
		try {
			List<Ventas> ventas = ventaDao.readByFecha(new Date(2018, 1, 1));
			assertEquals(ventas.get(0).getFecha(), this.venta.getFecha());
		} catch (Exception e) {
			System.out.println("Error readByFechaTest: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void readByFechas() {
		try {
			List<Ventas> ventas = ventaDao.readByFechas(new Date(2018, 1, 1), new Date(2018, 1, 2));
			for(Ventas v : ventas) {
				System.out.println("Id: " + v.getId());
				System.out.println("IdCliente: " + v.getIdcliente());
				System.out.println("IdListaVenta: " + v.getIdlistaventa());
			}
		} catch (Exception e) {
			System.out.println("Error readByFechasTest: " + e);
		}
	}
}
