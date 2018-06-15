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
			System.out.println("Error findAllProducto: " + e);
		}
		return null;
	}

	@Override
	public void create(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.create(producto);
		} catch (Exception e) {
			System.out.println("Error createProducto: " + e);
		}
	}

	@Override
	public Producto read(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readProducto: " + e);
		}
		return null;
	}
	
	@Override
	public List<Producto> readByTipo(String tipo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByTipo(tipo);
		} catch (Exception e) {
			System.out.println("Error readByTipoProducto: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByMarca(String marca) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByMarca(marca);
		} catch (Exception e) {
			System.out.println("Error readByMarcaProducto: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByCostoCompra(Double costo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByCostoCompra(costo);
		} catch (Exception e) {
			System.out.println("Error readByCostoProducto: " + e);
		}
		return null;
	}
	
	@Override
	public List<Producto> readByCostoVenta(Double costoventa) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByCostoVenta(costoventa);
		} catch (Exception e) {
			System.out.println("Error readByCostoVentaProducto: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByStatus(int status) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByStatus(status);
		} catch (Exception e) {
			System.out.println("Error readByStatusProducto: " + e);
		}
		return null;
	}

	@Override
	public List<Producto> readByExistencia(int existencia) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.readByExistencia(existencia);
		} catch (Exception e) {
			System.out.println("Error readByExistenciaProducto: " + e);
		}
		return null;
	}

	@Override
	public void update(Producto producto) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.update(producto);
		} catch (Exception e) {
			System.out.println("Error updateProducto: " + e);
		}
	}

	@Override
	public void updateTipo(int id, String tipo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateTipo(id, tipo);
		} catch (Exception e) {
			System.out.println("Error updateTipoProducto: " + e);
		}
	}

	@Override
	public void updateMarca(int id, String marca) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateMarca(id, marca);
		} catch (Exception e) {
			System.out.println("Error updateMarcaProducto: " + e);
		}
	}

	@Override
	public void updateCostoCompra(int id, Double costo) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateCostoCompra(id, costo);
		} catch (Exception e) {
			System.out.println("Error updateCostoProducto: " + e);
		}
	}

	@Override
	public void updateCostoVenta(int id, Double costoventa) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateCostoVenta(id, costoventa);
		} catch (Exception e) {
			System.out.println("Error updateCostoVentaProducto: " + e);
		}
	}

	@Override
	public void updateStatus(int id, int status) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateStatus(id, status);
		} catch (Exception e) {
			System.out.println("Error updateStatusProducto: " + e);
		}
	}
	
	@Override
	public void updateExistencia(int id, int existencia) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.updateExistencia(id, existencia);
		} catch (Exception e) {
			System.out.println("Error existenciaProducto: " + e);
		}
	}
	
	@Override
	public void delete(int id) {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			productoMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteProducto: " + e);
		}
	}
	
	@Override
	public Producto last() {
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			return productoMapper.last();
		} catch (Exception e) {
			System.out.println("Error lastProducto: " + e);
		}
		return null;
	}
}
