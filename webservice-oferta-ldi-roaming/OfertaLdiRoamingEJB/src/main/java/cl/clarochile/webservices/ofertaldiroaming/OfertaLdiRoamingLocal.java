/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming;

import cl.clarochile.webservices.ofertabolsaswsdl.Bolsa;
import cl.clarochile.webservices.ofertabolsaswsdl.BolsaType;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import cl.clarochile.webservices.ofertabolsaswsdl.PaginationTypeBolsas;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author luisnunez
 */
@Stateless
public class OfertaLdiRoamingLocal implements OfertaLdiRoamingEjbLocal {

    @Override
    public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest rq) {
        ConsultaBolsasResponse bolsa = llenarDatosDummy();

        return bolsa;
    }

    ConsultaBolsasResponse llenarDatosDummy() {
        ConsultaBolsasResponse bolsa = new ConsultaBolsasResponse();
        Bolsa bl = new Bolsa();
        BolsaType bt = new BolsaType();
        bt.setDescripcion("BOLSA LDI 1");
        bt.setDestacado(false);
        bt.setDuracion("100");
        bt.setDuracionUnidad("minutos");
        bt.setEstado(true);
        GregorianCalendar gcal = new GregorianCalendar();

        XMLGregorianCalendar fechaactial = null;
        try {
            fechaactial = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e) {

        }
        bt.setFechaIngreso(fechaactial);
        bt.setFechaModificacion(fechaactial);
        bt.setOfferId("1700");
        bt.setOfferName("Bolsa Larga Distancia internacional 100 Min");
        bt.setPrecio("3000");
        bt.setTipoBolsa("LDI");
        bt.setTipoProducto("ONE");
        bl.getBolsa().add(bt);
        BolsaType br = new BolsaType();
        br.setDescripcion("BOLSA LDI 1");
        br.setDestacado(false);
        br.setDuracion("100");
        br.setDuracionUnidad("minutos");
        br.setEstado(true);
        GregorianCalendar gcalr = new GregorianCalendar();

        XMLGregorianCalendar fechaactialr = null;
        try {
            fechaactialr = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalr);
        } catch (DatatypeConfigurationException e) {

        }
        bt.setFechaIngreso(fechaactialr);
        bt.setFechaModificacion(fechaactialr);
        bt.setOfferId("1701");
        bt.setOfferName("Bolsa Roaming 200 Min");
        bt.setPrecio("6000");
        bt.setTipoBolsa("ROAMING");
        bt.setTipoProducto("ONE");
        bl.getBolsa().add(bt);
        PaginationTypeBolsas pagina = new PaginationTypeBolsas();
        pagina.setLimitpage("1");
        pagina.setPagenumber("1");
        pagina.setTotalrow("2");
        bolsa.setPagination(pagina);
        bolsa.setBolsaType(bl);
        bolsa.setCode("200");
        bolsa.setDescription("bolsa(s) encontrada(s)");
        return bolsa;
    }

}
