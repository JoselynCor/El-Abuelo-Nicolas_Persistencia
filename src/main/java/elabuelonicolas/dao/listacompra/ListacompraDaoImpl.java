package elabuelonicolas.dao.listacompra;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Listacompra;
import elabuelonicolas.bd.mappers.ListacompraMapper;

@Named
public class ListacompraDaoImpl implements ListacompraDao {

	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Listacompra> findAll() {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Listacompra listacompra) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.create(listacompra);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Listacompra read(int id) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Listacompra> readByIdCompra(int idcompra) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.readByIdCompra(idcompra);
		} catch (Exception e) {
			System.out.println("Error readByIdCompra: " + e);
		}
		return null;
	}

	@Override
	public List<Listacompra> readByIdProducto(int idproducto) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.readByIdProducto(idproducto);
		} catch (Exception e) {
			System.out.println("Error readByIdProducto: " + e);
		}
		return null;
	}

	@Override
	public List<Listacompra> readByIdCantidad(int cantidad) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.readByIdCantidad(cantidad);
		} catch (Exception e) {
			System.out.println("Error readByIdCantidad: " + e);
		}
		return null;
	}

	@Override
	public List<Listacompra> readByIdSubtotal(double subtotal) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.readByIdSubtotal(subtotal);
		} catch (Exception e) {
			System.out.println("Error readByIdSubtotal: " + e);
		}
		return null;
	}
	
	@Override
	public void update(Listacompra listacompra) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.update(listacompra);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateIdCompra(int id, int idcompra) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.updateIdCompra(id, idcompra);
		} catch (Exception e) {
			System.out.println("Error updateIdCompra: " + e);
		}
	}

	@Override
	public void updateIdProducto(int id, int idproducto) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.updateIdProducto(id, idproducto);
		} catch (Exception e) {
			System.out.println("Error updateIdProducto: " + e);
		}
	}

	@Override
	public void updateCantidad(int id, int cantidad) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.updateCantidad(id, cantidad);
		} catch (Exception e) {
			System.out.println("Error updateCantidad: " + e);
		}
	}

	@Override
	public void updateSubtotal(int id, int subtotal) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.updateSubtotal(id, subtotal);
		} catch (Exception e) {
			System.out.println("Error updateSubtotal: " + e);
		}
	}
	
	@Override
	public void delete(int id) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

	@Override
	public Listacompra last() {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			return listacompraMapper.last();
		} catch (Exception e) {
			System.out.println("Error last: " + e);
		}
		return null;
	}
}
