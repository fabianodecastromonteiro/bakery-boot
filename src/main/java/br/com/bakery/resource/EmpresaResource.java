package br.com.bakery.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bakery.service.EmpresaService;
import br.com.bakery.model.Empresa;

@Component
@RestController
public class EmpresaResource {
	
	@Autowired
	private EmpresaService service;

	@GetMapping("/companies")
	public List<Empresa> getAll() {
	    return service.findAll();
	}
	
	@GetMapping("/company/{id}")
	public ResponseEntity<Void> getById(@PathVariable int id) {
		Empresa empresa = service.findById(id);
		if (empresa == null) 	
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}

	@PostMapping("/company")
	public Empresa create(@Valid @RequestBody Empresa empresa) {
	    return service.save(empresa);
	}
	
	@PutMapping("/company/{id}")
	public ResponseEntity<Void> update(@RequestBody Empresa empresa) {
		Empresa empresaAlterado = service.update(empresa);
		if (empresaAlterado == null)
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service.delete(id);
	}
	
}