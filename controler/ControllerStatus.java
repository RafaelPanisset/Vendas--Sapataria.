package controler;

import model.ModelStatus;
import dao.DAOStatus;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerStatus {

    private DAOStatus daoStatus = new DAOStatus();

    /**
    * grava Status
    * @param pModelStatus
    * return int
    */
    public int salvarStatusController(ModelStatus pModelStatus){
        return this.daoStatus.salvarStatusDAO(pModelStatus);
    }

    /**
    * recupera Status
    * @param pIdStatus
    * return ModelStatus
    */
    public ModelStatus getStatusController(int pIdStatus){
        return this.daoStatus.getStatusDAO(pIdStatus);
    }

    /**
    * recupera uma lista deStatus
    * @param pIdStatus
    * return ArrayList
    */
    public ArrayList<ModelStatus> getListaStatusController(){
        return this.daoStatus.getListaStatusDAO();
    }

    /**
    * atualiza Status
    * @param pModelStatus
    * return boolean
    */
    public boolean atualizarStatusController(ModelStatus pModelStatus){
        return this.daoStatus.atualizarStatusDAO(pModelStatus);
    }

    /**
    * exclui Status
    * @param pIdStatus
    * return boolean
    */
    public boolean excluirStatusController(int pIdStatus){
        return this.daoStatus.excluirStatusDAO(pIdStatus);
    }
}