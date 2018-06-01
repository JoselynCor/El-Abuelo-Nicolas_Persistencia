package elabuelonicolas.bd.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import elabuelonicolas.bd.domain.Listacompra;

public interface ListacompraMapper {
	List<Listacompra> findAll();

	void create(Listacompra listacompra);

	Listacompra read(int id);

	List<Listacompra> readByIdCompra(int idcompra);

	List<Listacompra> readByIdProducto(int idproducto);

	List<Listacompra> readByIdCantidad(int cantidad);

	List<Listacompra> readByIdSubtotal(double subtotal);

	void update(Listacompra listacompra);

	void updateIdCompra(@Param("id") int id, @Param("idcompra") int idcompra);

	void updateIdProducto(@Param("id") int id, @Param("idproducto") int idProducto);

	void updateCantidad(@Param("id") int id, @Param("cantidad") int cantidad);

	void updateSubtotal(@Param("id") int id, @Param("subtotal") int subtotal);

	void delete(int id);

	Listacompra last();
}
