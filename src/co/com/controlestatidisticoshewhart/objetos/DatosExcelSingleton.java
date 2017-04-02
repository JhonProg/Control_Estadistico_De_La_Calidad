/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class DatosExcelSingleton {

    private static DatosExcelSingleton instance = null;
    private List<Dato> listaDatosExcel          = new ArrayList<>();

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
}
