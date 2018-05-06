package elabuelonicolas.dao.proveedor;

import java.util.List;

import elabuelonicolas.bd.domain.Proveedor;

public interface ProveedorDao {
	List<Proveedor> findAll();

	void create(Proveedor proveedor);

	Proveedor read(int id);

	void update(Proveedor proveedor);

	void delete(int id);
}
