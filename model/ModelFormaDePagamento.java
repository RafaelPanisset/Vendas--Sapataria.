package model;
/**
*
* @author Rafael
*/
public class ModelFormaDePagamento {

    private int idFormaDePagamento;
    private String  descricaoForPagamento;
    private float descontoForPag;
    private int  parcelaForPag;
    private int situacaoForPag;

    /**
    * Construtor
    */
    public ModelFormaDePagamento(){}

    /**
    * seta o valor de idFormaDePagamento
    * @param pIdFormaDePagamento
    */
    public void setIdFormaDePagamento(int pIdFormaDePagamento){
        this.idFormaDePagamento = pIdFormaDePagamento;
    }
    /**
    * return idFormaDePagamento
    */
    public int getIdFormaDePagamento(){
        return this.idFormaDePagamento;
    }

    /**
    * seta o valor de descricaoForPagamento
    * @param pDescricaoForPagamento
    */
    public void setDescricaoForPagamento(String  pDescricaoForPagamento){
        this.descricaoForPagamento = pDescricaoForPagamento;
    }
    /**
    * return descricaoForPagamento
    */
    public String  getDescricaoForPagamento(){
        return this.descricaoForPagamento;
    }

    /**
    * seta o valor de descontoForPag
    * @param pDescontoForPag
    */
    public void setDescontoForPag(float pDescontoForPag){
        this.descontoForPag = pDescontoForPag;
    }
    /**
    * return descontoForPag
    */
    public float getDescontoForPag(){
        return this.descontoForPag;
    }

    /**
    * seta o valor de parcelaForPag
    * @param pParcelaForPag
    */
    public void setParcelaForPag(int  pParcelaForPag){
        this.parcelaForPag = pParcelaForPag;
    }
    /**
    * return parcelaForPag
    */
    public int  getParcelaForPag(){
        return this.parcelaForPag;
    }

    /**
    * seta o valor de situacaoForPag
    * @param pSituacaoForPag
    */
    public void setSituacaoForPag(int pSituacaoForPag){
        this.situacaoForPag = pSituacaoForPag;
    }
    /**
    * return situacaoForPag
    */
    public int getSituacaoForPag(){
        return this.situacaoForPag;
    }

    @Override
    public String toString(){
        return "ModelFormaDePagameno {" + "::idFormaDePagamento = " + this.idFormaDePagamento + "::descricaoForPagamento = " + this.descricaoForPagamento + "::descontoForPag = " + this.descontoForPag + "::parcelaForPag = " + this.parcelaForPag + "::situacaoForPag = " + this.situacaoForPag +  "}";
    }
}