
package cl.clarochile.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paginationTypeBolsas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paginationTypeBolsas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitpage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pagenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalrow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paginationTypeBolsas", propOrder = {
    "limitpage",
    "pagenumber",
    "totalrow"
})
public class PaginationTypeBolsas {

    @XmlElement(required = true)
    protected String limitpage;
    @XmlElement(required = true)
    protected String pagenumber;
    @XmlElement(required = true)
    protected String totalrow;

    /**
     * Obtiene el valor de la propiedad limitpage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitpage() {
        return limitpage;
    }

    /**
     * Define el valor de la propiedad limitpage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitpage(String value) {
        this.limitpage = value;
    }

    /**
     * Obtiene el valor de la propiedad pagenumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagenumber() {
        return pagenumber;
    }

    /**
     * Define el valor de la propiedad pagenumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagenumber(String value) {
        this.pagenumber = value;
    }

    /**
     * Obtiene el valor de la propiedad totalrow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalrow() {
        return totalrow;
    }

    /**
     * Define el valor de la propiedad totalrow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalrow(String value) {
        this.totalrow = value;
    }

}
