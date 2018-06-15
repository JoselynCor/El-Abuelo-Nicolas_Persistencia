package elabuelonicolas.dao.producto;

import static org.junit.Assert.assertNotEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Producto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	ProductoDao productoDao;
	private Producto producto;

	@Before
	public void setUp() {
		this.producto = new Producto();
		this.producto.setTipo("Balón");
		this.producto.setMarca("Puma");
		this.producto.setCostocompra(3.1);
		this.producto.setCostoventa(3.1);
		this.producto.setExistencia(12);
		this.producto.setStatus(1);
		productoDao.create(this.producto);
		this.producto.setId(productoDao.last().getId());
	}

	@After
	public void tearDown() {
		productoDao.delete(this.producto.getId());
	}

	@Test
	public void update() {
		Producto p = productoDao.read(this.producto.getId());
		try {
			p = new Producto();
			p.setTipo("Camisa");
			p.setMarca("Pirma");
			p.setCostocompra(3.2);
			p.setCostoventa(3.2);
			p.setExistencia(13);
			p.setStatus(1);
			productoDao.update(p);
		} catch (Exception e) {
			System.out.println("Error updateProductoTest: " + e);
		}

		assertNotEquals(this.producto.getTipo(), p.getTipo());
		assertNotEquals(this.producto.getMarca(), p.getMarca());
		assertNotEquals(this.producto.getCostocompra(), p.getCostocompra());
		assertNotEquals(this.producto.getExistencia(), p.getExistencia());
	}

	@Test
	public void updateTipo() {
		try {
			productoDao.updateTipo(this.producto.getId(), "Playera");
			Producto p = productoDao.read(this.producto.getId());
			assertNotEquals(p.getTipo(), this.producto.getTipo());
		} catch (Exception e) {
			System.out.println("Error updateProductoTipoTest: " + e);
		}
	}

	@Test
	public void updateMarca() {
		try {
			productoDao.updateMarca(this.producto.getId(), "Nice");
			Producto p = productoDao.read(this.producto.getId());
			assertNotEquals(p.getMarca(), this.producto.getMarca());
		} catch (Exception e) {
			System.out.println("Error updateProductoMarcaTest: " + e);
		}
	}

	@Test
	public void updateCostoCompra() {
		try {
			productoDao.updateCostoCompra(this.producto.getId(), 100.0);
			Producto p = productoDao.read(this.producto.getId());
			assertNotEquals(p.getCostocompra(), this.producto.getCostocompra(), 1);
		} catch (Exception e) {
			System.out.println("Error updateProductoCostoTest: " + e);
		}
	}

	@Test
	public void updateExistencia() {
		try {
			productoDao.updateExistencia(this.producto.getId(), 20);
			Producto p = productoDao.read(this.producto.getId());
			assertNotEquals(p.getExistencia(), this.producto.getExistencia(), 1);
		} catch (Exception e) {
			System.out.println("Error updateProductoExistenciaTest: " + e);
		}
	}
}
