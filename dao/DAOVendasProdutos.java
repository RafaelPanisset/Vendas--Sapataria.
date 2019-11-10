package dao;

import model.ModelVendasProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOVendasProdutos extends ConexaoMySql {

    /**
     * grava VendasProdutos
     *
     * @param pModelVendasProdutos return int
     */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_vendas_produtos ("
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProdutos() + "',"
                    + "'" + pModelVendasProdutos.getVendas() + "',"
                    + "'" + pModelVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelVendasProdutos.getVenProQuantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendasProdutos
     *
     * @param pIdVendaProdutos return ModelVendasProdutos
     */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProdutos) {
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_venda_produtos,"
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tbl_vendas_produtos"
                    + " WHERE"
                    + " id_venda_produtos = '" + pIdVendaProdutos + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setProdutos(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos return ArrayList
     */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_venda_produtos,"
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tbl_vendas_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setProdutos(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelVendasProdutos return boolean
     */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas_produtos SET "
                    + "id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "',"
                    + "fk_produtos = '" + pModelVendasProdutos.getProdutos() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelVendasProdutos.getVenProValor() + "',"
                    + "ven_pro_quantidade = '" + pModelVendasProdutos.getVenProQuantidade() + "'"
                    + " WHERE "
                    + "id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pIdVendaProdutos return boolean
     */
    public boolean excluirVendasProdutosDAO(int pIdVendaProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas_produtos "
                    + " WHERE "
                    + "fk_vendas = '" + pIdVendaProdutos + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarListaProduto(ArrayList<ModelVendasProdutos> listaModelVendasProduto) {
        try {
            this.conectar();
            int count = listaModelVendasProduto.size();

            for (int i = 0; i < count; i++) {
                this.insertSQL(
                        "INSERT INTO tbl_vendas_produtos ("
                        + "fk_produto,"
                        + "fk_vendas,"
                        + "ven_pro_valor,"
                        + "ven_pro_quantidade"
                        + ") VALUES ("
                        + "'" + listaModelVendasProduto.get(i).getProdutos() + "',"
                        + "'" + listaModelVendasProduto.get(i).getVendas() + "',"
                        + "'" + listaModelVendasProduto.get(i).getVenProValor() + "',"
                        + "'" + listaModelVendasProduto.get(i).getVenProQuantidade() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
