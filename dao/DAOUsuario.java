package dao;

import model.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Rafael 
*/
public class DAOUsuario extends ConexaoMySql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuario ("
                    + "pk_id_usuario,"
                    + "usu_nome,"
                    + "uso_login,"
                    + "uso_senha"
                + ") VALUES ("
                    + "'" + pModelUsuario.getIdUsuario() + "',"
                    + "'" + pModelUsuario.getUsuNome() + "',"
                    + "'" + pModelUsuario.getUsoLogin() + "',"
                    + "'" + pModelUsuario.getUsoSenha() + "'"
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
    * recupera Usuario
    * @param pIdUsuario
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usu_nome,"
                    + "uso_login,"
                    + "uso_senha"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " pk_id_usuario = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString (2));
                modelUsuario.setUsoLogin(this.getResultSet().getString(3));
                modelUsuario.setUsoSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usu_nome,"
                    + "uso_login,"
                    + "uso_senha"
                 + " FROM"
                     + " tbl_usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString (2));
                modelUsuario.setUsoLogin(this.getResultSet().getString(3));
                modelUsuario.setUsoSenha(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuario SET "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "usu_nome = '" + pModelUsuario.getUsuNome() + "',"
                    + "uso_login = '" + pModelUsuario.getUsoLogin() + "',"
                    + "uso_senha = '" + pModelUsuario.getUsoSenha() + "'"
                + " WHERE "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
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
    * exclui Usuario
    * @param pIdUsuario
    * return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuario "
                + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean DAOConferirUsuario(ModelUsuario pModeluserADM) {

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario,"
                    + "usu_nome,"
                    + "uso_login,"
                    + "uso_senha"
                    + " FROM"
                    + " tbl_usuario"
                    + " WHERE"
                    + " uso_login = '" + pModeluserADM.getUsoLogin()+ "'AND uso_senha = '" + pModeluserADM.getUsoSenha()+ "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
     public ModelUsuario getUsuarioDAO(String plogin){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usu_nome,"
                    + "uso_login,"
                    + "uso_senha"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " uso_login = '" + plogin + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString (2));
                modelUsuario.setUsoLogin(this.getResultSet().getString(3));
                modelUsuario.setUsoSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }
}