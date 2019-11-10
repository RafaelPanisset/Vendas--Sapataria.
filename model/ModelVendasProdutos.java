package model;
/**
*
* @author Rafael
*/
public class ModelVendasProdutos {

    private int  idVendaProdutos;
    private int produtos;
    private int vendas;
    private double venProValor;
    private int venProQuantidade;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de idVendaProdutos
    * @param pIdVendaProdutos
    */
    public void setIdVendaProdutos(int  pIdVendaProdutos){
        this.idVendaProdutos = pIdVendaProdutos;
    }
    /**
    * return idVendaProdutos
    */
    public int  getIdVendaProdutos(){
        return this.idVendaProdutos;
    }

    /**
    * seta o valor de produtos
    * @param pProdutos
    */
    public void setProdutos(int pProdutos){
        this.produtos = pProdutos;
    }
    /**
    * return fk_produtos
    */
    public int getProdutos(){
        return this.produtos;
    }

    /**
    * seta o valor de vendas
    * @param pVendas
    */
    public void setVendas(int pVendas){
        this.vendas = pVendas;
    }
    /**
    * return fk_vendas
    */
    public int getVendas(){
        return this.vendas;
    }

    /**
    * seta o valor de venProValor
    * @param pVenProValor
    */
    public void setVenProValor(double pVenProValor){
        this.venProValor = pVenProValor;
    }
    /**
    * return venProValor
    */
    public double getVenProValor(){
        return this.venProValor;
    }

    /**
    * seta o valor de venProQuantidade
    * @param pVenProQuantidade
    */
    public void setVenProQuantidade(int pVenProQuantidade){
        this.venProQuantidade = pVenProQuantidade;
    }
    /**
    * return venProQuantidade
    */
    public int getVenProQuantidade(){
        return this.venProQuantidade;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProdutos = " + this.idVendaProdutos + "::produtos = " + this.produtos + "::vendas = " + this.vendas + "::venProValor = " + this.venProValor + "::venProQuantidade = " + this.venProQuantidade +  "}";
    }
}