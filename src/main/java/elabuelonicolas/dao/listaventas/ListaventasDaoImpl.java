package elabuelonicolas.dao.listaventas;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Listaventas;
import elabuelonicolas.bd.mappers.ListaventasMapper;

@Named
public class ListaventasDaoImpl implements ListaventasDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Listaventas> findAll() {
		List<Listaventas> list = null;
		try {
			ListaventasMapper listaventasMapper = sqlSession.getMapper(ListaventasMapper.class);
			list = listaventasMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Listaventas listaventa) {
		try {
			ListaventasMapper listaventasMapper = sqlSession.getMapper(ListaventasMapper.class);
			listaventasMapper.create(listaventa);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Listaventas read(int id) {
		try {
			ListaventasMapper listaventasMapper = sqlSession.getMapper(ListaventasMapper.class);
			Listaventas listaventa = listaventasMapper.read(id);
			return listaventa;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public void update(Listaventas listaventa) {
		try {
			ListaventasMapper listaventasMapper = sqlSession.getMapper(ListaventasMapper.class);
			listaventasMapper.update(listaventa);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ListaventasMapper listaventasMapper = sqlSession.getMapper(ListaventasMapper.class);
			listaventasMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}
