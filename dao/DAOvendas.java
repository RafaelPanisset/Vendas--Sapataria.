package dao;

import model.Modelvendas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOvendas extends ConexaoMySql {

    /**
     * grava vendas
     *
     * @param pModelvendas return int
     */
    public int salvarvendasDAO(Modelvendas pModelvendas) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_valor_desconto,"
                    + "idContaReceber"
                    + ") VALUES ("
                    + "'" + pModelvendas.getCliente() + "',"
                    + "'" + pModelvendas.getVenDataVenda() + "',"
                    + "'" + pModelvendas.getVenValorLiquido() + "',"
                    + "'" + pModelvendas.getVenValorBruto() + "',"
                    + "'" + pModelvendas.getVenDesconto() + "',"
                    + "'" + pModelvendas.getIdContaReceber() + "'"
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
     * recupera vendas
     *
     * @param pIdVendas return Modelvendas
     */
    public Modelvendas getvendasDAO(int pIdVendas) {
        Modelvendas modelvendas = new Modelvendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_valor_desconto,"
                    + "idContaReceber"
                    + " FROM"
                    + " tbl_vendas"
                    + " WHERE"
                    + " pk_id_vendas = '" + pIdVendas + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelvendas.setIdVendas(this.getResultSet().getInt(1));
                modelvendas.setCliente(this.getResultSet().getInt(2));
                modelvendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelvendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelvendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelvendas.setVenDesconto(this.getResultSet().getDouble(6));
                modelvendas.setIdContaReceber(this.getResultSet().getInt(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelvendas;
    }

    /**
     * recupera uma lista de vendas return ArrayList
     */
    public ArrayList<Modelvendas> getListavendasDAO() {
        ArrayList<Modelvendas> listamodelvendas = new ArrayList();
        Modelvendas modelvendas = new Modelvendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_valor_desconto,"
                    + "idContaReceber"
                    + " FROM"
                    + " tbl_vendas"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelvendas = new Modelvendas();
                modelvendas.setIdVendas(this.getResultSet().getInt(1));
                modelvendas.setCliente(this.getResultSet().getInt(2));
                modelvendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelvendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelvendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelvendas.setVenDesconto(this.getResultSet().getDouble(6));
                modelvendas.setIdContaReceber(this.getResultSet().getInt(7));

                listamodelvendas.add(modelvendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelvendas;
    }

    /**
     * atualiza vendas
     *
     * @param pModelvendas return boolean
     */
    public boolean atualizarvendasDAO(Modelvendas pModelvendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                    + "pk_id_vendas = '" + pModelvendas.getIdVendas() + "',"
                    + "fk_cliente = '" + pModelvendas.getCliente() + "',"
                    + "ven_data_venda = '" + pModelvendas.getVenDataVenda() + "',"
                    + "ven_valor_liquido = '" + pModelvendas.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelvendas.getVenValorBruto() + "',"
                    + "ven_valor_desconto = '" + pModelvendas.getVenDesconto() + "',"
                    + "idContaReceber = '" + pModelvendas.getIdContaReceber() + "'"
                    + " WHERE "
                    + "pk_id_vendas = '" + pModelvendas.getIdVendas() + "'"
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
     * exclui vendas
     *
     * @param pIdVendas return boolean
     */
    public boolean excluirvendasDAO(int pIdVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas "
                    + " WHERE "
                    + "pk_id_vendas = '" + pIdVendas + "'"
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
