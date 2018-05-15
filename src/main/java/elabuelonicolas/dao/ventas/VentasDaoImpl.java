package elabuelonicolas.dao.ventas;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Ventas;
import elabuelonicolas.bd.mappers.VentasMapper;

@Named
public class VentasDaoImpl implements VentasDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Ventas> findAll() {
		List<Ventas> list = null;
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			list = ventasMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Ventas venta) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.create(venta);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Ventas read(int id) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			Ventas venta = ventasMapper.readById(id);
			return venta;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public void update(Ventas venta) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.update(venta);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
