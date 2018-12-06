/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.claro.webservices.ofertaldiroaming.jpa.util;

/**
 *
 * @author luisnunez
 */
public class ConstantLdiRoa {

    public static String HTTP_OK = "200";
    public static String HTTP_OK_MESG="bolsa(s) encontrada(s)";
    public static String HTTP_NOT_FOUND = "404";
    public static String NOT_FOUND = "bolsa(s) no encontrada(s)";
    public static String HTTP_ERROR_INTERNO="505";
    public static String HTTP_ERROR_INTERNO_MSG="Error interno de servicio";
    public static String HTTP_TIMEOUT="504";
    public static String HTTP_TIMEOUT_MSG="Error de timeout";
    public static String HTTP_PARAM="400";
    public static String HTTP_PARAM_MGS="Error de parámetros de entrada";  
   private  ConstantLdiRoa(){}
}
