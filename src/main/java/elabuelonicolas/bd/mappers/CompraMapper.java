package elabuelonicolas.bd.mappers;

import java.util.List;
import elabuelonicolas.bd.domain.Compra;

public interface CompraMapper {

	List<Compra> findAll();

	void create(Compra compra);

	Compra read(int id);

	void update(Compra compra);

	void delete(int id);
}
