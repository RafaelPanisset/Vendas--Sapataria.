/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelDetalhes;
import model.ModelProduto;
import model.ProdutosDetalhes;

/**
 *
 * @author Cliente
 */
public class DAOProdutosDetalhes extends ConexaoMySql {

    public ArrayList<ProdutosDetalhes> getListaProdutosDetalhesDAO(int pcodigoVenda) {

        ArrayList<ProdutosDetalhes> listaModelProdutosDetalhe = new ArrayList<>();
        ProdutosDetalhes modelProdutosDetalhes = new ProdutosDetalhes();
        ModelProduto modelProdutos = new ModelProduto();
        ModelDetalhes modeldetalhe = new ModelDetalhes();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_produto.pk_id_produto, "
                    + "tbl_produto.pro_estoque, "
                    + "tbl_produto.pro_nome, "
                    + "tbl_produto.pro_valor, "
                    + "tbl_detalhe_produtos.pk_id_detalhe, "
                    + "tbl_detalhe_produtos.pk_id_produto "
                    + "FROM "
                    + "tbl_detalhe_produtos INNER JOIN tbl_produto "
                    + "ON  tbl_produto.pk_id_produto = tbl_detalhe_produtos.pk_id_produto; "
                    + "WHERE tbl_detalhe_produtos.pk_id_detalhe = '" + pcodigoVenda 
                     +";"
                    );

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProduto();
                modelProdutosDetalhes = new ProdutosDetalhes();
                modeldetalhe = new ModelDetalhes();
                //
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProEstoque(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));

                // 
                modeldetalhe.setPkIdDetalhe(this.getResultSet().getInt(5));
                modeldetalhe.setPkIdProdutos(this.getResultSet().getInt(6));

                //
                modelProdutosDetalhes.setModelProdutos(modelProdutos);
                modelProdutosDetalhes.setModelDetalhes(modeldetalhe);

                listaModelProdutosDetalhe.add(modelProdutosDetalhes);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosDetalhe;
    }
}
