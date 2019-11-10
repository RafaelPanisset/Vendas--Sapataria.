package model;
/**
*
* @author Rafael
*/
public class ModelStatus {

    private int idStatus;
    private String tipo;

    /**
    * Construtor
    */
    public ModelStatus(){}

    /**
    * seta o valor de idStatus
    * @param pIdStatus
    */
    public void setIdStatus(int pIdStatus){
        this.idStatus = pIdStatus;
    }
    /**
    * return pk_idStatus
    */
    public int getIdStatus(){
        return this.idStatus;
    }

    /**
    * seta o valor de tipo
    * @param pTipo
    */
    public void setTipo(String pTipo){
        this.tipo = pTipo;
    }
    /**
    * return tipo
    */
    public String getTipo(){
        return this.tipo;
    }

    @Override
    public String toString(){
        return "ModelStatus {" + "::idStatus = " + this.idStatus + "::tipo = " + this.tipo +  "}";
    }
}