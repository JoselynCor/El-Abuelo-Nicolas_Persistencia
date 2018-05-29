package elabuelonicolas.dao;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compras;
import elabuelonicolas.dao.compra.CompraDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ComprasDaoImplTest {

	@Inject
	CompraDao compraDao;

	@SuppressWarnings("deprecation")
	@Test
	public void createCompra() {
		try {
			Compras c = new Compras();
			c.setIdproveedor(1);
			c.setIdlistacompra(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setPreciototal(100.10);
			compraDao.create(c);
		} catch (Exception e) {
			System.out.println("Error create test: " + e);
		}
	}

	@Test
	public void readCompra() {
		try {
			Compras c = compraDao.read(1);
			System.out.println("Id: " + c.getId());
			System.out.println("Nombre: " + c.getIdproveedor());
		} catch (Exception e) {
			System.out.println("Error read test: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateCompra() {
		Compras c = compraDao.read(1);
		try {
			c.setIdproveedor(1);
			c.setIdlistacompra(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setPreciototal(100.10);
			compraDao.update(c);
		} catch (Exception e) {
			System.out.println("Error update test: " + e);
		}
	}

	@Test
	public void deleteCompra() {
		try {
			if (compraDao.read(2) != null)
				compraDao.delete(2);
		} catch (Exception e) {
			System.out.println("Error delete test: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Compras> list = compraDao.findAll();
			for (Compras c : list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getIdproveedor());
			}
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}
}
