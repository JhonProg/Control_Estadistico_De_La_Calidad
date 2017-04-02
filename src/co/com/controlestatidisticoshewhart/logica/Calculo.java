/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.logica;

import co.com.controlestatidisticoshewhart.constante.Constante;
import co.com.controlestatidisticoshewhart.objetos.Dato;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Jhon
 */
public class Calculo {
    
    public static Map generarDatosAleatoriosConDistribucionNormal(final Map parametros){
        long inicio                   = System.currentTimeMillis();
        Map<String,Object> resultados = new HashMap();
        
        try{
            List<Dato> listaDeDatos       = new ArrayList<>();

            final Integer cantidadDatosGenerar = Integer.parseInt(parametros.get(Constante.NUMERO_DE_DATOS_GENERAR).toString());
            final Integer media                = Integer.parseInt(parametros.get(Constante.MEDIA).toString());
            final Integer desviacionEstandar   = Integer.parseInt(parametros.get(Constante.DESVIACION_ESTANDAR).toString());
            final Integer limiteInferior       = Integer.parseInt(parametros.get(Constante.LIMITE_CONTROL_INFERIOR).toString());
            final Integer limiteSuperior       = Integer.parseInt(parametros.get(Constante.LIMITE_CONTROL_SUPERIOR).toString());

            Random aleatorio = null;
            Dato dato        = null;
            DecimalFormat df = new DecimalFormat("#.00");
            
            for(int indice=1;indice<=cantidadDatosGenerar;indice++){
                aleatorio = new Random();
                dato      = new Dato();

                double numeroAleatorio = aleatorio.nextGaussian()*desviacionEstandar+media;
                //double numeroAleatorio = (double)Math.round(aleatorio.nextGaussian()*desviacionEstandar+media* 100d) / 100d;
                System.out.println(indice+" : "+numeroAleatorio);
                dato.setNumero(numeroAleatorio);
                dato.setSecuencial(indice);
                //dato.setSobrePasaLimiteInferior(false);
                //dato.setSobrePasaLimiteSuperior(false);
                
                if(numeroAleatorio<limiteInferior){
                    dato.setSobrePasaLimiteInferior(true);
                }

                if(numeroAleatorio>limiteSuperior){
                    dato.setSobrePasaLimiteSuperior(true);
                }

                listaDeDatos.add(dato);
            }

            long fin = System.currentTimeMillis();

            resultados.put(Constante.LISTA_DATOS_GENERADOS, listaDeDatos);
            resultados.put(Constante.TIEMPO_DE_EJECUCION, fin-inicio);
            resultados.put(Constante.GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EJECUTADO,true);
            resultados.put(Constante.MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL,Constante.MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EXITOSO);
            
        }catch(Exception e){
            resultados.put(Constante.GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EJECUTADO,false);
            resultados.put(Constante.MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL,"Se ha lanzado una excepcion no controlado por el sistema.");
        }
        
        return resultados;
    }
    
    public static Map calcularLongitudPromedioDeCorrida(List<Dato> datos){
        long inicio                   = System.currentTimeMillis();
        Map<String,Object> resultados = new HashMap();
        
        if(datos==null){
            resultados.put(Constante.CALCULO_ARL_EJECUTADO, false);
            resultados.put(Constante.MENSAJE_CALCULO_ARL, Constante.CALCULO_ARL_NO_EJECUTADO_DATOS_NULOS);
        }else{
            final int cantidadDatos   = datos.size();
            int conteo                = 0;
            int cantidadDatosExtremos = 0;
            
            double media = 0;
            double arl   = 0;
                
            if(cantidadDatos==0){
                resultados.put(Constante.CALCULO_ARL_EJECUTADO, false);
                resultados.put(Constante.MENSAJE_CALCULO_ARL, Constante.CALCULO_ARL_NO_EJECUTADO_DATOS_NULOS);
            }else{
                 for(Dato dato:datos){
                    if(dato.isSobrePasaLimiteInferior() || dato.isSobrePasaLimiteSuperior()){
                       
                        //conteo = conteo+dato.getSecuencial();
                        cantidadDatosExtremos++;
                        
                        media = media + (conteo/cantidadDatosExtremos);
                       
                        /* 
                        arl   = media/cantidadDatos;
                        */
                        conteo = dato.getSecuencial()-conteo;
                        media  = media + conteo / cantidadDatosExtremos;
                        arl    = media / cantidadDatosExtremos;
                    }
                }
                
                
                System.out.println("media: "+media);
                System.out.println("arl: "+arl);
                System.out.println("cantidadDatosExtremos: "+cantidadDatosExtremos);
                
                resultados.put(Constante.CALCULO_ARL_EJECUTADO, true);
                resultados.put(Constante.MEDIA_DATOS_EXTREMOS, media);
                resultados.put(Constante.CANTIDAD_DATOS_EXTREMOS, cantidadDatosExtremos);
                resultados.put(Constante.AVERAGE_RUN_LENGTH, arl);
                resultados.put(Constante.MENSAJE_CALCULO_ARL, Constante.CALCULO_ARL_EJECUTADO_CON_EXITO);
                
            }
        }
        
        long fin = System.currentTimeMillis();
        
        resultados.put(Constante.TIEMPO_DE_EJECUCION, fin-inicio);
        return resultados;
    }
    
}
