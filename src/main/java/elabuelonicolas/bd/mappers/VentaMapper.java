package elabuelonicolas.bd.mappers;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import elabuelonicolas.bd.domain.Venta;

public interface VentaMapper {
	
	List<Venta> findAll();

	void create(Venta venta);

	Venta read(int id);

	List<Venta> readByIdCliente(int idcliente);

	List<Venta> readByFecha(Date fecha);

	List<Venta> readByFechas(@Param("fechainicio") Date fechainicio, @Param("fechafin") Date fechafin);

	void update(Venta venta);

	void updateIdCliente(@Param("id") int id, @Param("idcliente") int idcliente);

	void updateFecha(@Param("id") int id, @Param("fecha") Date fecha);

	void updateTotal(@Param("id") int id, @Param("total") Double total);

	void delete(int id);
	
	Venta last();
}
