package controler;

import model.ModelFornecedor;
import dao.DAOFornecedor;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
     * grava Fornecedor
     *
     * @param pModelFornecedor return int
     */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor) {
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
     * recupera Fornecedor
     *
     * @param pIdForncedor return ModelFornecedor
     */
    public ModelFornecedor getFornecedorController(int pIdForncedor) {
        return this.daoFornecedor.getFornecedorDAO(pIdForncedor);
    }
    
     public ModelFornecedor getFornecedorController(String pIdForncedor) {
        return this.daoFornecedor.getFornecedorNomeController(pIdForncedor);
    }

    /**
     * recupera uma lista deFornecedor
     *
     * @param pIdForncedor return ArrayList
     */
    public ArrayList<ModelFornecedor> getListaFornecedorController() {
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
     * atualiza Fornecedor
     *
     * @param pModelFornecedor return boolean
     */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor) {
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
     * exclui Fornecedor
     *
     * @param pIdForncedor return boolean
     */
    public boolean excluirFornecedorController(int pIdForncedor) {
        return this.daoFornecedor.excluirFornecedorDAO(pIdForncedor);
    }

  

  
}
