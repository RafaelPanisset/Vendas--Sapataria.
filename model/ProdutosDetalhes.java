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
public class ProdutosDetalhes {
     private ModelProduto modelProdutos;
     private ModelDetalhes modelDetalhes;

    /**
     * @return the modelProdutos
     */
    public ModelProduto getModelProdutos() {
        return modelProdutos;
    }

    /**
     * @param modelProdutos the modelProdutos to set
     */
    public void setModelProdutos(ModelProduto modelProdutos) {
        this.modelProdutos = modelProdutos;
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
