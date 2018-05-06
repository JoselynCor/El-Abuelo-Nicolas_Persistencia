package elabuelonicolas.bd.mappers;

import java.util.List;

import elabuelonicolas.bd.domain.Listaventas;

public interface ListaventasMapper {
	List<Listaventas> findAll();

	void create(Listaventas listaventas);

	Listaventas read(int id);

	void update(Listaventas listaventas);

	void delete(int id);
}
