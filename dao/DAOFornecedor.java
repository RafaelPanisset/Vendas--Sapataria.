package dao;

import model.ModelFornecedor;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOFornecedor extends ConexaoMySql {

    /**
     * grava Fornecedor
     *
     * @param pModelFornecedor return int
     */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_fornecedor ("
                    + "nome_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "uf_fornecedor,"
                    + "cep_fornecedor,"
                    + "telefone_fornecedor,"
                    + "data,"
                    + "pessoa_fornecedor"
                    + ") VALUES ("
                    + "'" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "'" + pModelFornecedor.getEnderecoFornecedor() + "',"
                    + "'" + pModelFornecedor.getBairroFornecedor() + "',"
                    + "'" + pModelFornecedor.getUfFornecedor() + "',"
                    + "'" + pModelFornecedor.getCepFornecedor() + "',"
                    + "'" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "'" + pModelFornecedor.getData() + "',"
                    + "'" + pModelFornecedor.getPessoaFornecedor() + "'"
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
     * recupera Fornecedor
     *
     * @param pIdForncedor return ModelFornecedor
     */
    public ModelFornecedor getFornecedorDAO(int pIdForncedor) {
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_forncedor,"
                    + "nome_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "uf_fornecedor,"
                    + "cep_fornecedor,"
                    + "telefone_fornecedor,"
                    + "data,"
                    + "pessoa_fornecedor"
                    + " FROM"
                    + " tbl_fornecedor"
                    + " WHERE"
                    + " pk_id_forncedor = '" + pIdForncedor + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFornecedor.setIdForncedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setBairroFornecedor(this.getResultSet().getString(4));
                modelFornecedor.setUfFornecedor(this.getResultSet().getString(5));
                modelFornecedor.setCepFornecedor(this.getResultSet().getString(6));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(7));
                modelFornecedor.setData(this.getResultSet().getDate(8));
                modelFornecedor.setPessoaFornecedor(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
     * recupera uma lista de Fornecedor return ArrayList
     */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO() {
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_forncedor,"
                    + "nome_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "uf_fornecedor,"
                    + "cep_fornecedor,"
                    + "telefone_fornecedor,"
                    + "data,"
                    + "pessoa_fornecedor"
                    + " FROM"
                    + " tbl_fornecedor"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setIdForncedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setBairroFornecedor(this.getResultSet().getString(4));
                modelFornecedor.setUfFornecedor(this.getResultSet().getString(5));
                modelFornecedor.setCepFornecedor(this.getResultSet().getString(6));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(7));
                modelFornecedor.setData(this.getResultSet().getDate(8));
                modelFornecedor.setPessoaFornecedor(this.getResultSet().getInt(9));
                listamodelFornecedor.add(modelFornecedor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
     * atualiza Fornecedor
     *
     * @param pModelFornecedor return boolean
     */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_fornecedor SET "
                    + "pk_id_forncedor = '" + pModelFornecedor.getIdForncedor() + "',"
                    + "nome_fornecedor = '" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "endereco_fornecedor = '" + pModelFornecedor.getEnderecoFornecedor() + "',"
                    + "bairro_fornecedor = '" + pModelFornecedor.getBairroFornecedor() + "',"
                    + "uf_fornecedor = '" + pModelFornecedor.getUfFornecedor() + "',"
                    + "cep_fornecedor = '" + pModelFornecedor.getCepFornecedor() + "',"
                    + "telefone_fornecedor = '" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "data = '" + pModelFornecedor.getData() + "',"
                    + "pessoa_fornecedor = '" + pModelFornecedor.getPessoaFornecedor() + "'"
                    + " WHERE "
                    + "pk_id_forncedor = '" + pModelFornecedor.getIdForncedor() + "'"
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
     * exclui Fornecedor
     *
     * @param pIdForncedor return boolean
     */
    public boolean excluirFornecedorDAO(int pIdForncedor) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_fornecedor "
                    + " WHERE "
                    + "pk_id_forncedor = '" + pIdForncedor + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelFornecedor getFornecedorNomeController(String pNome) {

        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_forncedor,"
                    + "nome_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "uf_fornecedor,"
                    + "cep_fornecedor,"
                    + "telefone_fornecedor,"
                    + "data,"
                    + "pessoa_fornecedor"
                    + " FROM"
                    + " tbl_fornecedor"
                    + " WHERE"
                    + " nome_fornecedor = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFornecedor.setIdForncedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setBairroFornecedor(this.getResultSet().getString(4));
                modelFornecedor.setUfFornecedor(this.getResultSet().getString(5));
                modelFornecedor.setCepFornecedor(this.getResultSet().getString(6));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(7));
                modelFornecedor.setData(this.getResultSet().getDate(8));
                modelFornecedor.setPessoaFornecedor(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFornecedor;
    }

  



}
