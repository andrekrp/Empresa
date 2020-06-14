package com.serasa.empresa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.serasa.empresa.model.Empresa;
import com.serasa.empresa.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	public Empresa alterarEmpresa(Long id,Empresa empresa) {

		Empresa empresaAlterada = pesquisaEmpresa(id);

		BeanUtils.copyProperties(empresa, empresaAlterada, "id");

		return repository.save(empresaAlterada);
	}

	private Empresa pesquisaEmpresa(Long id) {
		Empresa empresaPesquisada = repository.findOne(id);
		if (empresaPesquisada == null) {

			throw new EmptyResultDataAccessException(1);
		}

		return empresaPesquisada;
	}
}
