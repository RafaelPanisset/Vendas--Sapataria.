package controler;

import model.ModelDetalhes;
import dao.DAODetalhes;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class ControllerDetalhes {

    private DAODetalhes daoDetalhes = new DAODetalhes();

    /**
    * grava Detalhes
    * @param pModelDetalhes
    * return int
    */
    public int salvarDetalhesController(ModelDetalhes pModelDetalhes){
        return this.daoDetalhes.salvarDetalhesDAO(pModelDetalhes);
    }

    /**
    * recupera Detalhes
    * @param pPkIdDetalhe
    * return ModelDetalhes
    */
    public ModelDetalhes getDetalhesController(int pPkIdDetalhe){
        return this.daoDetalhes.getDetalhesDAO(pPkIdDetalhe);
    }

    /**
    * recupera uma lista deDetalhes
    * @param pPkIdDetalhe
    * return ArrayList
    */
    public ArrayList<ModelDetalhes> getListaDetalhesController(){
        return this.daoDetalhes.getListaDetalhesDAO();
    }

    /**
    * atualiza Detalhes
    * @param pModelDetalhes
    * return boolean
    */
    public boolean atualizarDetalhesController(ModelDetalhes pModelDetalhes){
        return this.daoDetalhes.atualizarDetalhesDAO(pModelDetalhes);
    }

    /**
    * exclui Detalhes
    * @param pPkIdDetalhe
    * return boolean
    */
    public boolean excluirDetalhesController(int pPkIdDetalhe){
        return this.daoDetalhes.excluirDetalhesDAO(pPkIdDetalhe);
    }
}