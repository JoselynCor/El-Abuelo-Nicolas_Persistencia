package elabuelonicolas.dao.listaventas;

import java.util.List;

import elabuelonicolas.bd.domain.Listaventas;

public interface ListaventasDao {

	List<Listaventas> findAll();

	void create(Listaventas listaventa);

	Listaventas read(int id);

	void update(Listaventas listaventa);

	void delete(int id);

}
