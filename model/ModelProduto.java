package model;

/**
 *
 * @author Rafael
 */
public class ModelProduto {

    private int IdProduto;
    private String proNome;
    private double proValor;
    private int proEstoque;
    private String proGenero;
    private int proTamanho;
    private String proCor;
    private String proObs;
    private String proMarca;
    private int pro_idFornecedor;

    /**
     * Construtor
     */
    public ModelProduto() {
    }

    /**
     * seta o valor de IdProduto
     *
     * @param pIdProduto
     */
    public void setIdProduto(int pIdProduto) {
        this.IdProduto = pIdProduto;
    }

    /**
     * return pk_IdProduto
     */
    public int getIdProduto() {
        return this.IdProduto;
    }

    /**
     * seta o valor de proNome
     *
     * @param pProNome
     */
    public void setProNome(String pProNome) {
        this.proNome = pProNome;
    }

    /**
     * return proNome
     */
    public String getProNome() {
        return this.proNome;
    }

    /**
     * seta o valor de proValor
     *
     * @param pProValor
     */
    public void setProValor(double pProValor) {
        this.proValor = pProValor;
    }

    /**
     * return proValor
     */
    public double getProValor() {
        return this.proValor;
    }

    /**
     * seta o valor de proEstoque
     *
     * @param pProEstoque
     */
    public void setProEstoque(int pProEstoque) {
        this.proEstoque = pProEstoque;
    }

    /**
     * return proEstoque
     */
    public int getProEstoque() {
        return this.proEstoque;
    }

    /**
     * seta o valor de proGenero
     *
     * @param pProGenero
     */
    public void setProGenero(String pProGenero) {
        this.proGenero = pProGenero;
    }

    /**
     * return proGenero
     */
    public String getProGenero() {
        return this.proGenero;
    }

    /**
     * seta o valor de proTamanho
     *
     * @param pProTamanho
     */
    public void setProTamanho(int pProTamanho) {
        this.proTamanho = pProTamanho;
    }

    /**
     * return proTamanho
     */
    public int getProTamanho() {
        return this.proTamanho;
    }

    /**
     * seta o valor de proCor
     *
     * @param pProCor
     */
    public void setProCor(String pProCor) {
        this.proCor = pProCor;
    }

    /**
     * return proCor
     */
    public String getProCor() {
        return this.proCor;
    }

    /**
     * seta o valor de proObs
     *
     * @param pProObs
     */
    public void setProObs(String pProObs) {
        this.proObs = pProObs;
    }

    /**
     * return proObs
     */
    public String getProObs() {
        return this.proObs;
    }

    @Override
    public String toString() {
        return "ModelProduto {" + "::IdProduto = " + this.IdProduto + "::proNome = " + this.proNome + "::proValor = " + this.proValor + "::proEstoque = " + this.proEstoque + "::proGenero = " + this.proGenero + "::proTamanho = " + this.proTamanho + "::proCor = " + this.proCor + "::proObs = " + this.proObs + "}";
    }

    /**
     * @return the proMarca
     */
    public String getProMarca() {
        return proMarca;
    }

    /**
     * @param proMarca the proMarca to set
     */
    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    /**
     * @return the pro_idFornecedor
     */
    public int getPro_idFornecedor() {
        return pro_idFornecedor;
    }

    /**
     * @param pro_idFornecedor the pro_idFornecedor to set
     */
    public void setPro_idFornecedor(int pro_idFornecedor) {
        this.pro_idFornecedor = pro_idFornecedor;
    }
}
