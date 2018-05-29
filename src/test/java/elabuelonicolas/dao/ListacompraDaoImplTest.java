package elabuelonicolas.dao;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listacompra;
import elabuelonicolas.dao.listacompra.ListacompraDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ListacompraDaoImplTest {

	@Inject
	ListacompraDao listacompraDao;

	@Test
	public void createListacompra() {
		try {
			// System.out.print("\nCreate");
			Listacompra v = new Listacompra();
			v.setIdproducto(172);
			v.setCantidad(20370);
			v.setSubtotal(207532.40);
			v.setIdcompra(1);

			listacompraDao.create(v);
		} catch (Exception e) {
			System.out.println("Error create test: " + e);
		}
	}

	@Test
	public void readListacompra() {
		try {
			Listacompra lc = listacompraDao.read(1);
			System.out.println("\nRead");
			System.out.println("Id: " + lc.getId());
			System.out.println("Id Prodcuto: " + lc.getIdproducto());
			System.out.println("Cantidad: " + lc.getCantidad());
			System.out.println("Subtotal: " + lc.getSubtotal());
			System.out.println("Id Compra: " + lc.getIdcompra());
		} catch (Exception e) {
			System.out.println("Error read test: " + e);
		}
	}

	@Test
	public void updateListacompra() {
		Listacompra lc = listacompraDao.read(1);
		try {
			// System.out.print("\nUpdate");
			lc.setIdproducto(0);
			lc.setCantidad(0);
			lc.setSubtotal(0.10);
			lc.setIdcompra(4);
			listacompraDao.update(lc);
		} catch (Exception e) {
			System.out.println("Error update test: " + e);
		}
	}

	@Test
	public void deleteListacompra() {
		try {
			if (listacompraDao.read(1) != null)
				;
			listacompraDao.delete(1);
		} catch (Exception e) {
			System.out.println("Error delete test: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Listacompra> list = listacompraDao.findAll();
			for (Listacompra lc : list) {
				System.out.println("\nFind All");
				System.out.println("Id: " + lc.getId());
				System.out.println("Id Producto: " + lc.getIdproducto());
				System.out.println("Cantidad: " + lc.getCantidad());
				System.out.println("Subtotal: " + lc.getSubtotal());
				System.out.println("Id Compra: " + lc.getIdcompra());
			}
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}
}
