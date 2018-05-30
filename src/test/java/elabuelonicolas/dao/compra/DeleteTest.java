package elabuelonicolas.dao.compra;

import static org.junit.Assert.assertNull;

import java.sql.Date;

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
public class DeleteTest {

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
	public void delete() {
		try {
			compraDao.delete(this.compra.getId());

			int id = this.compra.getId();
			Compra c = compraDao.read(id);

			assertNull(c);
		} catch (Exception e) {
			System.out.println("Error deleteTest: " + e);
		}
	}
}
