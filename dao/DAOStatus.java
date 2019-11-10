package dao;

import model.ModelStatus;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Rafael
*/
public class DAOStatus extends ConexaoMySql {

    /**
    * grava Status
    * @param pModelStatus
    * return int
    */
    public int salvarStatusDAO(ModelStatus pModelStatus){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO status ("
                    + "id_Status,"
                    + "tipo"
                + ") VALUES ("
                    + "'" + pModelStatus.getIdStatus() + "',"
                    + "'" + pModelStatus.getTipo() + "'"
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
    * recupera Status
    * @param pIdStatus
    * return ModelStatus
    */
    public ModelStatus getStatusDAO(int pIdStatus){
        ModelStatus modelStatus = new ModelStatus();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_Status,"
                    + "tipo"
                 + " FROM"
                     + " status"
                 + " WHERE"
                     + " pk_id_status = '" + pIdStatus + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelStatus.setIdStatus(this.getResultSet().getInt(1));
                modelStatus.setTipo(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelStatus;
    }

    /**
    * recupera uma lista de Status
        * return ArrayList
    */
    public ArrayList<ModelStatus> getListaStatusDAO(){
        ArrayList<ModelStatus> listamodelStatus = new ArrayList();
        ModelStatus modelStatus = new ModelStatus();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_Status,"
                    + "tipo"
                 + " FROM"
                     + " status"
                + ";"
            );

            while(this.getResultSet().next()){
                modelStatus = new ModelStatus();
                modelStatus.setIdStatus(this.getResultSet().getInt(1));
                modelStatus.setTipo(this.getResultSet().getString(2));
                listamodelStatus.add(modelStatus);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelStatus;
    }

    /**
    * atualiza Status
    * @param pModelStatus
    * return boolean
    */
    public boolean atualizarStatusDAO(ModelStatus pModelStatus){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE status SET "
                    + "id_Status = '" + pModelStatus.getIdStatus() + "',"
                    + "tipo = '" + pModelStatus.getTipo() + "'"
                + " WHERE "
                    + "id_Status = '" + pModelStatus.getIdStatus() + "'"
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
    * exclui Status
    * @param pIdStatus
    * return boolean
    */
    public boolean excluirStatusDAO(int pIdStatus){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM status "
                + " WHERE "
                    + "id_Status = '" + pIdStatus + "'"
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