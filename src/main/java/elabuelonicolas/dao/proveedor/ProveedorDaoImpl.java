package elabuelonicolas.dao.proveedor;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.bd.mappers.ProveedorMapper;

@Named
public class ProveedorDaoImpl implements ProveedorDao{


	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Proveedor> findAll() {
		List<Proveedor> list = null;
		try {
			ProveedorMapper clienteMapper = sqlSession.getMapper(ProveedorMapper.class);
			list = clienteMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void create(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.create(proveedor);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public Proveedor read(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			Proveedor proveedor = proveedorMapper.read(id);
			return proveedor;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void update(Proveedor proveedor) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.update(proveedor);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			ProveedorMapper proveedorMapper = sqlSession.getMapper(ProveedorMapper.class);
			proveedorMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
