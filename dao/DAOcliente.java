package dao;

import model.Modelcliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAOcliente extends ConexaoMySql {

    /**
     * grava cliente
     *
     * @param pModelcliente return int
     */
    public int salvarclienteDAO(Modelcliente pModelcliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_cliente ("
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + ") VALUES ("
                    + "'" + pModelcliente.getCliNome() + "',"
                    + "'" + pModelcliente.getCliEndereco() + "',"
                    + "'" + pModelcliente.getCliBairro() + "',"
                    + "'" + pModelcliente.getCliCidade() + "',"
                    + "'" + pModelcliente.getCliUF() + "',"
                    + "'" + pModelcliente.getClicep() + "',"
                    + "'" + pModelcliente.getCliTelefone() + "'"
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
     * recupera cliente
     *
     * @param pIdCliente return Modelcliente
     */
    public Modelcliente getclienteDAO(int pIdCliente) {
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tbl_cliente"
                    + " WHERE"
                    + " pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcliente.setIdCliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUF(this.getResultSet().getString(6));
                modelcliente.setClicep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelcliente;
    }

    /**
     * recupera uma lista de cliente return ArrayList
     */
    public ArrayList<Modelcliente> getListaclienteDAO() {
        ArrayList<Modelcliente> listamodelcliente = new ArrayList();
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tbl_cliente"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcliente = new Modelcliente();
                modelcliente.setIdCliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUF(this.getResultSet().getString(6));
                modelcliente.setClicep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));

                listamodelcliente.add(modelcliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelcliente;
    }

    /**
     * atualiza cliente
     *
     * @param pModelcliente return boolean
     */
    public boolean atualizarclienteDAO(Modelcliente pModelcliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelcliente.getIdCliente() + "',"
                    + "cli_nome = '" + pModelcliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelcliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelcliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelcliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelcliente.getCliUF() + "',"
                    + "cli_cep = '" + pModelcliente.getClicep() + "',"
                    + "cli_telefone = '" + pModelcliente.getCliTelefone() + "'"
                    + " WHERE "
                    + "pk_id_cliente = '" + pModelcliente.getIdCliente() + "'"
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
     * exclui cliente
     *
     * @param pIdCliente return boolean
     */
    public boolean excluirclienteDAO(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente "
                    + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public Modelcliente getclientePeloNomeDAO(String pNomeCliente) {
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tbl_cliente"
                    + " WHERE"
                    + " cli_nome = '" + pNomeCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcliente.setIdCliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUF(this.getResultSet().getString(6));
                modelcliente.setClicep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelcliente;
    }
}
