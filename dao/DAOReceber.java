package dao;

import model.ModelContarReceber;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOReceber extends ConexaoMySql {

    /**
     * grava Receber
     *
     * @param pModelReceber return int
     */
    public int salvarReceberDAO(ModelContarReceber pModelReceber) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_conta_recebe ("
                    + "fk_id_status,"
                    + "fk_id_vendas,"
                    + "fkCliente,"
                    + "rece_data_compra,"
                    + "rece_vencimento,"
                    + "rec_juros,"
                    + "rece_recebeu,"
                    + "rece_restante,"
                    + "rece_valor_total,"
                    + "ativo,"
                    + "valor_final"
                    + ") VALUES ("
                    + "'" + pModelReceber.getIdStatus() + "',"
                    + "'" + pModelReceber.getIdVendas() + "',"
                    + "'" + pModelReceber.getIdCliente() + "',"
                    + "'" + pModelReceber.getReceDataCompra() + "',"
                    + "'" + pModelReceber.getReceVencimento() + "',"
                    + "'" + pModelReceber.getRecJuros() + "',"
                    + "'" + pModelReceber.getReceRecebeu() + "',"
                    + "'" + pModelReceber.getReceRestante() + "',"
                    + "'" + pModelReceber.getReceValorTotal() + "',"
                    + "'" + pModelReceber.getAtivo() + "',"
                    + "'" + pModelReceber.getValorFinal() + "'"
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
     * recupera Receber fkCliente
     *
     * @param pIdReceber return ModelReceber
     */
    public ModelContarReceber getReceberDAO(int pIdReceber) {
        ModelContarReceber modelReceber = new ModelContarReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk__id_receber,"
                    + "fk_id_status,"
                    + "fk_id_vendas,"
                    + "fkCliente,"
                    + "rece_data_compra,"
                    + "rece_vencimento,"
                    + "rec_juros,"
                    + "rece_recebeu,"
                    + "rece_restante,"
                    + "rece_valor_total,"
                    + "ativo,"
                    + "valor_final"
                    + " FROM"
                    + " tbl_conta_recebe"
                    + " WHERE"
                    + " pk__id_receber = '" + pIdReceber + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelReceber.setIdReceber(this.getResultSet().getInt(1));
                modelReceber.setIdStatus(this.getResultSet().getInt(2));
                modelReceber.setIdVendas(this.getResultSet().getInt(3));
                modelReceber.setIdCliente(this.getResultSet().getInt(4));
                modelReceber.setReceDataCompra(this.getResultSet().getDate(5));
                modelReceber.setReceVencimento(this.getResultSet().getDate(6));
                modelReceber.setRecJuros(this.getResultSet().getDouble(7));
                modelReceber.setReceRecebeu(this.getResultSet().getDouble(8));
                modelReceber.setReceRestante(this.getResultSet().getDouble(9));
                modelReceber.setReceValorTotal(this.getResultSet().getDouble(10));
                modelReceber.setAtivo(this.getResultSet().getString(11));
                modelReceber.setValorFinal(this.getResultSet().getDouble(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelReceber;
    }

    /**
     * recupera uma lista de Receber return ArrayList
     */
    public ArrayList<ModelContarReceber> getListaReceberDAO() {
        ArrayList<ModelContarReceber> listamodelReceber = new ArrayList();
        ModelContarReceber modelReceber = new ModelContarReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk__id_receber,"
                    + "fk_id_status,"
                    + "fk_id_vendas,"
                    + "fkCliente,"
                    + "rece_data_compra,"
                    + "rece_vencimento,"
                    + "rec_juros,"
                    + "rece_recebeu,"
                    + "rece_restante,"
                    + "rece_valor_total,"
                    + "ativo,"
                    + "valor_final"
                    + " FROM"
                    + " tbl_conta_recebe"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelReceber = new ModelContarReceber();
                modelReceber.setIdReceber(this.getResultSet().getInt(1));
                modelReceber.setIdStatus(this.getResultSet().getInt(2));
                modelReceber.setIdVendas(this.getResultSet().getInt(3));
                modelReceber.setIdCliente(this.getResultSet().getInt(4));
                modelReceber.setReceDataCompra(this.getResultSet().getDate(5));
                modelReceber.setReceVencimento(this.getResultSet().getDate(6));
                modelReceber.setRecJuros(this.getResultSet().getDouble(7));
                modelReceber.setReceRecebeu(this.getResultSet().getDouble(8));
                modelReceber.setReceRestante(this.getResultSet().getDouble(9));
                modelReceber.setReceValorTotal(this.getResultSet().getDouble(10));
                modelReceber.setAtivo(this.getResultSet().getString(11));
                modelReceber.setValorFinal(this.getResultSet().getDouble(12));
                listamodelReceber.add(modelReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelReceber;
    }

    /**
     * atualiza Receber
     *
     * @param pModelReceber return boolean
     */
    public boolean atualizarReceberDAO(ModelContarReceber pModelReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_conta_recebe SET "
                    + "pk__id_receber = '" + pModelReceber.getIdReceber() + "',"
                    + "fk_id_status = '" + pModelReceber.getIdStatus() + "',"
                    + "fk_id_vendas = '" + pModelReceber.getIdVendas() + "',"
                    + "fkCliente = '" + pModelReceber.getIdCliente() + "',"
                    + "rece_data_compra = '" + pModelReceber.getReceDataCompra() + "',"
                    + "rece_vencimento = '" + pModelReceber.getReceVencimento() + "',"
                    + "rec_juros = '" + pModelReceber.getRecJuros() + "',"
                    + "rece_recebeu = '" + pModelReceber.getReceRecebeu() + "',"
                    + "rece_restante = '" + pModelReceber.getReceRestante() + "',"
                    + "rece_valor_total = '" + pModelReceber.getReceValorTotal() + "',"
                    + "ativo = '" + pModelReceber.getAtivo() + "',"
                    + "valor_final = '" + pModelReceber.getValorFinal() + "'"
                    + " WHERE "
                    + "pk__id_receber = '" + pModelReceber.getIdReceber() + "'"
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
     * exclui Receber
     *
     * @param pIdReceber return boolean
     */
    public boolean excluirReceberDAO(int pIdReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_conta_recebe "
                    + " WHERE "
                    + "pk__id_receber = '" + pIdReceber + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
