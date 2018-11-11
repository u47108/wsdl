/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertabolsaswsdl.ws;

import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.ejb.EJB;
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
    
    public ConsultaBolsasResponse listBolsas(ConsultaBolsasRequest parameters){
    ConsultaBolsasResponse rs=null;
    try{
        rs=listlocalejb.listBolsasLdiRoaming(parameters);
    }catch (Exception e) {
           
            
    }
    return rs;
}  
}
