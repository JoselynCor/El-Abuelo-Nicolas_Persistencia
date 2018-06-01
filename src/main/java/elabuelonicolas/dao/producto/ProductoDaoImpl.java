package elabuelonicolas.dao.producto;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.bd.mappers.ProductoMapper;

@Named
public class ProductoDaoImpl implements ProductoDao{
	
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Producto> findAll() {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.create(producto);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Producto read(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}
	
	@Override
	public List<Producto> readByTipo(String tipo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByTipo(tipo);
		} catch (Exception e) {
			System.out.println("Error readByTipo: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByMarca(String marca) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByMarca(marca);
		} catch (Exception e) {
			System.out.println("Error readByMarca: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByCosto(Double costo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByCosto(costo);
		} catch (Exception e) {
			System.out.println("Error readByCosto: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByExistencia(int existencia) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByExistencia(existencia);
		} catch (Exception e) {
			System.out.println("Error readByExistencia: " + e);
		}
		return null;
	}

	@Override
	public void update(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.update(producto);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateTipo(int id, String tipo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateTipo(id, tipo);
		} catch (Exception e) {
			System.out.println("Error updateTipo: " + e);
		}
	}

	@Override
	public void updateMarca(int id, String marca) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateMarca(id, marca);
		} catch (Exception e) {
			System.out.println("Error updateMarca: " + e);
		}
	}

	@Override
	public void updateCosto(int id, Double costo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateCosto(id, costo);
		} catch (Exception e) {
			System.out.println("Error updateCosto: " + e);
		}
	}

	@Override
	public void updateExistencia(int id, int existencia) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateExistencia(id, existencia);
		} catch (Exception e) {
			System.out.println("Error existencia: " + e);
		}
	}

	
	@Override
	public void delete(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
	
	@Override
	public Producto last() {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.last();
		} catch (Exception e) {
			System.out.println("Error last: " + e);
		}
		return null;
	}
}
