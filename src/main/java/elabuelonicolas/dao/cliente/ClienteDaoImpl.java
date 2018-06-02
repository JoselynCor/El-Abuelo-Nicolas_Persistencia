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
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error finAllCliente: " + e);
		}
		return null;
	}

	@Override
	public void create(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.create(cliente);
		} catch (Exception e) {
			System.out.println("Error createCliente: " + e);
		}
	}

	@Override
	public Cliente read(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByNombre(String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByNombre(nombre);
		} catch (Exception e) {
			System.out.println("Error readByNombreCliente: " + e);
		}
		return null;
	}

	@Override
	public Cliente readByDireccion(int iddireccion) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByDireccion(iddireccion);
		} catch (Exception e) {
			System.out.println("Error readByDireccionCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByContacto(String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByContacto(contacto);
		} catch (Exception e) {
			System.out.println("Error readByContactoCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByTelefono(String telefono) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByTelefono(telefono);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error readByNumberCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByEmail(String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByEmail(email);
		} catch (Exception e) {
			System.out.println("Error readByEmailCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByRfc(String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByRfc(rfc);
		} catch (Exception e) {
			System.out.println("Error readByRfcCliente: " + e);
		}
		return null;
	}

	@Override
	public void update(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.update(cliente);
		} catch (Exception e) {
			System.out.println("Error updateCliente: " + e);
		}
	}

	@Override
	public void updateNombre(int id, String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateNombre(id, nombre);
		} catch (Exception e) {
			System.out.println("Error updateNombreCliente: " + e);
		}
	}

	@Override
	public void updateContacto(int id, String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateContacto(id, contacto);
		} catch (Exception e) {
			System.out.println("Error updateContactoCliente: " + e);
		}
	}

	@Override
	public void updateTelefono(int id, String telefono) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateTelefono(id, telefono);
		} catch (Exception e) {
			System.out.println("Error updateTelefonoCliente: " + e);
		}
	}

	@Override
	public void updateEmail(int id, String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateEmail(id, email);
		} catch (Exception e) {
			System.out.println("Error updateEmailCliente: " + e);
		}
	}

	@Override
	public void updateRfc(int id, String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateRfc(id, rfc);
		} catch (Exception e) {
			System.out.println("Error updateRfcCliente: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteCliente: " + e);
		}
	}

	@Override
	public Cliente last() {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.last();
		} catch (Exception e) {
			System.out.println("Error lastCliente: " + e);
		}
		return null;
	}
}
