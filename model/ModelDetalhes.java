package model;
/**
*
* @author Rafael
*/
public class ModelDetalhes {

    private int pkIdDetalhe;
    private String pNome;
    private int pkIdProdutos;
    private int tblTamanho;
    private String tblImagem;
    private String tblMarca;
    private String tblCor;

    /**
    * Construtor
    */
    public ModelDetalhes(){}

    /**
    * seta o valor de pkIdDetalhe
    * @param pPkIdDetalhe
    */
    public void setPkIdDetalhe(int pPkIdDetalhe){
        this.pkIdDetalhe = pPkIdDetalhe;
    }
    /**
    * return pk_pkIdDetalhe
    */
    public int getPkIdDetalhe(){
        return this.pkIdDetalhe;
    }

    /**
    * seta o valor de pkIdProdutos
    * @param pPkIdProdutos
    */
    public void setPkIdProdutos(int pPkIdProdutos){
        this.pkIdProdutos = pPkIdProdutos;
    }
    /**
    * return fk_pkIdProdutos
    */
    public int getPkIdProdutos(){
        return this.pkIdProdutos;
    }

    /**
    * seta o valor de tblTamanho
    * @param pTblTamanho
    */
    public void setTblTamanho(int pTblTamanho){
        this.tblTamanho = pTblTamanho;
    }
    /**
    * return tblTamanho
    */
    public int getTblTamanho(){
        return this.tblTamanho;
    }

    /**
    * seta o valor de tblImagem
    * @param pTblImagem
    */
    public void setTblImagem(String pTblImagem){
        this.tblImagem = pTblImagem;
    }
    /**
    * return tblImagem
    */
    public String getTblImagem(){
        return this.tblImagem;
    }

    /**
    * seta o valor de tblMarca
    * @param pTblMarca
    */
    public void setTblMarca(String pTblMarca){
        this.tblMarca = pTblMarca;
    }
    /**
    * return tblMarca
    */
    public String getTblMarca(){
        return this.tblMarca;
    }

    /**
    * seta o valor de tblCor
    * @param pTblCor
    */
    public void setTblCor(String pTblCor){
        this.tblCor = pTblCor;
    }
    /**
    * return tblCor
    */
    public String getTblCor(){
        return this.tblCor;
    }

    @Override
    public String toString(){
        return "ModelDetalhes {" + "::pkIdDetalhe = " + this.pkIdDetalhe + "::pkIdProdutos = " + this.pkIdProdutos + "::tblTamanho = " + this.tblTamanho + "::tblImagem = " + this.tblImagem + "::tblMarca = " + this.tblMarca + "::tblCor = " + this.tblCor +  "}";
    }

    /**
     * @return the pNome
     */
    public String getpNome() {
        return pNome;
    }

    /**
     * @param pNome the pNome to set
     */
    public void setpNome(String pNome) {
        this.pNome = pNome;
    }
}