package com.serasa.empresa.service;

import com.serasa.empresa.model.Empresa;
import com.serasa.empresa.repository.EmpresaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
		Optional<Empresa> optional = repository.findById(id);
		if (!optional.isPresent()) {

			throw new EmptyResultDataAccessException(1);
		}
		Empresa empresaPesquisada = optional.get();

		return empresaPesquisada;
	}
}
