package elabuelonicolas.dao.listaventa;

import java.util.List;

import elabuelonicolas.bd.domain.Listaventa;

public interface ListaventaDao {

	List<Listaventa> findAll();

	void create(Listaventa listaventa);

	Listaventa read(int id);

	void update(Listaventa listaventa);

	void delete(int id);

}
