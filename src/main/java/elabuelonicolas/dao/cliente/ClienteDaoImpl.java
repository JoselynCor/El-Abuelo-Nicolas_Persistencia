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
	public Cliente readByTelefono(String telefono) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByTelefono(telefono);
		} catch (Exception e) {
			System.out.println("Error readByNumberCliente: " + e);
		}
		return null;
	}

	@Override
	public Cliente readByEmail(String email) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByEmail(email);
		} catch (Exception e) {
			System.out.println("Error readByEmailCliente: " + e);
		}
		return null;
	}

	@Override
	public Cliente readByRfc(String rfc) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByRfc(rfc);
		} catch (Exception e) {
			System.out.println("Error readByRfcCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByEstado(String estado) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByEstado(estado);
		} catch (Exception e) {
			System.out.println("Error readByEstadoCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByMunicipio(String municipio) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByMunicipio(municipio);
		} catch (Exception e) {
			System.out.println("Error readByMunicipioCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByLocalidad(String localidad) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByLocalidad(localidad);
		} catch (Exception e) {
			System.out.println("Error readByLocalidadCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByCodigoPostal(String codigopostal) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByCodigoPostal(codigopostal);
		} catch (Exception e) {
			System.out.println("Error readByCodigoPostalCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByAsentamiento(String asentamiento) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByAsentamiento(asentamiento);
		} catch (Exception e) {
			System.out.println("Error readByAsentamientoCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByCalle(String calle) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByCalle(calle);
		} catch (Exception e) {
			System.out.println("Error readByCalleCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByNumero(String numero) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByNumero(numero);
		} catch (Exception e) {
			System.out.println("Error readByNumeroCliente: " + e);
		}
		return null;
	}

	@Override
	public List<Cliente> readByStatus(String status) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			return clienteMapper.readByStatus(status);
		} catch (Exception e) {
			System.out.println("Error readByStatusCliente: " + e);
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
	public void updateEstado(int id, String estado) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateEstado(id, estado);
		} catch (Exception e) {
			System.out.println("Error updateEstadoCliente: " + e);
		}
	}

	@Override
	public void updateMunicipio(int id, String municipio) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateMunicipio(id, municipio);
		} catch (Exception e) {
			System.out.println("Error updateMunicipioCliente: " + e);
		}
	}

	@Override
	public void updateLocalidad(int id, String localidad) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateLocalidad(id, localidad);
		} catch (Exception e) {
			System.out.println("Error updateLocalidadCliente: " + e);
		}
	}

	@Override
	public void updateCodigoPostal(int id, String codigopostal) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateCodigoPostal(id, codigopostal);
		} catch (Exception e) {
			System.out.println("Error updateCodigoPostalCliente: " + e);
		}
	}

	@Override
	public void updateAsentamiento(int id, String asentamiento) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateAsentamiento(id, asentamiento);
		} catch (Exception e) {
			System.out.println("Error updateAsentamientoCliente: " + e);
		}
	}

	@Override
	public void updateCalle(int id, String calle) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateCalle(id, calle);
		} catch (Exception e) {
			System.out.println("Error updateCalleCliente: " + e);
		}
	}

	@Override
	public void updateNumero(int id, String numero) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateNumero(id, numero);
		} catch (Exception e) {
			System.out.println("Error updateNumeroCliente: " + e);
		}
	}

	@Override
	public void updateStatus(int id, String status) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateStatus(id, status);
		} catch (Exception e) {
			System.out.println("Error updateStatusCliente: " + e);
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
