package elabuelonicolas.dao.listacompra;

import java.util.List;
import elabuelonicolas.bd.domain.Listacompra;

public interface ListacompraDao {

	List<Listacompra> findAll();

	void create(Listacompra listacompra);

	Listacompra read(int id);

	void update(Listacompra listacompra);

	void delete(int id);

}
