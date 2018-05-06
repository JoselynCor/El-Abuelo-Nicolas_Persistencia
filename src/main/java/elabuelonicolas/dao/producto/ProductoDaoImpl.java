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
		List<Producto> list = null;
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			list = productoMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void create(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.create(producto);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public Producto read(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			Producto producto = productoMapper.read(id);
			return producto;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void update(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.update(producto);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
