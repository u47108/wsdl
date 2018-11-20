/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming;

import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import cl.clarochile.webservices.ofertaldiroaming.jpa.OfertaLdiRoaBusiness;
import javax.ejb.Stateless;

/**
 *
 * @author luisnunez
 */
@Stateless
public class OfertaLdiRoamingLocal implements OfertaLdiRoamingEjbLocal {

    @Override
    public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest rq) {
        OfertaLdiRoaBusiness negocioOfertaBolsas = new OfertaLdiRoaBusiness();
        return negocioOfertaBolsas.listBolsasLdiRoaming(rq);
    }

}
