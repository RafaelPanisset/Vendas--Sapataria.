package controler;

import model.Modelvendas;
import dao.DAOvendas;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class Controllervendas {

    private DAOvendas daovendas = new DAOvendas();

    /**
    * grava vendas
    * @param pModelvendas
    * return int
    */
    public int salvarvendasController(Modelvendas pModelvendas){
        return this.daovendas.salvarvendasDAO(pModelvendas);
    }

    /**
    * recupera vendas
    * @param pIdVendas
    * return Modelvendas
    */
    public Modelvendas getvendasController(int  pIdVendas){
        return this.daovendas.getvendasDAO(pIdVendas);
    }

    /**
    * recupera uma lista devendas
    * @param pIdVendas
    * return ArrayList
    */
    public ArrayList<Modelvendas> getListavendasController(){
        return this.daovendas.getListavendasDAO();
    }

    /**
    * atualiza vendas
    * @param pModelvendas
    * return boolean
    */
    public boolean atualizarvendasController(Modelvendas pModelvendas){
        return this.daovendas.atualizarvendasDAO(pModelvendas);
    }

    /**
    * exclui vendas
    * @param pIdVendas
    * return boolean
    */
    public boolean excluirvendasController(int  pIdVendas){
        return this.daovendas.excluirvendasDAO(pIdVendas);
    }
}