package elabuelonicolas.dao.compras;

import java.util.List;

import elabuelonicolas.bd.domain.Compras;

public interface ComprasDao {
	List<Compras> findAll();

	void create(Compras compra);

	Compras read(int id);

	void update(Compras compra);

	void delete(int id);
}
