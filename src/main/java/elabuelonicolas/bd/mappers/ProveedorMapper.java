package elabuelonicolas.bd.mappers;

import java.util.List;

import elabuelonicolas.bd.domain.Proveedor;

public interface ProveedorMapper {
	List<Proveedor> findAll();

	void create(Proveedor proveedor);

	Proveedor read(int id);

	void update(Proveedor proveedor);

	void delete(int id);
}
