package elabuelonicolas.dao.venta;

import java.sql.Date;
import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.bd.mappers.VentaMapper;

@Named
public class VentaDaoImpl implements VentaDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Venta> findAll() {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Venta venta) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.create(venta);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Venta read(int id) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByIdCliente(int idCliente) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByIdCliente(idCliente);
		} catch (Exception e) {
			System.out.println("Error readByIdCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByFecha(Date fecha) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByFecha(fecha);
		} catch (Exception e) {
			System.out.println("Error readByFecha: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByFechas(Date fechaInicio, Date fechaFin) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByFechas(fechaInicio, fechaFin);
		} catch (Exception e) {
			System.out.println("Error readByFechas: " + e);
		}
		return null;
	}

	@Override
	public void update(Venta venta) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.update(venta);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateIdCliente(int id, int idCliente) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateIdCliente(id, idCliente);
		} catch (Exception e) {
			System.out.println("Error updateIdCliente: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateFecha(id, fecha);
		} catch (Exception e) {
			System.out.println("Error updateFecha: " + e);
		}
	}

	@Override
	public void updateTotal(int id, Double total) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateTotal(id, total);
		} catch (Exception e) {
			System.out.println("Error updateTotal: " + e);
		}
	}
	
	@Override
	public void delete(int id) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

	@Override
	public Venta last() {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.last();
		}catch(Exception e) {
			System.out.println("Error last: " + e);
		}
		return null;
	}
}
