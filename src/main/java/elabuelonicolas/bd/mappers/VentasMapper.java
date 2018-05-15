package elabuelonicolas.bd.mappers;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import elabuelonicolas.bd.domain.Ventas;

public interface VentasMapper {
	List<Ventas> findAll();

	void create(Ventas venta);

	Ventas read(int id);

	List<Ventas> readByIdCliente(int id);

	List<Ventas> readByIdListaVenta(int id);

	List<Ventas> readByFecha(Date fecha);

	List<Ventas> readByFechas(@Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);

	void update(Ventas venta);

	void updateIdCliente(@Param("id") int id, @Param("idNuevo") int idNuevo);

	void updateIdListaVenta(@Param("id") int id, @Param("idNuevo") int idNuevo);

	void updateFecha(@Param("id") int id, @Param("fechaNueva") Date FechaNueva);

	void updatePrecioTotal(@Param("id") int id, @Param("precioTotalNuevo") Double precioTotalNuevo);

	void delete(int id);
	
	Ventas last();
}
