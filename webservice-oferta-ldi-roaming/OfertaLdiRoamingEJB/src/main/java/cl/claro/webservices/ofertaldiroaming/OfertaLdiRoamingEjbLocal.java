/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.claro.webservices.ofertaldiroaming;

import cl.claro.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.claro.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import javax.ejb.Local;

/**
 *
 * @author luisnunez
 */
@Local
public interface OfertaLdiRoamingEjbLocal {
   public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest rq);
}
