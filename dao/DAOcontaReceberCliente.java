/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelClienteReceber;
import model.ModelContarReceber;
import model.Modelcliente;

/**
 *
 * @author Cliente
 */
public class DAOcontaReceberCliente extends ConexaoMySql {

    public ArrayList<ModelClienteReceber> getClienteReceberConta() {
        ArrayList<ModelClienteReceber> listaContaCliente = new ArrayList<>();
        ModelContarReceber ModelReceber = new ModelContarReceber();
        Modelcliente modelCliente = new Modelcliente();
        ModelClienteReceber ModelClienteReceber = new ModelClienteReceber();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tbl_conta_recebe.pk__id_receber, "
                    + "tbl_conta_recebe.fk_id_status, "
                    + "tbl_conta_recebe.fk_id_vendas, "
                    + "tbl_conta_recebe.fkCliente, "
                    + "tbl_conta_recebe.rece_data_compra, "
                    + "tbl_conta_recebe.rece_vencimento, "
                    + "tbl_conta_recebe.rec_juros, "
                    + "tbl_conta_recebe.rece_recebeu, "
                    + "tbl_conta_recebe.rece_restante, "
                    + "tbl_conta_recebe.rece_valor_total, "
                    + "tbl_conta_recebe.ativo, "
                    + "tbl_conta_recebe.valor_final,"
                  
                    + "tbl_cliente.pk_id_cliente, "
                    + "tbl_cliente.cli_nome "
                    + " FROM"
                    + " tbl_conta_recebe INNER JOIN tbl_cliente "
                    + "ON tbl_cliente.pk_id_cliente = tbl_conta_recebe.fkCliente; "
                    + ";"
            );

            while (this.getResultSet().next()) {
                ModelReceber = new ModelContarReceber();
                ModelClienteReceber = new ModelClienteReceber();                //

                ModelReceber = new ModelContarReceber();
                ModelReceber.setIdReceber(this.getResultSet().getInt(1));
                ModelReceber.setIdStatus(this.getResultSet().getInt(2));
                ModelReceber.setIdVendas(this.getResultSet().getInt(3));
                ModelReceber.setIdCliente(this.getResultSet().getInt(4));
               
                ModelReceber.setReceDataCompra(this.getResultSet().getDate(5));
                ModelReceber.setReceVencimento(this.getResultSet().getDate(6));
                ModelReceber.setRecJuros(this.getResultSet().getDouble(7));
                ModelReceber.setReceRecebeu(this.getResultSet().getDouble(8));
                ModelReceber.setReceRestante(this.getResultSet().getDouble(9));
                ModelReceber.setReceValorTotal(this.getResultSet().getDouble(10));
                ModelReceber.setAtivo(this.getResultSet().getString(11));
                ModelReceber.setValorFinal(this.getResultSet().getDouble(12));

                modelCliente = new Modelcliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(13));
                modelCliente.setCliNome(this.getResultSet().getString(14));
                //
                ModelClienteReceber.setModelCliente(modelCliente);
                ModelClienteReceber.setModelreceber(ModelReceber);

                listaContaCliente.add(ModelClienteReceber);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaContaCliente;
    }

}
