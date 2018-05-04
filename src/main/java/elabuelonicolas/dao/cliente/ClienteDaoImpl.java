package elabuelonicolas.dao.cliente;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.bd.mappers.ClienteMapper;

@Named
public class ClienteDaoImpl implements ClienteDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Cliente> findAll() {
		List<Cliente> list = null;
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list = clienteMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void create(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.create(cliente);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public Cliente read(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			Cliente cliente = clienteMapper.read(id);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void update(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.update(cliente);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
