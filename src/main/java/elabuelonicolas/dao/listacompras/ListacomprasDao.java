package elabuelonicolas.dao.listacompras;

import java.util.List;

import elabuelonicolas.bd.domain.Listacompras;

public interface ListacomprasDao {

		List<Listacompras> findAll();

		void create(Listacompras listacompra);

		Listacompras read(int id);

		void update(Listacompras listacompra);

		void delete(int id);

}
