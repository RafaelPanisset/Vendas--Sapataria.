package DAO;

import model.ModelFormaDePagamento;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Rafael
*/
public class DAOFormaDePagameno extends ConexaoMySql {

    /**
    * grava FormaDePagameno
    * @param pModelFormaDePagameno
    * return int
    */
    public int salvarFormaDePagamenoDAO(ModelFormaDePagamento pModelFormaDePagameno){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO forma_de_pagamento ("
                    + "pk_id_forma_pagamento,"
                    + "descricao_for_pagamento,"
                    + "desconto_for_pagamento, "
                    + "parcelas_for_pagamento, "
                    + "situacao_for_pagamento "
                + ") VALUES ("
                    + "'" + pModelFormaDePagameno.getIdFormaDePagamento() + "',"
                    + "'" + pModelFormaDePagameno.getDescricaoForPagamento() + "',"
                    + "'" + pModelFormaDePagameno.getDescontoForPag() + "',"
                    + "'" + pModelFormaDePagameno.getParcelaForPag() + "',"
                    + "'" + pModelFormaDePagameno.getSituacaoForPag() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera FormaDePagameno
    * @param pIdFormaDePagamento
    * return ModelFormaDePagameno
    */
    public ModelFormaDePagamento getFormaDePagamenoDAO(int pIdFormaDePagamento){
        ModelFormaDePagamento modelFormaDePagameno = new ModelFormaDePagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_forma_pagamento,"
                    + "descricao_for_pagamento,"
                    + "desconto_for_pagamento,"
                    + "parcelas_for_pagamento,"
                    + "situacao_for_pagamento"
                 + " FROM"
                     + " forma_de_pagamento"
                 + " WHERE"
                     + " id_forma_de_pagamento = '" + pIdFormaDePagamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaDePagameno.setIdFormaDePagamento(this.getResultSet().getInt(1));
                modelFormaDePagameno.setDescricaoForPagamento(this.getResultSet().getString (2));
                modelFormaDePagameno.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaDePagameno.setParcelaForPag(this.getResultSet().getInt (4));
                modelFormaDePagameno.setSituacaoForPag(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFormaDePagameno;
    }

    /**
    * recupera uma lista de FormaDePagameno
        * return ArrayList
    */
    public ArrayList<ModelFormaDePagamento> getListaFormaDePagamenoDAO(){
        ArrayList<ModelFormaDePagamento> listamodelFormaDePagameno = new ArrayList();
        ModelFormaDePagamento modelFormaDePagameno = new ModelFormaDePagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_forma_pagamento,"
                    + "descricao_for_pagamento,"
                    + "desconto_for_pagamento,"
                    + "parcelas_for_pagamento,"
                    + "situacao_for_pagamento"
                 + " FROM"
                     + " forma_de_pagamento" 
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaDePagameno = new ModelFormaDePagamento();
                modelFormaDePagameno.setIdFormaDePagamento(this.getResultSet().getInt(1));
                modelFormaDePagameno.setDescricaoForPagamento(this.getResultSet().getString (2));
                modelFormaDePagameno.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaDePagameno.setParcelaForPag(this.getResultSet().getInt (4));
                modelFormaDePagameno.setSituacaoForPag(this.getResultSet().getInt(5));
                listamodelFormaDePagameno.add(modelFormaDePagameno);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFormaDePagameno;
    }

    /**
    * atualiza FormaDePagameno
    * @param pModelFormaDePagameno
    * return boolean
    */
    public boolean atualizarFormaDePagamenoDAO(ModelFormaDePagamento pModelFormaDePagameno){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE forma_de_pagamento SET "
                    + "pk_id_forma_pagamento = '" + pModelFormaDePagameno.getIdFormaDePagamento() + "',"
                    + "descricao_for_pagamento = '" + pModelFormaDePagameno.getDescricaoForPagamento() + "',"
                    + "desconto_for_pagamento = '" + pModelFormaDePagameno.getDescontoForPag() + "',"
                    + "parcelas_for_pagamento= '" + pModelFormaDePagameno.getParcelaForPag() + "',"
                    + "situacao_for_pagamento = '" + pModelFormaDePagameno.getSituacaoForPag() + "'"
                + " WHERE "
                    + "pk_id_forma_pagamento = '" + pModelFormaDePagameno.getIdFormaDePagamento() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui FormaDePagameno
    * @param pIdFormaDePagamento
    * return boolean
    */
    public boolean excluirFormaDePagamenoDAO(int pIdFormaDePagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM forma_de_pagamento "
                + " WHERE "
                    + "pk_id_forma_pagamento  = '" + pIdFormaDePagamento + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}