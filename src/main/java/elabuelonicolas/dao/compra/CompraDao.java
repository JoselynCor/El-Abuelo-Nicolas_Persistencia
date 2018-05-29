package elabuelonicolas.dao.compra;

import java.util.List;
import elabuelonicolas.bd.domain.Compra;

public interface CompraDao {
	List<Compra> findAll();

	void create(Compra compra);

	Compra read(int id);

	void update(Compra compra);

	void delete(int id);
}
