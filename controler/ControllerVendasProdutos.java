package controler;

import model.ModelVendasProdutos;
import dao.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProdutos
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int  pIdVendaProdutos){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProdutos);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProdutos
    * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * salva VendasProdutos
    * @param pIdVendaProdutos
    * return boolean
    */
    public boolean excluirVendasProdutosController(int  pIdVendaProdutos){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProdutos);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> listaModelVendasProduto) {
        return this.daoVendasProdutos.salvarListaProduto(listaModelVendasProduto);
    }
}