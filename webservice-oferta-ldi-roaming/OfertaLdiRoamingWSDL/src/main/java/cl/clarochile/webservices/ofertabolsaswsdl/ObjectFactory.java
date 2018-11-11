
package cl.clarochile.webservices.ofertabolsaswsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.clarochile.webservices.ofertabolsaswsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BolsaTypeDescripcion_QNAME = new QName("", "descripcion");
    private final static QName _BolsaTypeEstado_QNAME = new QName("", "estado");
    private final static QName _BolsaTypeOfferName_QNAME = new QName("", "offerName");
    private final static QName _BolsaTypeFechaModificacion_QNAME = new QName("", "fechaModificacion");
    private final static QName _BolsaTypeDuracionUnidad_QNAME = new QName("", "duracionUnidad");
    private final static QName _BolsaTypeFechaIngreso_QNAME = new QName("", "fechaIngreso");
    private final static QName _BolsaTypePrecio_QNAME = new QName("", "precio");
    private final static QName _BolsaTypeTipoProducto_QNAME = new QName("", "tipoProducto");
    private final static QName _BolsaTypeOfferId_QNAME = new QName("", "offerId");
    private final static QName _BolsaTypeDuracion_QNAME = new QName("", "duracion");
    private final static QName _BolsaTypeOrden_QNAME = new QName("", "orden");
    private final static QName _BolsaTypeDestacado_QNAME = new QName("", "destacado");
    private final static QName _BolsaTypeRecurrente_QNAME = new QName("", "recurrente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.clarochile.webservices.ofertabolsaswsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaBolsasResponse }
     * 
     */
    public ConsultaBolsasResponse createConsultaBolsasResponse() {
        return new ConsultaBolsasResponse();
    }

    /**
     * Create an instance of {@link Bolsa }
     * 
     */
    public Bolsa createBolsa() {
        return new Bolsa();
    }

    /**
     * Create an instance of {@link ConsultaBolsasRequest }
     * 
     */
    public ConsultaBolsasRequest createConsultaBolsasRequest() {
        return new ConsultaBolsasRequest();
    }

    /**
     * Create an instance of {@link PaginationTypeBolsas }
     * 
     */
    public PaginationTypeBolsas createPaginationTypeBolsas() {
        return new PaginationTypeBolsas();
    }

    /**
     * Create an instance of {@link BolsaType }
     * 
     */
    public BolsaType createBolsaType() {
        return new BolsaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "descripcion", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeDescripcion(String value) {
        return new JAXBElement<String>(_BolsaTypeDescripcion_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "estado", scope = BolsaType.class)
    public JAXBElement<Boolean> createBolsaTypeEstado(Boolean value) {
        return new JAXBElement<Boolean>(_BolsaTypeEstado_QNAME, Boolean.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "offerName", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeOfferName(String value) {
        return new JAXBElement<String>(_BolsaTypeOfferName_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fechaModificacion", scope = BolsaType.class)
    public JAXBElement<XMLGregorianCalendar> createBolsaTypeFechaModificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BolsaTypeFechaModificacion_QNAME, XMLGregorianCalendar.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "duracionUnidad", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeDuracionUnidad(String value) {
        return new JAXBElement<String>(_BolsaTypeDuracionUnidad_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fechaIngreso", scope = BolsaType.class)
    public JAXBElement<XMLGregorianCalendar> createBolsaTypeFechaIngreso(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BolsaTypeFechaIngreso_QNAME, XMLGregorianCalendar.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "precio", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypePrecio(String value) {
        return new JAXBElement<String>(_BolsaTypePrecio_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoProductoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tipoProducto", scope = BolsaType.class)
    public JAXBElement<TipoProductoType> createBolsaTypeTipoProducto(TipoProductoType value) {
        return new JAXBElement<TipoProductoType>(_BolsaTypeTipoProducto_QNAME, TipoProductoType.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "offerId", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeOfferId(String value) {
        return new JAXBElement<String>(_BolsaTypeOfferId_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "duracion", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeDuracion(String value) {
        return new JAXBElement<String>(_BolsaTypeDuracion_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orden", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeOrden(String value) {
        return new JAXBElement<String>(_BolsaTypeOrden_QNAME, String.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "destacado", scope = BolsaType.class)
    public JAXBElement<Boolean> createBolsaTypeDestacado(Boolean value) {
        return new JAXBElement<Boolean>(_BolsaTypeDestacado_QNAME, Boolean.class, BolsaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recurrente", scope = BolsaType.class)
    public JAXBElement<String> createBolsaTypeRecurrente(String value) {
        return new JAXBElement<String>(_BolsaTypeRecurrente_QNAME, String.class, BolsaType.class, value);
    }

}
