package controler;

import model.ModelContarReceber;
import dao.DAOReceber;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerContarReceber {

    private DAOReceber daoReceber = new DAOReceber();

    /**
    * grava Receber
    * @param pModelReceber
    * return int
    */
    public int salvarReceberController(ModelContarReceber pModelReceber){
        return this.daoReceber.salvarReceberDAO(pModelReceber);
    }

    /**
    * recupera Receber
    * @param pIdReceber
    * return ModelReceber
    */
    public ModelContarReceber getReceberController(int  pIdReceber){
        return this.daoReceber.getReceberDAO(pIdReceber);
    }

    /**
    * recupera uma lista deReceber
    * @param pIdReceber
    * return ArrayList
    */
    public ArrayList<ModelContarReceber> getListaReceberController(){
        return this.daoReceber.getListaReceberDAO();
    }

    /**
    * atualiza Receber
    * @param pModelReceber
    * return boolean
    */
    public boolean atualizarReceberController(ModelContarReceber pModelReceber){
        return this.daoReceber.atualizarReceberDAO(pModelReceber);
    }

    /**
    * exclui Receber
    * @param pIdReceber
    * return boolean
    */
    public boolean excluirReceberController(int  pIdReceber){
        return this.daoReceber.excluirReceberDAO(pIdReceber);
    }
}