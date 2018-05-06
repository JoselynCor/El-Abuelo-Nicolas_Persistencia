package elabuelonicolas.bd.mappers;

import java.util.List;
import elabuelonicolas.bd.domain.Listacompras;

public interface ListacomprasMapper {
	
	List<Listacompras> findAll();

	void create(Listacompras listacompra);

	Listacompras read(int id);

	void update(Listacompras listacompra);

	void delete(int id);

}
