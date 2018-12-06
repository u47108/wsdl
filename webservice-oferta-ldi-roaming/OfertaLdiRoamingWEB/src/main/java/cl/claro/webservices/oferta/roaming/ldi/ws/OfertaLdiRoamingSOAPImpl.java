/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.claro.webservices.oferta.roaming.ldi.ws;

import cl.claro.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.claro.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import cl.claro.webservices.ofertaldiroaming.OfertaLdiRoamingEjbLocal;
import javax.jws.WebService;
import javax.ejb.EJB;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
/**
 *
 * @author luisnunez
 */
@WebService(
        serviceName = "ofertaBolsasWSDL", 
        portName = "ofertaBolsasWSDLSOAP", 
        endpointInterface = "cl.clarochile.webservices.ofertabolsaswsdl.OfertaBolsasWSDL", 
        targetNamespace = "http://www.clarochile.cl/webservices/ofertaBolsasWSDL/", 
        wsdlLocation = "WEB-INF/wsdl/ofertaBolsasWSDL.wsdl")
public class OfertaLdiRoamingSOAPImpl {
    
    @EJB
    private OfertaLdiRoamingEjbLocal listlocalejb;
    private static final Logger logger = LogManager.getLogger(OfertaLdiRoamingSOAPImpl.class);
    
    public ConsultaBolsasResponse consultaBolsas(ConsultaBolsasRequest parameters){
    ConsultaBolsasResponse rs=null;
    try{
        rs=listlocalejb.listBolsasLdiRoaming(parameters);
    }catch (Exception e) {
        logger.error("Error en invocar al webservices ConsultaBolsas");
            
    }
    return rs;
}  
}
