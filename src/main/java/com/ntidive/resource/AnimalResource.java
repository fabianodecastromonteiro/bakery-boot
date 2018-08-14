package com.ntidive.resource;

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

import com.ntidive.model.Animal;
import com.ntidive.service.AnimalService;

@Component
@RestController
public class AnimalResource {
	
	@Autowired
	private AnimalService service;

	@GetMapping("/animals")
	public List<Animal> getAll() {
	    return service.findAll();
	}
	
	@GetMapping("/animal/{id}")
	public ResponseEntity<Void> getById(@PathVariable int id) {
		Animal animal = service.findById(id);
		if (animal == null) 	
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}

	@PostMapping("/animal")
	public Animal create(@Valid @RequestBody Animal animal) {
	    return service.save(animal);
	}
	
	@PutMapping("/animal/{id}")
	public ResponseEntity<Void> update(@RequestBody Animal animal) {
		Animal animalAlterado = service.update(animal);
		if (animalAlterado == null)
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/anima/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service.delete(id);
	}
	
}