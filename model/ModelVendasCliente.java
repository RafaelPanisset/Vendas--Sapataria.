/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ModelVendasCliente {
    private Modelcliente modecliente;
    private Modelvendas modelvendas;
    private ArrayList<ModelVendasCliente> listaModelVendasCliente;

    /**
     * @return the modecliente
     */
    public Modelcliente getModecliente() {
        return modecliente;
    }

    /**
     * @param modecliente the modecliente to set
     */
    public void setModecliente(Modelcliente modecliente) {
        this.modecliente = modecliente;
    }

    /**
     * @return the modelvendas
     */
    public Modelvendas getModelvendas() {
        return modelvendas;
    }

    /**
     * @param modelvendas the modelvendas to set
     */
    public void setModelvendas(Modelvendas modelvendas) {
        this.modelvendas = modelvendas;
    }

    /**
     * @return the listaModelVendasCliente
     */
    public ArrayList<ModelVendasCliente> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    /**
     * @param listaModelVendasCliente the listaModelVendasCliente to set
     */
    public void setListaModelVendasCliente(ArrayList<ModelVendasCliente> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
    
}
