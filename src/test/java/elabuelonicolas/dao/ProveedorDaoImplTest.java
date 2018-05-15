package elabuelonicolas.dao;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.dao.proveedor.ProveedorDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ProveedorDaoImplTest {

	@Inject
	ProveedorDao proveedorDao;

	@Test
	public void createProveedor() {
		try {
			Proveedor p = new Proveedor();
			p.setNombre("José Jaime");
			p.setContacto("Soriana");
			p.setDireccion("Huajuapan");
			p.setEmail("sorianahj@gmail.com");
			p.setRfc("SORI950419HOCSRS00");
			p.setTelefono("1233455678");
			proveedorDao.create(p);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void readCliente() {
		try {
			Proveedor p = proveedorDao.read(1);
			System.out.println("Id: " + p.getId());
			System.out.println("Nombre: " + p.getNombre());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void updateCliente() {
		Proveedor p = proveedorDao.read(1);
		try {
			p.setNombre("Nicolas");
			p.setContacto("Bodega");
			p.setDireccion("Oaxaca");
			p.setEmail("bodegaoax@gmail.com");
			p.setRfc("OAXB950419HOCSRS00");
			p.setTelefono("9877655432");
			proveedorDao.update(p);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void deleteProveedor() {
		try {
			if (proveedorDao.read(2) != null)
				proveedorDao.delete(2);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void findAllClientes() {
		try {
			List<Proveedor> list = proveedorDao.findAll();
			for (Proveedor p : list) {
				System.out.println("Id: " + p.getId());
				System.out.println("Nombre: " + p.getNombre());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
