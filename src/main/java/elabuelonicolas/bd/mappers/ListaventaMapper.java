package elabuelonicolas.bd.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import elabuelonicolas.bd.domain.Listaventa;

public interface ListaventaMapper {
	List<Listaventa> findAll();

	void create(Listaventa listaventa);

	Listaventa read(int id);
	
	List<Listaventa> readByIdVenta(int idventa);
	
	List<Listaventa> readByIdProducto(int idproducto);
	
	List<Listaventa> readByIdCantidad(int cantidad);
	
	List<Listaventa> readByIdSubtotal(double subtotal);

	void update(Listaventa listaventas);
	
	void updateIdVenta(@Param("id") int id, @Param("idventa") int idventa);
	
	void updateIdProducto(@Param("id") int id, @Param("idproducto") int idProducto);
	
	void updateCantidad(@Param("id") int id, @Param("cantidad") int cantidad);
	
	void updateSubtotal(@Param("id") int id, @Param("subtotal") double subtotal);

	void delete(int id);
	
	Listaventa last();
}
