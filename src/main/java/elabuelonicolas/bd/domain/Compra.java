package elabuelonicolas.bd.domain;

import java.util.Date;

public class Compra {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra.id
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra.idproveedor
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	private Integer idproveedor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra.fecha
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	private Date fecha;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra.total
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	private Double total;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra.id
	 * @return  the value of compra.id
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra.id
	 * @param id  the value for compra.id
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra.idproveedor
	 * @return  the value of compra.idproveedor
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public Integer getIdproveedor() {
		return idproveedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra.idproveedor
	 * @param idproveedor  the value for compra.idproveedor
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra.fecha
	 * @return  the value of compra.fecha
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra.fecha
	 * @param fecha  the value for compra.fecha
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra.total
	 * @return  the value of compra.total
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra.total
	 * @param total  the value for compra.total
	 * @mbg.generated  Thu May 31 22:35:26 CDT 2018
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
}