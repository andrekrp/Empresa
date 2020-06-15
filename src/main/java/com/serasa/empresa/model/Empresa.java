package com.serasa.empresa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String razaoSocial;
	private String endereco;
	private Integer numero;
	private String bairro;
	private String telefone;
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@JsonIgnore
	@ManyToOne
	@JoinColumn (name= "empresa_id")
   private  Empresa empresa;



      public  Empresa (){

	  }

	public Empresa(long id, String razaoSocial, String endereco, Integer numero, String bairro, String telefone, LocalDate dataCadastro) {
		super();
      	this.id = id;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Empresa)) return false;

		Empresa empresa = (Empresa) o;

		return getId() == empresa.getId();
	}

	@Override
	public int hashCode() {
		return (int) (getId() ^ (getId() >>> 32));
	}

	@Override
	public String toString() {
		return "Empresa{" +
				"id=" + id +
				", razaoSocial='" + razaoSocial + '\'' +
				", endereco='" + endereco + '\'' +
				", numero=" + numero +
				", bairro='" + bairro + '\'' +
				", telefone='" + telefone + '\'' +
				", dataCadastro=" + dataCadastro +
				'}';
	}
}
