package elabuelonicolas.dao;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventas;
import elabuelonicolas.dao.listaventa.ListaventaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ListaventasDaoImplTest {

	@Inject
	ListaventaDao listaventaDao;

	@Test
	public void createListaventa() {
		try {
			// System.out.print("\nCreate");
			Listaventas v = new Listaventas();
			v.setIdproducto(172);
			v.setCantidad(20370);
			v.setSubtotal(207532.40);
			v.setIdventa(1);

			listaventaDao.create(v);
		} catch (Exception e) {
			System.out.println("Error create test: " + e);
		}
	}

	@Test
	public void readListaventa() {
		try {
			Listaventas v = listaventaDao.read(2);
			System.out.println("\nRead");
			System.out.println("Id: " + v.getId());
			System.out.println("Id Prodcuto: " + v.getIdproducto());
			System.out.println("Cantidad: " + v.getCantidad());
			System.out.println("Subtotal: " + v.getSubtotal());
			System.out.println("Id Venta: " + v.getIdventa());
		} catch (Exception e) {
			System.out.println("Error read test: " + e);
		}
	}

	@Test
	public void updateListaventa() {
		Listaventas v = listaventaDao.read(1);
		try {
			// System.out.print("\nUpdate");
			v.setIdproducto(1);
			v.setCantidad(1);
			v.setSubtotal(1.10);
			v.setIdventa(1);
			listaventaDao.update(v);
		} catch (Exception e) {
			System.out.println("Error update test: " + e);
		}
	}

	@Test
	public void deleteListaventa() {
		try {
			if (listaventaDao.read(9) != null)
				;
			listaventaDao.delete(9);
		} catch (Exception e) {
			System.out.println("Error delete test: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Listaventas> list = listaventaDao.findAll();
			for (Listaventas v : list) {
				System.out.println("\nFind All");
				System.out.println("Id: " + v.getId());
				System.out.println("Id Producto: " + v.getIdproducto());
				System.out.println("Cantidad: " + v.getCantidad());
				System.out.println("Subtotal: " + v.getSubtotal());
				System.out.println("Id Venta: " + v.getIdventa());
			}
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}
}
