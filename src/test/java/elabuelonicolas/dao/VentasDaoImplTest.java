package elabuelonicolas.dao;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Ventas;
import elabuelonicolas.dao.ventas.VentasDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class VentasDaoImplTest {
	
	@Inject
	VentasDao ventasDao;

	@SuppressWarnings("deprecation")
	@Test
	public void createVenta() {
		try {
			Ventas v = new Ventas();
			v.setIdcliente(1);
			v.setIdlistaventa(1);
			v.setFecha(new Date(2018, 1, 1));
			v.setPreciototal(100.10);
			ventasDao.create(v);
		} catch (Exception e) {
			System.out.println("Error create test: " + e);
		}
	}

	@Test
	public void readVenta() {
		try {
			Ventas v = ventasDao.read(1);
			System.out.println("Id: " + v.getId());
			System.out.println("Nombre: " + v.getIdcliente());
		} catch (Exception e) {
			System.out.println("Error read test: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateVenta() {
		Ventas v = ventasDao.read(1);
		try {
			v.setIdcliente(1);
			v.setIdlistaventa(1);
			v.setFecha(new Date(2018, 1, 1));
			v.setPreciototal(100.10);
			ventasDao.update(v);
		} catch (Exception e) {
			System.out.println("Error update test: " + e);
		}
	}

	@Test
	public void deleteVenta() {
		try {
			if (ventasDao.read(2) != null)
				ventasDao.delete(2);
		} catch (Exception e) {
			System.out.println("Error delete test: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Ventas> list = ventasDao.findAll();
			for (Ventas v : list) {
				System.out.println("Id: " + v.getId());
				System.out.println("Nombre: " + v.getIdcliente());
			}
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}
}
