
package cl.claro.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlRegistry;


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
     * Create an instance of {@link PaginationTypeBolsas }
     * 
     */
    public PaginationTypeBolsas createPaginationTypeBolsas() {
        return new PaginationTypeBolsas();
    }

    /**
     * Create an instance of {@link ConsultaBolsasRequest }
     * 
     */
    public ConsultaBolsasRequest createConsultaBolsasRequest() {
        return new ConsultaBolsasRequest();
    }

    /**
     * Create an instance of {@link BolsaType }
     * 
     */
    public BolsaType createBolsaType() {
        return new BolsaType();
    }

}
