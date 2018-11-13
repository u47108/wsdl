/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.mapping;

/**
 *
 * @author luisnunez
 */
public enum TipoProductoType {
     HFC,
    DTH,
    SIAP,
    ONE,
    VTV;

    public String value() {
        return name();
    }

    public static TipoProductoType fromValue(String v) {
        return valueOf(v);
    }
}
