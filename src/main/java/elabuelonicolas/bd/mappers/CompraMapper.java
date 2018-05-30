package elabuelonicolas.bd.mappers;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Compra;

public interface CompraMapper {

	List<Compra> findAll();

	void create(Compra compra);

	Compra read(int id);
	
	List<Compra> readByIdProveedor(int idProveedor);
	
	List<Compra> readByIdListaCompra(int idListaCompra);
	
	List<Compra> readByIdFecha(Date fecha);
	
	List<Compra> readByIdTotal(Double total);
	
	void update(Compra compra);
	
	void updateIdProveedor(@Param("id") int id, @Param("idProveedor") int idProveedor);
	
	void updateIdListaCompra(@Param("id") int id, @Param("idListaCompra") int idListaCompra);
	
	void updateFecha(@Param("id") int id, @Param("fecha") Date fecha);
	
	void updateTotal(@Param("id") int id, @Param("total") double total);

	void delete(int id);
	
	Compra last();
}
