package elabuelonicolas.dao.ventas;

import java.util.List;

import elabuelonicolas.bd.domain.Ventas;

public interface VentasDao {
	List<Ventas> findAll();

	void create(Ventas venta);

	Ventas read(int id);

	void update(Ventas venta);

	void delete(int id);
}
