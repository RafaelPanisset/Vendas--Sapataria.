/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.DAOProdutosDetalhes;
import java.util.ArrayList;
import model.ProdutosDetalhes;

/**
 *
 * @author Cliente
 */
public class ControllerProdutosDetalhes {

    private DAOProdutosDetalhes DAOProdutosVendasProduto = new DAOProdutosDetalhes();

    public ArrayList<ProdutosDetalhes> getListaProdutosVendasProdutoDAO( int co) {
        return this.DAOProdutosVendasProduto.getListaProdutosDetalhesDAO(co);
    }

}
