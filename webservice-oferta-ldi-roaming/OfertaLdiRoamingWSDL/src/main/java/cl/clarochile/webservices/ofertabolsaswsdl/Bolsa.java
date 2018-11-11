
package cl.clarochile.webservices.ofertabolsaswsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Bolsa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Bolsa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagination" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}paginationTypeBolsas"/>
 *         &lt;element name="bolsa" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}bolsaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bolsa", propOrder = {
    "pagination",
    "bolsa"
})
public class Bolsa {

    @XmlElement(required = true)
    protected PaginationTypeBolsas pagination;
    protected List<BolsaType> bolsa;

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
     * Gets the value of the bolsa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bolsa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBolsa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BolsaType }
     * 
     * 
     */
    public List<BolsaType> getBolsa() {
        if (bolsa == null) {
            bolsa = new ArrayList<BolsaType>();
        }
        return this.bolsa;
    }

}
