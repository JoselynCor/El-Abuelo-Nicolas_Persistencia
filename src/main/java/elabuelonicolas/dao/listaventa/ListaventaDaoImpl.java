package elabuelonicolas.dao.listaventa;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.bd.mappers.ListaventaMapper;

@Named
public class ListaventaDaoImpl implements ListaventaDao {
	
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Listaventa> findAll() {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error findAllListaventa: " + e);
		}
		return null;
	}

	@Override
	public void create(Listaventa listaventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.create(listaventa);
		} catch (Exception e) {
			System.out.println("Error createListaventa: " + e);
		}
	}

	@Override
	public Listaventa read(int id) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readListaventa: " + e);
		}
		return null;
	}

	@Override
	public List<Listaventa> readByIdVenta(int idventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.readByIdVenta(idventa);
		} catch (Exception e) {
			System.out.println("Error readByIdVentaListaventa: " + e);
		}
		return null;
	}

	@Override
	public List<Listaventa> readByIdProducto(int idproducto) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.readByIdProducto(idproducto);
		} catch (Exception e) {
			System.out.println("Error readByIdProductoListaventa: " + e);
		}
		return null;
	}

	@Override
	public List<Listaventa> readByCantidad(int cantidad) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.readByCantidad(cantidad);
		} catch (Exception e) {
			System.out.println("Error readByIdCantidadListaventa: " + e);
		}
		return null;
	}

	@Override
	public List<Listaventa> readBySubtotal(double subtotal) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.readBySubtotal(subtotal);
		} catch (Exception e) {
			System.out.println("Error readByIdSubtotalListaventa: " + e);
		}
		return null;
	}
	
	@Override
	public void update(Listaventa listaventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.update(listaventa);
		} catch (Exception e) {
			System.out.println("Error updateListaventa: " + e);
		}
	}
	
	@Override
	public void updateIdVenta(int id, int idventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.updateIdVenta(id, idventa);
		} catch (Exception e) {
			System.out.println("Error updateIdVentaListaventa: " + e);
		}
	}

	@Override
	public void updateIdProducto(int id, int idproducto) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.updateIdProducto(id, idproducto);
		} catch (Exception e) {
			System.out.println("Error updateIdProductoListaventa: " + e);
		}
	}

	@Override
	public void updateCantidad(int id, int cantidad) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.updateCantidad(id, cantidad);
		} catch (Exception e) {
			System.out.println("Error updateCantidadListaventa: " + e);
		}
	}

	@Override
	public void updateSubtotal(int id, double subtotal) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.updateSubtotal(id, subtotal);
		} catch (Exception e) {
			System.out.println("Error updateSubtotalListaventa: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteListaventa: " + e);
		}
	}

	@Override
	public Listaventa last() {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			return listaventaMapper.last();
		} catch (Exception e) {
			System.out.println("Error lastListaventa: " + e);
		}
		return null;
	}
}
