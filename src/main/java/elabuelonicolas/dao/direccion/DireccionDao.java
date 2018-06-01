package elabuelonicolas.dao.direccion;

import java.util.List;
import elabuelonicolas.bd.domain.Direccion;

public interface DireccionDao {
	
	List<Direccion> findAll();

	void create(Direccion compra);

	Direccion read(int id);

	void update(Direccion compra);

	void delete(int id);
}
