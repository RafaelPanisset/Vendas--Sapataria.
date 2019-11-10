/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendasCliente;
import model.Modelvendas;
import model.Modelcliente;

/**
 *
 * @author Cliente
 */
public class DAOVendasCliente extends ConexaoMySql {

    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO() {
        ArrayList<ModelVendasCliente> listamodelvendas = new ArrayList();
        Modelvendas modelvendas = new Modelvendas();
        Modelcliente modelcliente = new Modelcliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_vendas.pk_id_vendas,"
                    + "tbl_vendas.fk_cliente,"
                    + "tbl_vendas.ven_data_venda,"
                    + "tbl_vendas.ven_valor_liquido,"
                    + "tbl_vendas.ven_valor_bruto,"
                    + "tbl_vendas.ven_valor_desconto,"
                    + "tbl_vendas.idContaReceber,"
                    + "tbl_cliente.pk_id_cliente,"
                    + "tbl_cliente.cli_nome,"
                    + "tbl_cliente.cli_endereco,"
                    + "tbl_cliente.cli_bairro,"
                    + "tbl_cliente.cli_cidade,"
                    + "tbl_cliente.cli_uf,"
                    + "tbl_cliente.cli_cep,"
                    + "tbl_cliente.cli_telefone"
                    + " FROM"
                    + " tbl_vendas INNER JOIN tbl_cliente "
                    + "ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente; "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelvendas = new Modelvendas();
                modelVendasCliente = new ModelVendasCliente();
                modelvendas.setIdVendas(this.getResultSet().getInt(1));
                modelvendas.setCliente(this.getResultSet().getInt(2));
                modelvendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelvendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelvendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelvendas.setVenDesconto(this.getResultSet().getDouble(6));
                modelvendas.setIdContaReceber(this.getResultSet().getInt(7));

                // cliente
                modelcliente = new Modelcliente();
                modelcliente.setIdCliente(this.getResultSet().getInt(8));
                modelcliente.setCliNome(this.getResultSet().getString(9));
                modelcliente.setCliEndereco(this.getResultSet().getString(10));
                modelcliente.setCliBairro(this.getResultSet().getString(11));
                modelcliente.setCliCidade(this.getResultSet().getString(12));
                modelcliente.setCliUF(this.getResultSet().getString(13));
                modelcliente.setClicep(this.getResultSet().getString(14));
                modelcliente.setCliTelefone(this.getResultSet().getString(15));
                modelVendasCliente.setModelvendas(modelvendas);
                modelVendasCliente.setModecliente(modelcliente);

                listamodelvendas.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelvendas;
    }

}
