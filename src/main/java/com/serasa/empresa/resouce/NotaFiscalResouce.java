package com.serasa.empresa.resouce;

import com.serasa.empresa.model.Notas_Fiscais;
import com.serasa.empresa.repository.NotaFicalRepository;
import com.serasa.empresa.service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nota")
public class NotaFiscalResouce {
    @Autowired
    NotaFicalRepository repositorio;

    @Autowired
    NotaFiscalService service;

    @GetMapping
    public List<Notas_Fiscais> listagemDeNotas() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notas_Fiscais> listagemDeNotas(@PathVariable Long id) {
        Optional<Notas_Fiscais> optional = repositorio.findById(id);

        return optional.isPresent() ? ResponseEntity.ok(optional.get())
                : ResponseEntity.notFound().build();
    }
}
