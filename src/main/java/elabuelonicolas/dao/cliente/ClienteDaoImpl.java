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
			System.out.println("Error finAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.create(cliente);
		} catch (Exception e) {
			System.out.println("Error createClient: " + e);
		}
	}

	@Override
	public Cliente read(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			Cliente cliente = clienteMapper.read(id);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error readById: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByNombre(String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByNombre(nombre);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error readByName: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByDireccion(String direccion) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByDireccion(direccion);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error readByAddress: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByContacto(String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			List<Cliente> cliente = clienteMapper.readByContacto(contacto);
			return cliente;
		} catch (Exception e) {
			System.out.println("Error readByContact: " + e);
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
			System.out.println("Error readByNumber: " + e);
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
			System.out.println("Error readByEmail: " + e);
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
			System.out.println("Error readByRfc: " + e);
		}
		return null;
	}

	@Override
	public void update(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.update(cliente);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateNombre(int id, String nombre) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateNombre(id, nombre);
		} catch (Exception e) {
			System.out.println("Error updateName: " + e);
		}
	}

	@Override
	public void updateDireccion(int id, String direccion) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateDireccion(id, direccion);
		} catch (Exception e) {
			System.out.println("Error updateAddress: " + e);
		}
	}

	@Override
	public void updateContacto(int id, String contacto) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateContacto(id, contacto);
		} catch (Exception e) {
			System.out.println("Error updateContact: " + e);
		}
	}

	@Override
	public void updateTelefono(int id, String telefono) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateTelefono(id, telefono);
		} catch (Exception e) {
			System.out.println("Error updateNumber: " + e);
		}
	}

	@Override
	public void updateEmail(int id, String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateEmail(id, email);
		} catch (Exception e) {
			System.out.println("Error updateEmail: " + e);
		}
	}

	@Override
	public void updateRfc(int id, String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateRfc(id, rfc);
		} catch (Exception e) {
			System.out.println("Error updateRfc: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

	@Override
	public Cliente last() {
		ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
		Cliente c = clienteMapper.last(); 
		return c;
	}
}
