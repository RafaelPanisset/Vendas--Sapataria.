package controler;

import model.ModelFormaDePagamento;
import DAO.DAOFormaDePagameno;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerFormaDePagamento {

    private DAOFormaDePagameno daoFormaDePagameno = new DAOFormaDePagameno();

    /**
    * grava FormaDePagameno
    * @param pModelFormaDePagameno
    * return int
    */
    public int salvarFormaDePagamenoController(ModelFormaDePagamento pModelFormaDePagameno){
        return this.daoFormaDePagameno.salvarFormaDePagamenoDAO(pModelFormaDePagameno);
    }

    /**
    * recupera FormaDePagameno
    * @param pIdFormaDePagamento
    * return ModelFormaDePagameno
    */
    public ModelFormaDePagamento getFormaDePagamenoController(int pIdFormaDePagamento){
        return this.daoFormaDePagameno.getFormaDePagamenoDAO(pIdFormaDePagamento);
    }

    /**
    * recupera uma lista deFormaDePagameno
    * @param pIdFormaDePagamento
    * return ArrayList
    */
    public ArrayList<ModelFormaDePagamento> getListaFormaDePagamenoController(){
        return this.daoFormaDePagameno.getListaFormaDePagamenoDAO();
    }

    /**
    * atualiza FormaDePagameno
    * @param pModelFormaDePagameno
    * return boolean
    */
    public boolean atualizarFormaDePagamenoController(ModelFormaDePagamento pModelFormaDePagameno){
        return this.daoFormaDePagameno.atualizarFormaDePagamenoDAO(pModelFormaDePagameno);
    }

    /**
    * exclui FormaDePagameno
    * @param pIdFormaDePagamento
    * return boolean
    */
    public boolean excluirFormaDePagamenoController(int pIdFormaDePagamento){
        return this.daoFormaDePagameno.excluirFormaDePagamenoDAO(pIdFormaDePagamento);
    }
}