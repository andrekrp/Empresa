package com.serasa.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String razaoSocial;
	private String emdereco;
	private Integer numero;
	private String bairro;
	private String telefone;
	private Date dataCadastro;

      public  Empresa (){

	  }
	
	
	public Empresa(long id, String razaoSocial, String emdereco, Integer numero, String bairro, String telefone,
			Date dataCadastro) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.emdereco = emdereco;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
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

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmdereco() {
		return emdereco;
	}

	public void setEmdereco(String emdereco) {
		this.emdereco = emdereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", emdereco=" + emdereco + ", numero=" + numero
				+ ", bairro=" + bairro + ", telefone=" + telefone + ", dataCadastro=" + dataCadastro + "]";
	}
	
	
	

}
