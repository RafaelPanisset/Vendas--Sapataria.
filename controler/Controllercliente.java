package controler;

import model.Modelcliente;
import dao.DAOcliente;
import java.util.ArrayList;

/**
*
* @author Rafael
*/
public class Controllercliente {

    private DAOcliente daocliente = new DAOcliente();

    /**
    * grava cliente
    * @param pModelcliente
    * return int
    */
    public int salvarclienteController(Modelcliente pModelcliente){
        return this.daocliente.salvarclienteDAO(pModelcliente);
    }

    /**
    * recupera cliente
    * @param pIdCliente
    * return Modelcliente
    */
    public Modelcliente getclienteController(int  pIdCliente){
        return this.daocliente.getclienteDAO(pIdCliente);
    }
    
    public Modelcliente getclienteController(String  pNomeCliente){
        return this.daocliente.getclientePeloNomeDAO(pNomeCliente);
    }

    /**
    * recupera uma lista decliente
    * @param pIdCliente
    * return ArrayList
    */
    public ArrayList<Modelcliente> getListaclienteController(){
        return this.daocliente.getListaclienteDAO();
    }

    /**
    * atualiza cliente
    * @param pModelcliente
    * return boolean
    */
    public boolean atualizarclienteController(Modelcliente pModelcliente){
        return this.daocliente.atualizarclienteDAO(pModelcliente);
    }

    /**
    * exclui cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirclienteController(int  pIdCliente){
        return this.daocliente.excluirclienteDAO(pIdCliente);
    }
}