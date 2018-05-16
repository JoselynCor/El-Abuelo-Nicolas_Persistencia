package elabuelonicolas.bd.mappers;
import java.util.List;

import elabuelonicolas.bd.domain.Compras;

public interface ComprasMapper {

		List<Compras> findAll();

		void create(Compras compra);

		Compras read(int id);

		void update(Compras compra);

		void delete(int id);
}
