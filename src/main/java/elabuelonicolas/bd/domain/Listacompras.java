package elabuelonicolas.bd.domain;

public class Listacompras {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ListaCompras.id
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ListaCompras.idProducto
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    private Integer idproducto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ListaCompras.cantidad
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    private Integer cantidad;
    
    /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column ListaCompras.idcompra
    *
    * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
    */
   private Integer idcompra;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ListaCompras.subtotal
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    private Double subtotal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ListaCompras.id
     *
     * @return the value of ListaCompras.id
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ListaCompras.id
     *
     * @param id the value for ListaCompras.id
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ListaCompras.idProducto
     *
     * @return the value of ListaCompras.idProducto
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public Integer getIdproducto() {
        return idproducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ListaCompras.idProducto
     *
     * @param idproducto the value for ListaCompras.idProducto
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ListaCompras.cantidad
     *
     * @return the value of ListaCompras.cantidad
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ListaCompras.cantidad
     *
     * @param cantidad the value for ListaCompras.cantidad
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ListaCompras.idventa
     *
     * @return the value of ListaCompras.idventa
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public Integer getIdcompra() {
        return idcompra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ListaCompras.idventa
     *
     * @param cantidad the value for ListaCompras.idventa
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ListaCompras.subtotal
     *
     * @return the value of ListaCompras.subtotal
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ListaCompras.subtotal
     *
     * @param subtotal the value for ListaCompras.subtotal
     *
     * @mbg.generated Mon Apr 30 16:43:23 CDT 2018
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}