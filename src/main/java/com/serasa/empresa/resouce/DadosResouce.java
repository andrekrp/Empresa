package com.serasa.empresa.resouce;

import com.serasa.empresa.model.DadosContabeis;
import com.serasa.empresa.repository.DadosContabeisRepository;
import com.serasa.empresa.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dados")
public class DadosResouce {

    @Autowired
    DadosContabeisRepository dadosContabeisRepository;

    @Autowired
    DadosService service;

    @GetMapping
    public List<DadosContabeis> listagemDeDados() {
        return dadosContabeisRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosContabeis> listagemDeDadosPorId(@PathVariable Long id) {
        Optional<DadosContabeis> optional = dadosContabeisRepository.findById(id);

        return optional.isPresent() ? ResponseEntity.ok(optional.get())
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        dadosContabeisRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadosContabeis> alterar(@PathVariable Long id, @RequestBody DadosContabeis dadosContabeis) {
        return ResponseEntity.ok(service.alterarDados(id, dadosContabeis));
    }

    @PostMapping
    @ResponseStatus( HttpStatus.CREATED)
    public void novosDados(@RequestBody DadosContabeis dadosContabeis, HttpServletResponse response) {

        DadosContabeis dadosCriados = dadosContabeisRepository.save(dadosContabeis);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(dadosContabeis.getId()).toUri();

        response.setHeader("Location", uri.toASCIIString());
    }

}
