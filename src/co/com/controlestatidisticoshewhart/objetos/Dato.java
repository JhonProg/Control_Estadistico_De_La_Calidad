/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.objetos;

import java.io.Serializable;

/**
 *
 * @author Jhon
 */
public class Dato implements Serializable{
    
    /** Numero o indice en el que fué generado */
    private int secuencial;
    /** dato generado o recibido como parametro */
    private double numero;
    /** indicador binario que indica si el numero sobre pasa el limite INFERIOR */
    private boolean sobrePasaLimiteInferior;
    /** indicador binario que indica si el numero sobre pasa el limite SUPERIRO */
    private boolean sobrePasaLimiteSuperior;

    // Modificadores de acceso
    
    public int getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(int secuencial) {
        this.secuencial = secuencial;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public boolean isSobrePasaLimiteInferior() {
        return sobrePasaLimiteInferior;
    }

    public void setSobrePasaLimiteInferior(boolean sobrePasaLimiteInferior) {
        this.sobrePasaLimiteInferior = sobrePasaLimiteInferior;
    }

    public boolean isSobrePasaLimiteSuperior() {
        return sobrePasaLimiteSuperior;
    }

    public void setSobrePasaLimiteSuperior(boolean sobrePasaLimiteSuperior) {
        this.sobrePasaLimiteSuperior = sobrePasaLimiteSuperior;
    }
    
}
