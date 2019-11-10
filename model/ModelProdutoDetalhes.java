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
public class ModelProdutoDetalhes {
    
    private ModelProduto modelProduto;
    private ModelDetalhes modelDetalhes;

    /**
     * @return the modelProduto
     */
    public ModelProduto getModelProduto() {
        return modelProduto;
    }

    /**
     * @param modelProduto the modelProduto to set
     */
    public void setModelProduto(ModelProduto modelProduto) {
        this.modelProduto = modelProduto;
    }

    /**
     * @return the modelDetalhes
     */
    public ModelDetalhes getModelDetalhes() {
        return modelDetalhes;
    }

    /**
     * @param modelDetalhes the modelDetalhes to set
     */
    public void setModelDetalhes(ModelDetalhes modelDetalhes) {
        this.modelDetalhes = modelDetalhes;
    }
    
}
