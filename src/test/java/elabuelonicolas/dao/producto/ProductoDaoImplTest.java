package elabuelonicolas.dao.producto;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.dao.producto.ProductoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })

public class ProductoDaoImplTest {
	@Inject
	ProductoDao productoDao;

	@Test
	public void createProducto() {
		try {
			Producto c = new Producto();
			c.setTipo("Balón");
			c.setMarca("Puma");
			c.setCosto("$120");
			c.setExistencia(3);
			productoDao.create(c);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void readProducto() {
		try {
			Producto c = productoDao.read(1);
			System.out.println("Id: " + c.getId());
			System.out.println("Tipo: " + c.getTipo());
			System.out.println("Existencia: " + c.getExistencia());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void updateProducto() {
		Producto c = productoDao.read(1);
		try {
			c.setTipo("Balón");
			c.setMarca("Nike");
			c.setCosto("$180");
			c.setExistencia(1);
			productoDao.update(c);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void deleteProducto() {
		try {
			if (productoDao.read(2) != null)
				productoDao.delete(2);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void findAllProductos() {
		try {
			List<Producto> list = productoDao.findAll();
			for (Producto c : list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Tipo: " + c.getTipo());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
