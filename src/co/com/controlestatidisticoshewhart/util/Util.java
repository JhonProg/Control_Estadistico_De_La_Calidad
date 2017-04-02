/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.util;

/**
 *
 * @author Jhon
 */
public class Util {
    
    public static boolean esNuloOVacio(String dato){
        if(dato==null){
            return true;
        }else if(dato.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
}
