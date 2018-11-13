/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming;

import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import javax.ejb.Local;

/**
 *
 * @author luisnunez
 */
@Local
public interface OfertaLdiRoamingEjbLocal {
   public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest rq);
}
