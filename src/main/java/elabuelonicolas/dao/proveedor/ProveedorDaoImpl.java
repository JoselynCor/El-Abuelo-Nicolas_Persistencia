package elabuelonicolas.dao.proveedor;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.bd.mappers.ProveedorMapper;

@Named
public class ProveedorDaoImpl implements ProveedorDao {

	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Proveedor> findAll() {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.findAll();
		} catch (Exception e) {
			System.out.println("Error findAllProveedor: " + e);
		}
		return null;
	}

	@Override
	public void create(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.create(proveedor);
		} catch (Exception e) {
			System.out.println("Error createProveedor: " + e);
		}
	}

	@Override
	public Proveedor read(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error readProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByNombre(String nombre) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByNombre(nombre);
		} catch (Exception e) {
			System.out.println("Error readByNombreProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByContacto(String contacto) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByContacto(contacto);
		} catch (Exception e) {
			System.out.println("Error readByContactoProveedor: " + e);
		}
		return null;
	}

	@Override
	public Proveedor readByTelefono(String telefono) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByTelefono(telefono);
		} catch (Exception e) {
			System.out.println("Error readByNumberProveedor: " + e);
		}
		return null;
	}

	@Override
	public Proveedor readByEmail(String email) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByEmail(email);
		} catch (Exception e) {
			System.out.println("Error readByEmailProveedor: " + e);
		}
		return null;
	}

	@Override
	public Proveedor readByRfc(String rfc) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByRfc(rfc);
		} catch (Exception e) {
			System.out.println("Error readByRfcProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByEstado(String estado) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByEstado(estado);
		} catch (Exception e) {
			System.out.println("Error readByEstadoProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByMunicipio(String municipio) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByMunicipio(municipio);
		} catch (Exception e) {
			System.out.println("Error readByMunicipioProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByLocalidad(String localidad) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByLocalidad(localidad);
		} catch (Exception e) {
			System.out.println("Error readByLocalidadProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByCodigoPostal(String codigopostal) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByCodigoPostal(codigopostal);
		} catch (Exception e) {
			System.out.println("Error readByCodigoPostalProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByAsentamiento(String asentamiento) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByAsentamiento(asentamiento);
		} catch (Exception e) {
			System.out.println("Error readByAsentamientoProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByCalle(String calle) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByCalle(calle);
		} catch (Exception e) {
			System.out.println("Error readByCalleProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByNumero(String numero) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByNumero(numero);
		} catch (Exception e) {
			System.out.println("Error readByNumeroProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByStatus(String status) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByStatus(status);
		} catch (Exception e) {
			System.out.println("Error readByStatusProveedor: " + e);
		}
		return null;
	}

	@Override
	public void update(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.update(proveedor);
		} catch (Exception e) {
			System.out.println("Error updateProveedor: " + e);
		}
	}

	@Override
	public void updateNombre(int id, String nombre) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateNombre(id, nombre);
		} catch (Exception e) {
			System.out.println("Error updateNombreProveedor: " + e);
		}
	}

	@Override
	public void updateContacto(int id, String contacto) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateContacto(id, contacto);
		} catch (Exception e) {
			System.out.println("Error updateContactoProveedor: " + e);
		}
	}

	@Override
	public void updateTelefono(int id, String telefono) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateTelefono(id, telefono);
		} catch (Exception e) {
			System.out.println("Error updateTelefonoProveedor: " + e);
		}
	}

	@Override
	public void updateEmail(int id, String email) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateEmail(id, email);
		} catch (Exception e) {
			System.out.println("Error updateEmailProveedor: " + e);
		}
	}

	@Override
	public void updateRfc(int id, String rfc) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateRfc(id, rfc);
		} catch (Exception e) {
			System.out.println("Error updateRfcProveedor: " + e);
		}
	}

	@Override
	public void updateEstado(int id, String estado) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateEstado(id, estado);
		} catch (Exception e) {
			System.out.println("Error updateEstadoProveedor: " + e);
		}
	}

	@Override
	public void updateMunicipio(int id, String municipio) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateMunicipio(id, municipio);
		} catch (Exception e) {
			System.out.println("Error updateMunicipioProveedor: " + e);
		}
	}

	@Override
	public void updateLocalidad(int id, String localidad) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateLocalidad(id, localidad);
		} catch (Exception e) {
			System.out.println("Error updateLocalidadProveedor: " + e);
		}
	}

	@Override
	public void updateCodigoPostal(int id, String codigopostal) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateCodigoPostal(id, codigopostal);
		} catch (Exception e) {
			System.out.println("Error updateCodigoPostalProveedor: " + e);
		}
	}

	@Override
	public void updateAsentamiento(int id, String asentamiento) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateAsentamiento(id, asentamiento);
		} catch (Exception e) {
			System.out.println("Error updateAsentamientoProveedor: " + e);
		}
	}

	@Override
	public void updateCalle(int id, String calle) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateCalle(id, calle);
		} catch (Exception e) {
			System.out.println("Error updateCalleProveedor: " + e);
		}
	}

	@Override
	public void updateNumero(int id, String numero) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateNumero(id, numero);
		} catch (Exception e) {
			System.out.println("Error updateNumeroProveedor: " + e);
		}
	}

	@Override
	public void updateStatus(int id, String status) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateStatus(id, status);
		} catch (Exception e) {
			System.out.println("Error updateStatusProveedor: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error deleteProveedor: " + e);
		}
	}

	@Override
	public Proveedor last() {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.last();
		} catch (Exception e) {
			System.out.println("Error deleteProveedor: " + e);
		}
		return null;
	}
}
