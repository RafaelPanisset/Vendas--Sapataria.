package model;

import java.sql.Date;

/**
*
* @author Rafael
*/
public class ModelFornecedor {

    private int  idForncedor;
    private String nomeFornecedor;
    private String enderecoFornecedor;
    private String bairroFornecedor;
    private String ufFornecedor;
    private String cepFornecedor;
    private String telefoneFornecedor;
    private Date data;
    private int pessoaFornecedor;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de idForncedor
    * @param pIdForncedor
    */
    public void setIdForncedor(int  pIdForncedor){
        this.idForncedor = pIdForncedor;
    }
    /**
    * return pk_idForncedor
    */
    public int  getIdForncedor(){
        return this.idForncedor;
    }

    /**
    * seta o valor de nomeFornecedor
    * @param pNomeFornecedor
    */
    public void setNomeFornecedor(String pNomeFornecedor){
        this.nomeFornecedor = pNomeFornecedor;
    }
    /**
    * return nomeFornecedor
    */
    public String getNomeFornecedor(){
        return this.nomeFornecedor;
    }

    /**
    * seta o valor de enderecoFornecedor
    * @param pEnderecoFornecedor
    */
    public void setEnderecoFornecedor(String pEnderecoFornecedor){
        this.enderecoFornecedor = pEnderecoFornecedor;
    }
    /**
    * return enderecoFornecedor
    */
    public String getEnderecoFornecedor(){
        return this.enderecoFornecedor;
    }

    /**
    * seta o valor de bairroFornecedor
    * @param pBairroFornecedor
    */
    public void setBairroFornecedor(String pBairroFornecedor){
        this.bairroFornecedor = pBairroFornecedor;
    }
    /**
    * return bairroFornecedor
    */
    public String getBairroFornecedor(){
        return this.bairroFornecedor;
    }

    /**
    * seta o valor de ufFornecedor
    * @param pUfFornecedor
    */
    public void setUfFornecedor(String pUfFornecedor){
        this.ufFornecedor = pUfFornecedor;
    }
    /**
    * return ufFornecedor
    */
    public String getUfFornecedor(){
        return this.ufFornecedor;
    }

    /**
    * seta o valor de cepFornecedor
    * @param pCepFornecedor
    */
    public void setCepFornecedor(String pCepFornecedor){
        this.cepFornecedor = pCepFornecedor;
    }
    /**
    * return cepFornecedor
    */
    public String getCepFornecedor(){
        return this.cepFornecedor;
    }

    /**
    * seta o valor de telefoneFornecedor
    * @param pTelefoneFornecedor
    */
    public void setTelefoneFornecedor(String pTelefoneFornecedor){
        this.telefoneFornecedor = pTelefoneFornecedor;
    }
    /**
    * return telefoneFornecedor
    */
    public String getTelefoneFornecedor(){
        return this.telefoneFornecedor;
    }

    /**
    * seta o valor de data
    * @param pData
    */
    public void setData(Date pData){
        this.data = pData;
    }
    /**
    * return data
    */
    public Date getData(){
        return this.data;
    }

    /**
    * seta o valor de pessoaFornecedor
    * @param pPessoaFornecedor
    */
    public void setPessoaFornecedor(int pPessoaFornecedor){
        this.pessoaFornecedor = pPessoaFornecedor;
    }
    /**
    * return pessoaFornecedor
    */
    public int getPessoaFornecedor(){
        return this.pessoaFornecedor;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::idForncedor = " + this.idForncedor + "::nomeFornecedor = " + this.nomeFornecedor + "::enderecoFornecedor = " + this.enderecoFornecedor + "::bairroFornecedor = " + this.bairroFornecedor + "::ufFornecedor = " + this.ufFornecedor + "::cepFornecedor = " + this.cepFornecedor + "::telefoneFornecedor = " + this.telefoneFornecedor + "::data = " + this.data + "::pessoaFornecedor = " + this.pessoaFornecedor +  "}";
    }
}