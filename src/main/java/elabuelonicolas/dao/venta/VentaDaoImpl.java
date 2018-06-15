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
			System.out.println("Error findAllVenta: " + e);
		}
		return null;
	}

	@Override
	public void create(Venta venta) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.create(venta);
		} catch (Exception e) {
			System.out.println("Error createVenta: " + e);
		}
	}

	@Override
	public Venta read(int id) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByIdCliente(int idCliente) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByIdCliente(idCliente);
		} catch (Exception e) {
			System.out.println("Error readByIdClienteVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByFecha(Date fecha) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByFecha(fecha);
		} catch (Exception e) {
			System.out.println("Error readByFechaVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByFechas(Date fechaInicio, Date fechaFin) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByFechas(fechaInicio, fechaFin);
		} catch (Exception e) {
			System.out.println("Error readByFechasVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByTotal(Double total) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByTotal(total);
		} catch (Exception e) {
			System.out.println("Error readByTotalVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByTotalReal(Double totalreal) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByTotalReal(totalreal);
		} catch (Exception e) {
			System.out.println("Error readByTotalRealVenta: " + e);
		}
		return null;
	}

	@Override
	public List<Venta> readByGanancia(Double ganancia) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.readByGanancia(ganancia);
		} catch (Exception e) {
			System.out.println("Error readByGananciaVenta: " + e);
		}
		return null;
	}

	@Override
	public void update(Venta venta) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.update(venta);
		} catch (Exception e) {
			System.out.println("Error updateVenta: " + e);
		}
	}

	@Override
	public void updateIdCliente(int id, int idCliente) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateIdCliente(id, idCliente);
		} catch (Exception e) {
			System.out.println("Error updateIdClienteVenta: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateFecha(id, fecha);
		} catch (Exception e) {
			System.out.println("Error updateFechaVenta: " + e);
		}
	}

	@Override
	public void updateTotal(int id, Double total) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateTotal(id, total);
		} catch (Exception e) {
			System.out.println("Error updateTotalVenta: " + e);
		}
	}

	@Override
	public void updateTotalReal(int id, Double totalreal) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateTotalReal(id, totalreal);
		} catch (Exception e) {
			System.out.println("Error updateTotalRealVenta: " + e);
		}
	}

	@Override
	public void updateGanancia(int id, Double ganancia) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.updateGanancia(id, ganancia);
		} catch (Exception e) {
			System.out.println("Error updateGananciaVenta: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			ventaMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteVenta: " + e);
		}
	}

	@Override
	public Venta last() {
		try {
			VentaMapper ventaMapper = sqlSession.getMapper(VentaMapper.class);
			return ventaMapper.last();
		} catch (Exception e) {
			System.out.println("Error lastVenta: " + e);
		}
		return null;
	}
}
