package elabuelonicolas.bd.domain;

public class Listacompra {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.id
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.idcompra
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private Integer idcompra;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.idproducto
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private Integer idproducto;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.cantidad
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private Integer cantidad;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.subtotal
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private Double subtotal;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.subtotal
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private String tipo;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column listacompra.subtotal
	 * 
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	private String marca;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column listacompra.id
	 * 
	 * @return the value of listacompra.id
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.id
	 * 
	 * @param id
	 *            the value for listacompra.id
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column listacompra.idcompra
	 * 
	 * @return the value of listacompra.idcompra
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public Integer getIdcompra() {
		return idcompra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.idcompra
	 * 
	 * @param idcompra
	 *            the value for listacompra.idcompra
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column listacompra.idproducto
	 * 
	 * @return the value of listacompra.idproducto
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public Integer getIdproducto() {
		return idproducto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.idproducto
	 * 
	 * @param idproducto
	 *            the value for listacompra.idproducto
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column listacompra.cantidad
	 * 
	 * @return the value of listacompra.cantidad
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.cantidad
	 * 
	 * @param cantidad
	 *            the value for listacompra.cantidad
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column listacompra.subtotal
	 * 
	 * @return the value of listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public Double getSubtotal() {
		return subtotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.subtotal
	 * 
	 * @param subtotal
	 *            the value for listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.subtotal
	 * 
	 * @param subtotal
	 *            the value for listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.subtotal
	 * 
	 * @param subtotal
	 *            the value for listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.subtotal
	 * 
	 * @param subtotal
	 *            the value for listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column listacompra.subtotal
	 * 
	 * @param subtotal
	 *            the value for listacompra.subtotal
	 * @mbg.generated Thu Jun 14 19:38:42 CDT 2018
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
}