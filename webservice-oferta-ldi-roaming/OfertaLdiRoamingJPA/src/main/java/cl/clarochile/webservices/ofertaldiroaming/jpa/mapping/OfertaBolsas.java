/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.mapping;

import cl.clarochile.webservices.ofertabolsaswsdl.TipoBolsaType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author luisnunez
 */
public class OfertaBolsas implements Serializable{

    private static final long serialVersionUID = -8365668201785751849L;
    private long id;
    private String offerId;
    private String offerName;
    private String recurrente;
    private String duracion;
    private String duracionUnidad;
    private Double precio;
    private String descripcion;
    private boolean  estado;
    private String orden;
    private boolean destacado;
    private Date fechaIngreso;
    private Date fechaModificacion;
    private TipoProductoType tipoProducto;
    private TipoBolsaType tipoBolsa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getRecurrente() {
        return recurrente;
    }

    public void setRecurrente(String recurrente) {
        this.recurrente = recurrente;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracionUnidad() {
        return duracionUnidad;
    }

    public void setDuracionUnidad(String duracionUnidad) {
        this.duracionUnidad = duracionUnidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public TipoProductoType getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProductoType tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public TipoBolsaType getTipoBolsa() {
        return tipoBolsa;
    }

    public void setTipoBolsa(TipoBolsaType tipoBolsa) {
        this.tipoBolsa = tipoBolsa;
    }
    
    
}
