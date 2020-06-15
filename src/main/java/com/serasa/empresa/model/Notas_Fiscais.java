package com.serasa.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Notas_Fiscais implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String naturalidadeDaOperacao;
    private Integer inscricaoEstatual;
    private Integer inscEstatualDoSubstTibutareo;
    private String cnpj;
    private Date dataEmisao;
    private Date dataSaida;
    private String baseDeCalculoIcms;
    private String valorIcms;
    private String baseDeCalculoDoIcmsSt;
    private String valorIcmsSt;
    private String valorAproximadoDosTributos;
    private String valorTotalDosProdutos;
    private String valorDoFrete;
    private String valorDoSeguro;
    private String desconto;
    private String outrasDespesasAcessorios;
    private String valorDoIpi;
    private String valorTotalDaNota;

    public Notas_Fiscais (){

    }

    public Notas_Fiscais(long id, String naturalidadeDaOperacao, Integer inscricaoEstatual, Integer inscEstatualDoSubstTibutareo, String cnpj, Date dataEmisao, Date dataSaida, String baseDeCalculoIcms, String valorIcms, String baseDeCalculoDoIcmsSt, String valorIcmsSt, String valorAproximadoDosTributos, String valorTotalDosProdutos, String valorDoFrete, String valorDoSeguro, String desconto, String outrasDespesasAcessorios, String valorDoIpi, String valorTotalDaNota) {
        super();
        this.id = id;
        this.naturalidadeDaOperacao = naturalidadeDaOperacao;
        this.inscricaoEstatual = inscricaoEstatual;
        this.inscEstatualDoSubstTibutareo = inscEstatualDoSubstTibutareo;
        this.cnpj = cnpj;
        this.dataEmisao = dataEmisao;
        this.dataSaida = dataSaida;
        this.baseDeCalculoIcms = baseDeCalculoIcms;
        this.valorIcms = valorIcms;
        this.baseDeCalculoDoIcmsSt = baseDeCalculoDoIcmsSt;
        this.valorIcmsSt = valorIcmsSt;
        this.valorAproximadoDosTributos = valorAproximadoDosTributos;
        this.valorTotalDosProdutos = valorTotalDosProdutos;
        this.valorDoFrete = valorDoFrete;
        this.valorDoSeguro = valorDoSeguro;
        this.desconto = desconto;
        this.outrasDespesasAcessorios = outrasDespesasAcessorios;
        this.valorDoIpi = valorDoIpi;
        this.valorTotalDaNota = valorTotalDaNota;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaturalidadeDaOperacao() {
        return naturalidadeDaOperacao;
    }

    public void setNaturalidadeDaOperacao(String naturalidadeDaOperacao) {
        this.naturalidadeDaOperacao = naturalidadeDaOperacao;
    }

    public Integer getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(Integer inscricaoEstatual) {
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public Integer getInscEstatualDoSubstTibutareo() {
        return inscEstatualDoSubstTibutareo;
    }

    public void setInscEstatualDoSubstTibutareo(Integer inscEstatualDoSubstTibutareo) {
        this.inscEstatualDoSubstTibutareo = inscEstatualDoSubstTibutareo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataEmisao() {
        return dataEmisao;
    }

    public void setDataEmisao(Date dataEmisao) {
        this.dataEmisao = dataEmisao;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(String baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
    }

    public String getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(String valorIcms) {
        this.valorIcms = valorIcms;
    }

    public String getBaseDeCalculoDoIcmsSt() {
        return baseDeCalculoDoIcmsSt;
    }

    public void setBaseDeCalculoDoIcmsSt(String baseDeCalculoDoIcmsSt) {
        this.baseDeCalculoDoIcmsSt = baseDeCalculoDoIcmsSt;
    }

    public String getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(String valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public String getValorAproximadoDosTributos() {
        return valorAproximadoDosTributos;
    }

    public void setValorAproximadoDosTributos(String valorAproximadoDosTributos) {
        this.valorAproximadoDosTributos = valorAproximadoDosTributos;
    }

    public String getValorTotalDosProdutos() {
        return valorTotalDosProdutos;
    }

    public void setValorTotalDosProdutos(String valorTotalDosProdutos) {
        this.valorTotalDosProdutos = valorTotalDosProdutos;
    }

    public String getValorDoFrete() {
        return valorDoFrete;
    }

    public void setValorDoFrete(String valorDoFrete) {
        this.valorDoFrete = valorDoFrete;
    }

    public String getValorDoSeguro() {
        return valorDoSeguro;
    }

    public void setValorDoSeguro(String valorDoSeguro) {
        this.valorDoSeguro = valorDoSeguro;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public String getOutrasDespesasAcessorios() {
        return outrasDespesasAcessorios;
    }

    public void setOutrasDespesasAcessorios(String outrasDespesasAcessorios) {
        this.outrasDespesasAcessorios = outrasDespesasAcessorios;
    }

    public String getValorDoIpi() {
        return valorDoIpi;
    }

    public void setValorDoIpi(String valorDoIpi) {
        this.valorDoIpi = valorDoIpi;
    }

    public String getValorTotalDaNota() {
        return valorTotalDaNota;
    }

    public void setValorTotalDaNota(String valorTotalDaNota) {
        this.valorTotalDaNota = valorTotalDaNota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notas_Fiscais)) return false;

        Notas_Fiscais that = (Notas_Fiscais) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public String toString() {
        return "Notas_Fiscais{" +
                "id=" + id +
                ", naturalidadeDaOperacao='" + naturalidadeDaOperacao + '\'' +
                ", inscricaoEstatual=" + inscricaoEstatual +
                ", inscEstatualDoSubstTibutareo=" + inscEstatualDoSubstTibutareo +
                ", cnpj='" + cnpj + '\'' +
                ", dataEmisao=" + dataEmisao +
                ", dataSaida=" + dataSaida +
                ", baseDeCalculoIcms='" + baseDeCalculoIcms + '\'' +
                ", valorIcms='" + valorIcms + '\'' +
                ", baseDeCalculoDoIcmsSt='" + baseDeCalculoDoIcmsSt + '\'' +
                ", valorIcmsSt='" + valorIcmsSt + '\'' +
                ", valorAproximadoDosTributos='" + valorAproximadoDosTributos + '\'' +
                ", valorTotalDosProdutos='" + valorTotalDosProdutos + '\'' +
                ", valorDoFrete='" + valorDoFrete + '\'' +
                ", valorDoSeguro='" + valorDoSeguro + '\'' +
                ", desconto='" + desconto + '\'' +
                ", outrasDespesasAcessorios='" + outrasDespesasAcessorios + '\'' +
                ", valorDoIpi='" + valorDoIpi + '\'' +
                ", valorTotalDaNota='" + valorTotalDaNota + '\'' +
                '}';
    }
}
