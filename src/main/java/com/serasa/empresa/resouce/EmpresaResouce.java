package com.serasa.empresa.resouce;

import com.serasa.empresa.model.Empresa;
import com.serasa.empresa.repository.EmpresaRepository;
import com.serasa.empresa.service.EmpresaService;
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
@RequestMapping("/empresa")
public class EmpresaResouce{
	@Autowired
EmpresaRepository repositorio;

@Autowired
EmpresaService service;

@GetMapping
public List<Empresa> listagemDeEmpresas() {
	return repositorio.findAll();
}

	@GetMapping("/{id}")
	public ResponseEntity<Empresa> listagemDeForncedoresPorId(@PathVariable Long id) {
		Optional<Empresa> optional = repositorio.findById(id);

		return optional.isPresent() ? ResponseEntity.ok(optional.get())
				: ResponseEntity.notFound().build();
	}

@DeleteMapping("/{id}")
public void excluir(@PathVariable Long id) {
	repositorio.deleteById(id);
}

@PutMapping("/{id}")
public ResponseEntity<Empresa> alterar(@PathVariable Long id, @RequestBody Empresa empresa) {
	return ResponseEntity.ok(service.alterarEmpresa(id, empresa));
}

@PostMapping
@ResponseStatus( HttpStatus.CREATED)
public void novoFornecedor(@RequestBody Empresa empresa, HttpServletResponse response) {

	Empresa empresaCriada = repositorio.save(empresa);

	URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
			.buildAndExpand(empresaCriada.getId()).toUri();

	response.setHeader("Location", uri.toASCIIString());
}

}
