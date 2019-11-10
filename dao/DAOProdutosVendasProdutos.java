/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProduto;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author Cliente
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutoDAO(int pcodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProdutos = new ModelProduto();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tbl_produto.pk_id_produto, "
                    + "tbl_produto.pro_estoque, "
                    + "tbl_produto.pro_nome, "
                    + "tbl_produto.pro_valor, "
                    
                    + "tbl_vendas_produtos.fk_produto, "
                    + "tbl_vendas_produtos.fk_vendas, "
                    + "tbl_vendas_produtos.pk_id_vendas_produtos, "
                    + "tbl_vendas_produtos.ven_pro_quantidade, "
                    + "tbl_vendas_produtos.ven_pro_valor "
                    + "FROM tbl_vendas_produtos "
                    + "INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = tbl_vendas_produtos.fk_produto "
                    + " WHERE tbl_vendas_produtos.fk_vendas = '" + pcodigoVenda + "';");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProduto();
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                //
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProEstoque(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));

                // 
                modelVendasProdutos.setProdutos(this.getResultSet().getInt(5));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(6));
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(7));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(8));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(9));
                //
                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
                
                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos; 
    }

}
