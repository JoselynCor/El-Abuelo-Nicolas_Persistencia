package elabuelonicolas.dao.listaventa;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.bd.mappers.ListaventaMapper;

@Named
public class ListaventaDaoImpl implements ListaventaDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Listaventa> findAll() {
		List<Listaventa> list = null;
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			list = listaventaMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Listaventa listaventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.create(listaventa);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Listaventa read(int id) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			Listaventa listaventa = listaventaMapper.read(id);
			return listaventa;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public void update(Listaventa listaventa) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.update(listaventa);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ListaventaMapper listaventaMapper = sqlSession.getMapper(ListaventaMapper.class);
			listaventaMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
