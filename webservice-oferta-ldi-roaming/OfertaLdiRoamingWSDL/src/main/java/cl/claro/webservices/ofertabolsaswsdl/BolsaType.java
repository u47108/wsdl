
package cl.claro.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
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
 *         &lt;element name="tipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoBolsa" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "offerId",
    "offerName",
    "recurrente",
    "duracion",
    "duracionUnidad",
    "precio",
    "descripcion",
    "estado",
    "orden",
    "destacado",
    "fechaIngreso",
    "fechaModificacion",
    "tipoProducto",
    "tipoBolsa"
})
public class BolsaType {

    @XmlElement(required = true)
    protected String offerId;
    @XmlElement(required = true)
    protected String offerName;
    @XmlElement(required = true)
    protected String recurrente;
    @XmlElement(required = true)
    protected String duracion;
    @XmlElement(required = true)
    protected String duracionUnidad;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(required = true)
    protected String descripcion;
    protected boolean estado;
    @XmlElement(required = true)
    protected String orden;
    protected boolean destacado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngreso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(required = true)
    protected String tipoProducto;
    @XmlElement(required = true)
    protected String tipoBolsa;

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
     * Obtiene el valor de la propiedad offerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Define el valor de la propiedad offerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
    }

    /**
     * Obtiene el valor de la propiedad recurrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrente() {
        return recurrente;
    }

    /**
     * Define el valor de la propiedad recurrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrente(String value) {
        this.recurrente = value;
    }

    /**
     * Obtiene el valor de la propiedad duracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Define el valor de la propiedad duracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracion(String value) {
        this.duracion = value;
    }

    /**
     * Obtiene el valor de la propiedad duracionUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracionUnidad() {
        return duracionUnidad;
    }

    /**
     * Define el valor de la propiedad duracionUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracionUnidad(String value) {
        this.duracionUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(boolean value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrden(String value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad destacado.
     * 
     */
    public boolean isDestacado() {
        return destacado;
    }

    /**
     * Define el valor de la propiedad destacado.
     * 
     */
    public void setDestacado(boolean value) {
        this.destacado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProducto(String value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBolsa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBolsa() {
        return tipoBolsa;
    }

    /**
     * Define el valor de la propiedad tipoBolsa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBolsa(String value) {
        this.tipoBolsa = value;
    }

}
