package elabuelonicolas.dao.compras;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Compras;
import elabuelonicolas.bd.mappers.ComprasMapper;

@Named
public class ComprasDaoImpl implements ComprasDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Compras> findAll() {
		List<Compras> list = null;
		try {
			ComprasMapper comprasMapper = sqlSession.getMapper(ComprasMapper.class);
			list = comprasMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Compras compra) {
		try {
			ComprasMapper comprasMapper = sqlSession.getMapper(ComprasMapper.class);
			comprasMapper.create(compra);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Compras read(int id) {
		try {
			ComprasMapper comprasMapper = sqlSession.getMapper(ComprasMapper.class);
			Compras compra = comprasMapper.read(id);
			return compra;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public void update(Compras compra) {
		try {
			ComprasMapper comprasMapper = sqlSession.getMapper(ComprasMapper.class);
			comprasMapper.update(compra);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ComprasMapper comprasMapper = sqlSession.getMapper(ComprasMapper.class);
			comprasMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
