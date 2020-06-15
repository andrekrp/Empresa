package com.serasa.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DadosContabeis implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer mes;
    private Integer ano;
    private Integer quantidadeNotasFiscais;
    private Integer quantidadeDebitos;


    public DadosContabeis(){

    }

    public DadosContabeis(long id, Integer mes, Integer ano, Integer quantidadeNotasFiscais, Integer quantidadeDebitos) {
        super();
        this.id = id;
        this.mes = mes;
        this.ano = ano;
        this.quantidadeNotasFiscais = quantidadeNotasFiscais;
        this.quantidadeDebitos = quantidadeDebitos;
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

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getQuantidadeNotasFiscais() {
        return quantidadeNotasFiscais;
    }

    public void setQuantidadeNotasFiscais(Integer quantidadeNotasFiscais) {
        this.quantidadeNotasFiscais = quantidadeNotasFiscais;
    }

    public Integer getQuantidadeDebitos() {
        return quantidadeDebitos;
    }

    public void setQuantidadeDebitos(Integer quantidadeDebitos) {
        this.quantidadeDebitos = quantidadeDebitos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DadosContabeis)) return false;

        DadosContabeis that = (DadosContabeis) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public String   toString() {
        return "DadosContabeis{" +
                "id=" + id +
                ", mes=" + mes +
                ", ano=" + ano +
                ", quantidadeNotasFiscais=" + quantidadeNotasFiscais +
                ", quantidadeDebitos=" + quantidadeDebitos +
                '}';
    }
}


