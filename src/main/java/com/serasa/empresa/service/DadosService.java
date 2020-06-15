package com.serasa.empresa.service;

import com.serasa.empresa.model.DadosContabeis;
import com.serasa.empresa.repository.DadosContabeisRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DadosService {

    @Autowired
    private DadosContabeisRepository dadosContabeisRepository;

    public DadosContabeis alterarDados(Long id, DadosContabeis dadosContabeis) {

        DadosContabeis dadosAlterados = pesquisaDados(id);

        BeanUtils.copyProperties(dadosContabeis, dadosAlterados, "id");

        return dadosContabeisRepository.save(dadosAlterados);
    }

    private DadosContabeis pesquisaDados(Long id) {
        Optional<DadosContabeis> optional = dadosContabeisRepository.findById(id);
        if (!optional.isPresent()) {

            throw new EmptyResultDataAccessException(1);
        }
        DadosContabeis dadosPesquisados = optional.get();

        return dadosPesquisados;
    }
}
