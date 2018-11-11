/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.mapping;

import java.io.Serializable;

/**
 *
 * @author luisnunez
 */

 public class Properties implements Serializable {

    private static final long serialVersionUID = -4064180646585235958L;

    private String nombreAplicacion;

    private String nombreModulo;

    private String llave;

    private String valor;

    private String valorXml;
   
    private String descripcion;

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValorXml() {
        return valorXml;
    }

    public void setValorXml(String valorXml) {
        this.valorXml = valorXml;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}