package elabuelonicolas.bd.mappers;

import java.util.List;

import elabuelonicolas.bd.domain.Cliente;;

public interface ClienteMapper {
	List <Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
}
