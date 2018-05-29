package elabuelonicolas.bd.mappers;

import java.util.List;
import elabuelonicolas.bd.domain.Listaventa;

public interface ListaventaMapper {
	List<Listaventa> findAll();

	void create(Listaventa listaventas);

	Listaventa read(int id);

	void update(Listaventa listaventas);

	void delete(int id);
}
