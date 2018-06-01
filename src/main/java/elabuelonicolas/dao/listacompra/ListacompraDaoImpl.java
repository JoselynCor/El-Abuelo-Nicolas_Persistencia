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
		List<Listacompra> list = null;
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			list = listacompraMapper.findAll();
			return list;
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
			Listacompra listacompra = listacompraMapper.read(id);
			return listacompra;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
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
	public void delete(int id) {
		try {
			ListacompraMapper listacompraMapper = sqlSession.getMapper(ListacompraMapper.class);
			listacompraMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
