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
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.create(proveedor);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Proveedor read(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.read(id);
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByNombre(String nombre) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByNombre(nombre);
		} catch (Exception e) {
			System.out.println("Error readByNombre: " + e);
		}
		return null;
	}

	@Override
	public Proveedor readByDireccion(int idDireccion) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByDireccion(idDireccion);
		} catch (Exception e) {
			System.out.println("Error readByDireccion: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByContacto(String contacto) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByContacto(contacto);
		} catch (Exception e) {
			System.out.println("Error readByContacto: " + e);
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
			System.out.println("Error readByNumber: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByEmail(String email) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByEmail(email);
		} catch (Exception e) {
			System.out.println("Error readByEmail: " + e);
		}
		return null;
	}

	@Override
	public List<Proveedor> readByRfc(String rfc) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			return proveedorMapper.readByRfc(rfc);
		} catch (Exception e) {
			System.out.println("Error readByRfc: " + e);
		}
		return null;
	}

	@Override
	public void update(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.update(proveedor);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Override
	public void updateNombre(int id, String nombre) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateNombre(id, nombre);
		} catch (Exception e) {
			System.out.println("Error updateNombre: " + e);
		}
	}

	@Override
	public void updateContacto(int id, String contacto) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateContacto(id, contacto);
		} catch (Exception e) {
			System.out.println("Error updateContacto: " + e);
		}
	}

	@Override
	public void updateTelefono(int id, String telefono) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateTelefono(id, telefono);
		} catch (Exception e) {
			System.out.println("Error updateTelefono: " + e);
		}
	}

	@Override
	public void updateEmail(int id, String email) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateEmail(id, email);
		} catch (Exception e) {
			System.out.println("Error updateEmail: " + e);
		}
	}

	@Override
	public void updateRfc(int id, String rfc) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.updateRfc(id, rfc);
		} catch (Exception e) {
			System.out.println("Error updateRfc: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

	@Override
	public Proveedor last() {
		ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
		return proveedorMapper.last();
	}
}
