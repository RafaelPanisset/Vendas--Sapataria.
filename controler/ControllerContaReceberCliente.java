/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.DAOcontaReceberCliente;
import java.util.ArrayList;
import model.ModelClienteReceber;

/**
 *
 * @author Cliente
 */
public class ControllerContaReceberCliente {

    private DAOcontaReceberCliente DAOcontaReceberCliente = new DAOcontaReceberCliente();

    public ArrayList<ModelClienteReceber> getListaProdutosVendasProdutoDAO() {
        return this.DAOcontaReceberCliente.getClienteReceberConta();
    }

}
