package com.ntidive.resource;

import java.util.Date;
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

import com.ntidive.model.Ficha;
import com.ntidive.service.FichaService;

@Component
@RestController
public class FichaResource {
	
	@Autowired
	private FichaService service;

	@GetMapping("/forms")
	public List<Ficha> getAll() {
	    return service.findAll();
	}
	
	@GetMapping("/formsById/{id}")
	public List<Ficha> getAllById(@PathVariable int id) {
		return service.fichasById(id);
	}
	
	@GetMapping("/formsByFilters")
	public List<Ficha> getAllByFilter(@RequestBody int id, @RequestBody Date dtCadastro) {
		return service.fichasByFilter(id, dtCadastro);
	}
	
	@GetMapping("/form/{id}")
	public ResponseEntity<Void> getById(@PathVariable int id) {
		Ficha ficha = service.findById(id);
		if (ficha == null) 	
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}

	@PostMapping("/form")
	public Ficha create(@Valid @RequestBody Ficha ficha) {
	    return service.save(ficha);
	}
	
	@PutMapping("/form/{id}")
	public ResponseEntity<Void> update(@RequestBody Ficha ficha) {
		Ficha fichaAlterada = service.update(ficha);
		if (fichaAlterada == null)
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/form/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service.delete(id);
	}
	
}