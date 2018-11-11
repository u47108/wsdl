
package cl.clarochile.webservices.ofertabolsaswsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para bolsaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bolsaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recurrente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duracionUnidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destacado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tipoProducto" type="{http://www.clarochile.cl/webservices/ofertaBolsasWSDL/}tipoProductoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bolsaType", propOrder = {
    "offerIdAndOfferNameAndRecurrente"
})
public class BolsaType {

    @XmlElementRefs({
        @XmlElementRef(name = "estado", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "destacado", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipoProducto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "offerName", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recurrente", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "duracionUnidad", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "orden", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "duracion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaModificacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "descripcion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaIngreso", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "offerId", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> offerIdAndOfferNameAndRecurrente;

    /**
     * Gets the value of the offerIdAndOfferNameAndRecurrente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerIdAndOfferNameAndRecurrente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferIdAndOfferNameAndRecurrente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link TipoProductoType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getOfferIdAndOfferNameAndRecurrente() {
        if (offerIdAndOfferNameAndRecurrente == null) {
            offerIdAndOfferNameAndRecurrente = new ArrayList<JAXBElement<?>>();
        }
        return this.offerIdAndOfferNameAndRecurrente;
    }

}
