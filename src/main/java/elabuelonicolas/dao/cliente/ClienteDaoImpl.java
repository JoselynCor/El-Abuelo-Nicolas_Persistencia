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
	public Cliente readById(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			Cliente cliente = clienteMapper.readById(id);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByName(String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByName(nombre);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByAddress(String direccion) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByAddress(direccion);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByContact(String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByContact(contacto);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByNumber(String numero) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByNumber(numero);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByEmail(String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByEmail(email);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByRfc(String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByRfc(rfc);
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
	public void updateName(int id, String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateName(id, nombre);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void updateAddress(int id, String direccion) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateAddress(id, direccion);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void updateContact(int id, String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateContact(id, contacto);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void updateNumber(int id, String numero) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateNumber(id, numero);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void updateEmail(int id, String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateEmail(id, email);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void updateRfc(int id, String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateRfc(id, rfc);
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

	@Override
	public Cliente lastClient() {
		ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
		return clienteMapper.lastClient();
	}
}
