/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import dao.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;
/**
 *
 * @author Rafael
 */
public class ControllerProdutosVendasProdutos {
    private DAOProdutosVendasProdutos DAOProdutosVendasProduto = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutoDAO(int pCodigoVendas){
        return this.DAOProdutosVendasProduto.getListaProdutosVendasProdutoDAO(pCodigoVendas);
    }
    
}
