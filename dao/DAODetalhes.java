package dao;

import model.ModelDetalhes;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class DAODetalhes extends ConexaoMySql {

    /**
     * grava Detalhes
     *
     * @param pModelDetalhes return int
     */
    public int salvarDetalhesDAO(ModelDetalhes pModelDetalhes) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_detalhe_produtos ("
                    + "pk_id_produto,"
                    + "tbl_tamanho,"
                    + "tbl_imagem,"
                    + "tbl_marca,"
                    + "tbl_cor,"
                    + "tbl_pNome"
                    + ") VALUES ("
                    + "'" + pModelDetalhes.getPkIdProdutos() + "',"
                    + "'" + pModelDetalhes.getTblTamanho() + "',"
                    + "'" + pModelDetalhes.getTblImagem() + "',"
                    + "'" + pModelDetalhes.getTblMarca() + "',"
                    + "'" + pModelDetalhes.getTblCor() + "',"
                    + "'" + pModelDetalhes.getpNome() + "'"
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
     * recupera Detalhes
     *
     * @param pPkIdDetalhe return ModelDetalhes
     */
    public ModelDetalhes getDetalhesDAO(int pPkIdDetalhe) {
        ModelDetalhes modelDetalhes = new ModelDetalhes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_detalhe,"
                    + "pk_id_produto,"
                    + "tbl_tamanho,"
                    + "tbl_imagem,"
                    + "tbl_marca,"
                    + "tbl_cor,"
                    + "tbl_pNome"
                    + " FROM"
                    + " tbl_detalhe_produtos"
                    + " WHERE"
                    + " pk_id_detalhe = '" + pPkIdDetalhe + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelDetalhes.setPkIdDetalhe(this.getResultSet().getInt(1));
                modelDetalhes.setPkIdProdutos(this.getResultSet().getInt(2));
                modelDetalhes.setTblTamanho(this.getResultSet().getInt(3));
                modelDetalhes.setTblImagem(this.getResultSet().getString(4));
                modelDetalhes.setTblMarca(this.getResultSet().getString(5));
                modelDetalhes.setTblCor(this.getResultSet().getString(6));
                modelDetalhes.setpNome(this.getResultSet().getString(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelDetalhes;
    }

    /**
     * recupera uma lista de Detalhes return ArrayList
     */
    public ArrayList<ModelDetalhes> getListaDetalhesDAO() {
        ArrayList<ModelDetalhes> listamodelDetalhes = new ArrayList();
        ModelDetalhes modelDetalhes = new ModelDetalhes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_detalhe,"
                    + "pk_id_produto,"
                    + "tbl_tamanho,"
                    + "tbl_imagem,"
                    + "tbl_marca,"
                    + "tbl_cor,"
                    + "tbl_nome"
                    + " FROM"
                    + " tbl_detalhe_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelDetalhes = new ModelDetalhes();
                modelDetalhes.setPkIdDetalhe(this.getResultSet().getInt(1));
                modelDetalhes.setPkIdProdutos(this.getResultSet().getInt(2));
                modelDetalhes.setTblTamanho(this.getResultSet().getInt(3));
                modelDetalhes.setTblImagem(this.getResultSet().getString(4));
                modelDetalhes.setTblMarca(this.getResultSet().getString(5));
                modelDetalhes.setTblCor(this.getResultSet().getString(6));
                modelDetalhes.setpNome(this.getResultSet().getString(7));

                listamodelDetalhes.add(modelDetalhes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelDetalhes;
    }

    /**
     * atualiza Detalhes
     *
     * @param pModelDetalhes return boolean
     */
    public boolean atualizarDetalhesDAO(ModelDetalhes pModelDetalhes) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_detalhe_produtos SET "
                    + "pk_id_detalhe = '" + pModelDetalhes.getPkIdDetalhe() + "',"
                    + "pk_id_produto = '" + pModelDetalhes.getPkIdProdutos() + "',"
                    + "tbl_tamanho = '" + pModelDetalhes.getTblTamanho() + "',"
                    + "tbl_imagem = '" + pModelDetalhes.getTblImagem() + "',"
                    + "tbl_marca = '" + pModelDetalhes.getTblMarca() + "',"
                    + "tbl_cor = '" + pModelDetalhes.getTblCor() + "',"
                    + "tbl_pNome = '" + pModelDetalhes.getpNome() + "'"
                    + " WHERE "
                    + "pk_id_detalhe = '" + pModelDetalhes.getPkIdDetalhe() + "'"
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
     * exclui Detalhes
     *
     * @param pPkIdDetalhe return boolean
     */
    public boolean excluirDetalhesDAO(int pPkIdDetalhe) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_detalhe_produtos "
                    + " WHERE "
                    + "pk_id_detalhe = '" + pPkIdDetalhe + "'"
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
