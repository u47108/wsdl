
package cl.clarochile.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoProducto" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}tipoProductoType"/>
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagination" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}paginationTypeBolsas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoProducto",
    "offerId",
    "pagination"
})
@XmlRootElement(name = "ConsultaBolsasRequest")
public class ConsultaBolsasRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoProductoType tipoProducto;
    protected String offerId;
    @XmlElement(required = true)
    protected PaginationTypeBolsas pagination;

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     * @return
     *     possible object is
     *     {@link TipoProductoType }
     *     
     */
    public TipoProductoType getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProductoType }
     *     
     */
    public void setTipoProducto(TipoProductoType value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad offerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Define el valor de la propiedad offerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link PaginationTypeBolsas }
     *     
     */
    public PaginationTypeBolsas getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationTypeBolsas }
     *     
     */
    public void setPagination(PaginationTypeBolsas value) {
        this.pagination = value;
    }

}
