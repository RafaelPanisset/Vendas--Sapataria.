package model;

import java.sql.Date;

/**
 *
 * @author Rafael
 */
public class ModelContarReceber {

    private int IdReceber;
    private int idStatus;
    private int idVendas;
    private int idCliente;
    private Date receDataCompra;
    private Date receVencimento;
    private Double recJuros;
    private Double receRecebeu;
    private Double receRestante;
    private Double receValorTotal;
    private String ativo;
    private Double valorFinal;

    /**
     * Construtor
     */
    public ModelContarReceber() {
    }

    /**
     * seta o valor de IdReceber
     *
     * @param pIdReceber
     */
    public void setIdReceber(int pIdReceber) {
        this.IdReceber = pIdReceber;
    }

    /**
     * return pk_IdReceber
     */
    public int getIdReceber() {
        return this.IdReceber;
    }

    /**
     * seta o valor de idStatus
     *
     * @param pIdStatus
     */
    public void setIdStatus(int pIdStatus) {
        this.idStatus = pIdStatus;
    }

    /**
     * return fk_idStatus
     */
    public int getIdStatus() {
        return this.idStatus;
    }

    /**
     * seta o valor de idVendas
     *
     * @param pIdVendas
     */
    public void setIdVendas(int pIdVendas) {
        this.idVendas = pIdVendas;
    }

    /**
     * return fk_idVendas
     */
    public int getIdVendas() {
        return this.idVendas;
    }

    /**
     * seta o valor de receDataCompra
     *
     * @param pReceDataCompra
     */
    public void setReceDataCompra(Date pReceDataCompra) {
        this.receDataCompra = pReceDataCompra;
    }

    /**
     * return receDataCompra
     */
    public Date getReceDataCompra() {
        return this.receDataCompra;
    }

    /**
     * seta o valor de receVencimento
     *
     * @param pReceVencimento
     */
    public void setReceVencimento(Date pReceVencimento) {
        this.receVencimento = pReceVencimento;
    }

    /**
     * return receVencimento
     */
    public Date getReceVencimento() {
        return this.receVencimento;
    }

    /**
     * seta o valor de recJuros
     *
     * @param pRecJuros
     */
    public void setRecJuros(Double pRecJuros) {
        this.recJuros = pRecJuros;
    }

    /**
     * return recJuros
     */
    public Double getRecJuros() {
        return this.recJuros;
    }

    /**
     * seta o valor de receRecebeu
     *
     * @param pReceRecebeu
     */
    public void setReceRecebeu(Double pReceRecebeu) {
        this.receRecebeu = pReceRecebeu;
    }

    /**
     * return receRecebeu
     */
    public Double getReceRecebeu() {
        return this.receRecebeu;
    }

    /**
     * seta o valor de receRestante
     *
     * @param pReceRestante
     */
    public void setReceRestante(Double pReceRestante) {
        this.receRestante = pReceRestante;
    }

    /**
     * return receRestante
     */
    public Double getReceRestante() {
        return this.receRestante;
    }

    /**
     * seta o valor de receValorTotal
     *
     * @param pReceValorTotal
     */
    public void setReceValorTotal(Double pReceValorTotal) {
        this.receValorTotal = pReceValorTotal;
    }

    /**
     * return receValorTotal
     */
    public Double getReceValorTotal() {
        return this.receValorTotal;
    }

    /**
     * seta o valor de ativo
     *
     * @param pAtivo
     */
    public void setAtivo(String pAtivo) {
        this.ativo = pAtivo;
    }

    /**
     * return ativo
     */
    public String getAtivo() {
        return this.ativo;
    }

    /**
     * seta o valor de valorFinal
     *
     * @param pValorFinal
     */
    public void setValorFinal(Double pValorFinal) {
        this.valorFinal = pValorFinal;
    }

    /**
     * return valorFinal
     */
    public Double getValorFinal() {
        return this.valorFinal;
    }

    @Override
    public String toString() {
        return "ModelReceber {" + "::IdReceber = " + this.IdReceber + "::idStatus = " + this.idStatus + "::idVendas = " + this.idVendas + "::receDataCompra = " + this.receDataCompra + "::receVencimento = " + this.receVencimento + "::recJuros = " + this.recJuros + "::receRecebeu = " + this.receRecebeu + "::receRestante = " + this.receRestante + "::receValorTotal = " + this.receValorTotal + "::ativo = " + this.ativo + "::valorFinal = " + this.valorFinal + "}";
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
