package dao;

import model.ModelProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOProduto extends ConexaoMySql {

    /**
     * grava Produto
     *
     * @param pModelProduto return int
     */
    public int salvarProdutoDAO(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_genero,"
                    + "pro_tamanho,"
                    + "pro_cor,"
                    + "pro_obs,"
                    + "pro_marca,"
                    + "pro_idFornecedor"
                    + ") VALUES ("
                    + "'" + pModelProduto.getProNome() + "',"
                    + "'" + pModelProduto.getProValor() + "',"
                    + "'" + pModelProduto.getProEstoque() + "',"
                    + "'" + pModelProduto.getProGenero() + "',"
                    + "'" + pModelProduto.getProTamanho() + "',"
                    + "'" + pModelProduto.getProCor() + "',"
                    + "'" + pModelProduto.getProObs() + "',"
                    + "'" + pModelProduto.getProMarca() + "',"
                    + "'" + pModelProduto.getPro_idFornecedor() + "'"
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
     * recupera Produto
     *
     * @param pIdProduto return ModelProduto
     */
    public ModelProduto getProdutoDAO(int pIdProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_genero,"
                    + "pro_tamanho,"
                    + "pro_cor,"
                    + "pro_obs,"
                    + "pro_marca,"
                    + "pro_idFornecedor"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
                modelProduto.setProGenero(this.getResultSet().getString(5));
                modelProduto.setProTamanho(this.getResultSet().getInt(6));
                modelProduto.setProCor(this.getResultSet().getString(7));
                modelProduto.setProObs(this.getResultSet().getString(8));
                modelProduto.setProMarca(this.getResultSet().getString(9));
                modelProduto.setPro_idFornecedor(this.getResultSet().getInt(10));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * recupera uma lista de Produto return ArrayList
     */
    public ArrayList<ModelProduto> getListaProdutoDAO() {
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_genero,"
                    + "pro_tamanho,"
                    + "pro_cor,"
                    + "pro_obs,"
                    + "pro_marca,"
                    + "pro_idFornecedor"
                    + " FROM"
                    + " tbl_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
                modelProduto.setProGenero(this.getResultSet().getString(5));
                modelProduto.setProTamanho(this.getResultSet().getInt(6));
                modelProduto.setProCor(this.getResultSet().getString(7));
                modelProduto.setProObs(this.getResultSet().getString(8));
                modelProduto.setProMarca(this.getResultSet().getString(9));
                modelProduto.setPro_idFornecedor(this.getResultSet().getInt(10));

                listamodelProduto.add(modelProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
     * atualiza Produto
     *
     * @param pModelProduto return boolean
     */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "',"
                    + "pro_nome = '" + pModelProduto.getProNome() + "',"
                    + "pro_valor = '" + pModelProduto.getProValor() + "',"
                    + "pro_estoque = '" + pModelProduto.getProEstoque() + "',"
                    + "pro_genero = '" + pModelProduto.getProGenero() + "',"
                    + "pro_tamanho = '" + pModelProduto.getProTamanho() + "',"
                    + "pro_cor = '" + pModelProduto.getProCor() + "',"
                    + "pro_obs = '" + pModelProduto.getProObs() + "',"
                    + "pro_marca = '" + pModelProduto.getProMarca() + "',"
                    + "pro_idFornecedor = '" + pModelProduto.getPro_idFornecedor() + "'"
                    + " WHERE "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "'"
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
     * exclui Produto
     *
     * @param pIdProduto return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto "
                    + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean atualizarEstoqueDeProdutoController(ArrayList<ModelProduto> listaModelProduto) {
        try {
            this.conectar();

            for (int i = 0; i < listaModelProduto.size(); i++) {

                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                        + "pro_estoque = '" + listaModelProduto.get(i).getProEstoque() + "'"
                        + " WHERE "
                        + "pk_id_produto = '" + listaModelProduto.get(i).getIdProduto() + "'"
                        + ";"
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

    public ModelProduto getProdutoNomeDAO(String pNome) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_genero,"
                    + "pro_tamanho,"
                    + "pro_cor,"
                    + "pro_obs,"
                    + "pro_marca,"
                    + "pro_idFornecedor"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pro_nome = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
                modelProduto.setProGenero(this.getResultSet().getString(5));
                modelProduto.setProTamanho(this.getResultSet().getInt(6));
                modelProduto.setProCor(this.getResultSet().getString(7));
                modelProduto.setProObs(this.getResultSet().getString(8));
                modelProduto.setProMarca(this.getResultSet().getString(9));
                modelProduto.setPro_idFornecedor(this.getResultSet().getInt(10));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

}
