package elabuelonicolas.dao.ventas;

import java.sql.Date;
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
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.findAll();
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
			return ventasMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Ventas> readByIdCliente(int id) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.readByIdCliente(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Ventas> readByIdListaVenta(int id) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.readByIdListaVenta(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Ventas> readByFecha(Date fecha) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.readByFecha(fecha);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Ventas> readByFechas(Date fechaInicio, Date fechaFin) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.readByFechas(fechaInicio, fechaFin);
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
	public void updateIdCliente(int id, int idNuevo) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.updateIdCliente(id, idNuevo);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateIdListaVenta(int id, int idNuevo) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.updateIdListaVenta(id, idNuevo);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fechaNueva) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.updateFecha(id, fechaNueva);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updatePrecioTotal(int id, Double precioTotalNuevo) {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			ventasMapper.updatePrecioTotal(id, precioTotalNuevo);
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

	@Override
	public Ventas last() {
		try {
			VentasMapper ventasMapper = sqlSession.getMapper(VentasMapper.class);
			return ventasMapper.last();
		}catch(Exception e) {
			System.out.println("Error delete: " + e);
		}
		return null;
	}
}
