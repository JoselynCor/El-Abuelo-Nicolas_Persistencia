package elabuelonicolas.dao.listacompras;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Listacompras;
import elabuelonicolas.bd.mappers.ListacomprasMapper;

@Named
public class ListacomprasDaoImpl implements ListacomprasDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Listacompras> findAll() {
		List<Listacompras> list = null;
		try {
			ListacomprasMapper listacomprasMapper = sqlSession.getMapper(ListacomprasMapper.class);
			list = listacomprasMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Listacompras listacompra) {
		try {
			ListacomprasMapper listacomprasMapper = sqlSession.getMapper(ListacomprasMapper.class);
			listacomprasMapper.create(listacompra);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Listacompras read(int id) {
		try {
			ListacomprasMapper listacomprasMapper = sqlSession.getMapper(ListacomprasMapper.class);
			Listacompras listacompra = listacomprasMapper.read(id);
			return listacompra;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public void update(Listacompras listacompra) {
		try {
			ListacomprasMapper listacomprasMapper = sqlSession.getMapper(ListacomprasMapper.class);
			listacomprasMapper.update(listacompra);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ListacomprasMapper listacomprasMapper = sqlSession.getMapper(ListacomprasMapper.class);
			listacomprasMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
