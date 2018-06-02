package elabuelonicolas.dao.compra;

import java.util.Date;
import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Compra;
import elabuelonicolas.bd.mappers.CompraMapper;

@Named
public class CompraDaoImpl implements CompraDao {
	
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Compra> findAll() {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.findAll(); 
		} catch (Exception e) {
			System.out.println("Error findAllCompra: " + e);
		}
		return null;
	}

	@Override
	public void create(Compra compra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.create(compra);
		} catch (Exception e) {
			System.out.println("Error createCompra: " + e);
		}
	}

	@Override
	public Compra read(int id) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readCompra: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByIdProveedor(int idproveedor) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByIdProveedor(idproveedor);
		} catch (Exception e) {
			System.out.println("Error readByIdProveedorCompra: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByFecha(Date fecha) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByFecha(fecha);
		} catch (Exception e) {
			System.out.println("Error readByFechaCompra: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByTotal(Double total) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByTotal(total);
		} catch (Exception e) {
			System.out.println("Error readByTotalCompra: " + e);
		}
		return null;
	}
	
	@Override
	public void update(Compra compra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.update(compra);
		} catch (Exception e) {
			System.out.println("Error updateCompra: " + e);
		}
	}
	
	@Override
	public void updateIdProveedor(int id, int idproveedor) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateIdProveedor(id, idproveedor);
		} catch (Exception e) {
			System.out.println("Error updateIdProveedorCompra: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateFecha(id, fecha);
		} catch (Exception e) {
			System.out.println("Error updateFechaCompra: " + e);
		}
	}

	@Override
	public void updateTotal(int id, double total) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateTotal(id, total);
		} catch (Exception e) {
			System.out.println("Error updateTotalCompra: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteCompra: " + e);
		}
	}

	@Override
	public Compra last() {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.last(); 			
		} catch(Exception e) {
			System.out.println("Error lastCompra: " + e);
		}
		return null;
	}
}
