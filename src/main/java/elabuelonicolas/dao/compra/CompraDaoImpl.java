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
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Compra compra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.create(compra);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Compra read(int id) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByIdProveedor(int idProveedor) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByIdProveedor(idProveedor);
		} catch (Exception e) {
			System.out.println("Error readByIdProveedor: " + e);
		}
		return null;
	}

	@Override
	public Compra readByIdListaCompra(int idListaCompra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByIdListaCompra(idListaCompra);
		} catch (Exception e) {
			System.out.println("Error readByIdListaCompra: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByFecha(Date fecha) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByFecha(fecha);
		} catch (Exception e) {
			System.out.println("Error readByFecha: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByTotal(Double total) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.readByTotal(total);
		} catch (Exception e) {
			System.out.println("Error readByTotal: " + e);
		}
		return null;
	}
	
	@Override
	public void update(Compra compra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.update(compra);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}
	
	@Override
	public void updateIdProveedor(int id, int idProveedor) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateIdProveedor(id, idProveedor);
		} catch (Exception e) {
			System.out.println("Error updateIdProveedor: " + e);
		}
	}

	@Override
	public void updateIdListaCompra(int id, int idListaCompra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateIdListaCompra(id, idListaCompra);
		} catch (Exception e) {
			System.out.println("Error updateIdListaCompra: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateFecha(id, fecha);
		} catch (Exception e) {
			System.out.println("Error updateFecha: " + e);
		}
	}

	@Override
	public void updateTotal(int id, double total) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateTotal(id, total);
		} catch (Exception e) {
			System.out.println("Error updateTotal: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

	@Override
	public Compra last() {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			return compraMapper.last(); 			
		} catch(Exception e) {
			System.out.println("Error last: " + e);
		}
		return null;
	}
}
