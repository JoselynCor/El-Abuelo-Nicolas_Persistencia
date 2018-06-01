package elabuelonicolas.bd.mappers;

import java.util.List;
import elabuelonicolas.bd.domain.Direccion;

public interface DireccionMapper {

	List<Direccion> findAll();

	void create(Direccion direccion);

	Direccion read(int id);

	void update(Direccion direccion);

	void delete(int id);
}
