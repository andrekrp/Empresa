package com.serasa.empresa.service;

import com.serasa.empresa.model.Notas_Fiscais;
import com.serasa.empresa.repository.NotaFicalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotaFiscalService {
    @Autowired
    private NotaFicalRepository repository;

    public Notas_Fiscais alterarNotaFiscal(Long id, Notas_Fiscais notas_fiscais) {

        Notas_Fiscais notaFicalAlterada = pesquisaNotaFiscal(id);

        BeanUtils.copyProperties(notas_fiscais, notaFicalAlterada, "id");

        return repository.save(notaFicalAlterada);
    }

    private Notas_Fiscais pesquisaNotaFiscal(Long id) {
        Optional<Notas_Fiscais> optional = repository.findById(id);
        if (!optional.isPresent()) {

            throw new EmptyResultDataAccessException(1);
        }
        Notas_Fiscais notaFiscalPesquisada = optional.get();

        return notaFiscalPesquisada;
    }
}
