package elabuelonicolas.dao.compra;

import java.sql.Date;
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
		List<Compra> list = null;
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			list = compraMapper.findAll();
			return list;
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
			Compra compra = compraMapper.read(id);
			return compra;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Compra> readByIdProveedor(int idProveedor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compra> readByIdListaCompra(int idListaCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compra> readByFecha(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compra> readByTotal(Double total) {
		// TODO Auto-generated method stub
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
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateIdListaCompra(int id, int idListaCompra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateIdListaCompra(id, idListaCompra);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateFecha(id, fecha);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateTotal(int id, double total) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.updateTotal(id, total);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
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
		CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
		return compraMapper.last(); 
	}
}
