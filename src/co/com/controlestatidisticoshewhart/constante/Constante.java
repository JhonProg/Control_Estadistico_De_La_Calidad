/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.constante;

/**
 *
 * @author Jhon
 */
public class Constante {
    
    /** Mensajes de validación */
    public static final String DEBE_DIGITAR_SOLO_NUMEROS                   = "Debe digitar solo números.";
    public static final String VALIDANDO_CAMPOS                            = "Validando campos obligatorios.";
    public static final String FALTA_NUMERO_DE_DATOS_POR_COMPLETAR         = "Debe ingresar la cantidad de datos a generar.";
    public static final String FALTA_MEDIA_POR_COMPLETAR                   = "Debe ingresar la media.";
    public static final String FALTA_DESVIACION_ESTANDAR_POR_COMPLETAR     = "Debe ingresar la desviación estandar.";
    public static final String FALTA_LIMITE_CONTROL_INFERIOR_POR_COMPLETAR = "Debe ingresar el limite de control inferior.";
    public static final String FALTA_LIMITE_CONTROL_SUPERIOR_POR_COMPLETAR = "Debe ingresar el limite de control superior.";
    public static final String CALCULO_ARL_NO_EJECUTADO_DATOS_NULOS        = "Calculo de ARL no ejecutado. la lista de datos es nula.";
    public static final String CALCULO_ARL_NO_EJECUTADO_SIN_DATOS          = "Calculo de ARL no ejecutado. la lista de datos esta vacia.";
    public static final String CALCULO_ARL_EJECUTADO_CON_EXITO             = "Calculo de ARL ejecutado con exito.";
 
 
    /** Parámetros */
    public static final String NUMERO_DE_DATOS_GENERAR = "numeroDatosGenerar";
    public static final String MEDIA                   = "media";
    public static final String DESVIACION_ESTANDAR     = "desviacionEstandar";
    public static final String LIMITE_CONTROL_INFERIOR = "limiteControlInferior";
    public static final String LIMITE_CONTROL_SUPERIOR = "limiteControlSuperior";
    
    /** Datos de resultados en generacion de numeros aleatorios */
    public static final String GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EJECUTADO       = "generacionDatosConDistribucionNormalEjecutado";
    public static final String MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL         = "mensajeGeneracionDatosConDistribucionNormal";
    public static final String MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EXITOSO = "mensajeGeneracionDatosConDistribucionNormalExitoso";
    
    /** Datos de resultados en calculo de ARL*/
    public static final String LISTA_DATOS_GENERADOS   = "listaDatosGenerados";
    public static final String CALCULO_ARL_EJECUTADO   = "calculoArlEejcutado";
    public static final String MEDIA_DATOS_EXTREMOS    = "mediaDatosExtremos";
    public static final String CANTIDAD_DATOS_EXTREMOS = "cantidadDatosExtremos";
    public static final String AVERAGE_RUN_LENGTH      = "arl";
    public static final String MENSAJE_CALCULO_ARL     = "mensajeCalculoArl";
    
    /** Tiempo de ejecucion de operaciones */
    public static final String TIEMPO_DE_EJECUCION = "tiempoDeEjecucion";
    
    /** Progreso */
    public static final String GENERANDO_NUMEROS_ALEATORIOS      = "Generando números aleatorios...";
    public static final String REALIZANDO_CALCULOS_DE_RESULTADOS = "Realizando calculos de resultados...";
    public static final String TERMINADO = "TERMINADO";
    
    
    
}
