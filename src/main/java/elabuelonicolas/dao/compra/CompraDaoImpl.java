package elabuelonicolas.dao.compra;

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
	public void update(Compra compra) {
		try {
			CompraMapper compraMapper = sqlSession.getMapper(CompraMapper.class);
			compraMapper.update(compra);
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
}
