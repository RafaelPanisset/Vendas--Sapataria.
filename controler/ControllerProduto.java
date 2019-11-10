package controler;

import model.ModelProduto;
import dao.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pIdProduto
    * return ModelProduto
    */
    public ModelProduto getProdutoController(int  pIdProduto){
        return this.daoProduto.getProdutoDAO(pIdProduto);
    }

    /**
    * recupera uma lista deProduto
    * @param pIdProduto
    * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * return boolean
    */
    public boolean excluirProdutoController(int  pIdProduto){
        return this.daoProduto.excluirProdutoDAO(pIdProduto);
    }
 
    public boolean atualizarEstoqueDeProdutoController(ArrayList<ModelProduto> listaModelProduto) {
        return this.daoProduto.atualizarEstoqueDeProdutoController(listaModelProduto);
    }

    public ModelProduto getProdutoNomeController(String pNome) {
        return this.daoProduto.getProdutoNomeDAO(pNome);
    }
}