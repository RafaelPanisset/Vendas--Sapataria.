/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cliente
 */
public class ModelClienteReceber {
    
    private Modelcliente modelCliente;
    private ModelContarReceber modelreceber;

    /**
     * @return the modelCliente
     */
    public Modelcliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(Modelcliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the modelreceber
     */
    public ModelContarReceber getModelreceber() {
        return modelreceber;
    }

    /**
     * @param modelreceber the modelreceber to set
     */
    public void setModelreceber(ModelContarReceber modelreceber) {
        this.modelreceber = modelreceber;
    }
    
}
