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
    public static final String LIMITE_INFERIOR_MAYOR_A_LIMITE_INFERIOR     = "El limite inferior no puede ser mayor al limite superior.";
    public static final String ERROR_AL_CONVERTIR_LOS_LIMITES              = "Error al validar los limites.";
    
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
    
    /** Extension archivos.
     */
    public static final String XLS   = ".xls";
    public static final String XLSX  = ".xlsx";
    public static final String TXT   = ".txt";
    public static final String PDF   = ".pdf";
    
    /**
     * Datos de encabezado de archivo excel Hoja Uno.
     */
    public static final String TITULO_HOJA_DATOS      = "DATOS";
    public static final String INDICE                 = "INDICE";
    public static final String DATO_ALEATORIO         = "DATO ALEATORIO";
    public static final String SUPERA_LIMITE_INFERIOR = "¿SUPERA LIMITE INFERIROR?";
    public static final String SUPERA_LIMITE_SUPERIOR = "¿SUPERA LIMITE SUPERIOR?";
    
    /**
     * Datos de encabezado de archivo excel Hoja Dos.
     */
    public static final String TITULO_HOJA_RESULTADOS     = "RESULTADOS";
    public static final String COLUMNA_LIMITE_INFERIOR    = "LIMITE INFERIOR";
    public static final String COLUMNA_LIMITE_SUPERIOR    = "LIMITE SUPERIOR";
    public static final String COLUMNA_MEDIA              = "MEDIA";
    public static final String COLUMNA_DATOS_FUERA_LIMITE = "# DATOS FUERA DE LIMITE";
    public static final String COLUMNA_ARL                = "LONGITUD PROMEDIO CORRIDA (ARL)";
        
    /**
     * Mensajes de generacion de archivos.
     */
    public static final String GENERANDO_ARCHIVO_EXCEL_CON_RESULTADOS_ESPERE = "Generando reporte excel con resultados. Por favor espere.";
    public static final String ARCHIVO_EXCEL_CON_RESULTADOS_GENERADO = "Reporte excel con resultados generado con exito.";
    
}
