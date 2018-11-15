
package cl.clarochile.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="bolsaType" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}Bolsa" minOccurs="0"/>
 *         &lt;element name="pagination" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}paginationTypeBolsas"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "bolsaType",
    "pagination",
    "code",
    "description"
})
@XmlRootElement(name = "ConsultaBolsasResponse")
public class ConsultaBolsasResponse {

    protected Bolsa bolsaType;
    @XmlElement(required = true)
    protected PaginationTypeBolsas pagination;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad bolsaType.
     * 
     * @return
     *     possible object is
     *     {@link Bolsa }
     *     
     */
    public Bolsa getBolsaType() {
        return bolsaType;
    }

    /**
     * Define el valor de la propiedad bolsaType.
     * 
     * @param value
     *     allowed object is
     *     {@link Bolsa }
     *     
     */
    public void setBolsaType(Bolsa value) {
        this.bolsaType = value;
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

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
