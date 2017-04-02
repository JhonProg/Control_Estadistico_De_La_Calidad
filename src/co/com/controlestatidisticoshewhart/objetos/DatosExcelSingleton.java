/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jhon
 */
public class DatosExcelSingleton {

    private static DatosExcelSingleton instance = null;
    private List<Dato> listaDatosExcel          = new ArrayList<>();
    private Map resultadosDeCalculo             = new HashMap();

    protected DatosExcelSingleton() {}

    public static DatosExcelSingleton getInstance() {
        if (instance == null) {
            instance        = new DatosExcelSingleton();
        }
        return instance;
    }

    public List<Dato> getListaDatosExcel() {
        return listaDatosExcel;
    }

    public void setListaDatosExcel(List<Dato> listaDatosExcel) {
        this.listaDatosExcel = listaDatosExcel;
    }

    public Map getResultadosDeCalculo() {
        return resultadosDeCalculo;
    }

    public void setResultadosDeCalculo(Map resultadosDeCalculo) {
        this.resultadosDeCalculo = resultadosDeCalculo;
    }
    
}
