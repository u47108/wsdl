
package cl.clarochile.webservices.ofertabolsaswsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoBolsaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBolsaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LDI"/>
 *     &lt;enumeration value="ROAMING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoBolsaType")
@XmlEnum
public enum TipoBolsaType {

    LDI,
    ROAMING;

    public String value() {
        return name();
    }

    public static TipoBolsaType fromValue(String v) {
        return valueOf(v);
    }

}
