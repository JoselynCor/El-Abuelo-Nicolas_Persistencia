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
	public List<Cliente> findAllClientes() {
		List<Cliente> list = null;
		try {
			ClienteMapper clienteMapper = sqlSession
					.getMapper(ClienteMapper.class);
			list = clienteMapper.findAllClientes();

			for (Cliente c : list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
			}
			return list;
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		try {
			ClienteMapper clienteMapper = sqlSession
					.getMapper(ClienteMapper.class);
			clienteMapper.updateCliente(cliente);
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
