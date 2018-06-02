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
	public Proveedor readByDireccion(int iddireccion) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByDireccion(iddireccion);
		} catch (Exception e) {
			System.out.println("Error readByDireccionProveedor: " + e);
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
	public List<Proveedor> readByTelefono(String telefono) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			List<Proveedor> proveedor = proveedorMapper.readByTelefono(telefono);
			return proveedor;
		} catch (Exception e) {
			System.out.println("Error readByNumberProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByEmail(String email) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByEmail(email);
		} catch (Exception e) {
			System.out.println("Error readByEmailProveedor: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByRfc(String rfc) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByRfc(rfc);
		} catch (Exception e) {
			System.out.println("Error readByRfcProveedor: " + e);
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
