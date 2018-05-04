package elabuelonicolas.dao.cliente;

import java.util.List;

import elabuelonicolas.bd.domain.Cliente;

public interface ClienteDao {
	List<Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
}
