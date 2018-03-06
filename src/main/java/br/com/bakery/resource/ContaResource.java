package br.com.bakery.resource;

import java.util.ArrayList;
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

import br.com.bakery.model.Conta;
import br.com.bakery.service.ContaService;

@Component
@RestController
public class ContaResource {
	
	@Autowired
	private ContaService service;

	@GetMapping("/accounts")
	public List<Conta> getAll() {
	    return service.findAll();
	}
	
	@GetMapping("/account/{id}")
	public ResponseEntity<Void> getById(@PathVariable int id) {
		Conta conta = service.findById(id);
		if (conta == null) 	
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}

	@GetMapping("/accountsByCompany/{companyId}")
	public List<Conta> GetContaPorEmpresa(@PathVariable("companyId") int companyId) {
		return getContaViewByEmpresaViewList(companyId);
	}

	@PostMapping("/account")
	public Conta create(@Valid @RequestBody Conta conta) {
	    return service.save(conta);
	}
	
	@PutMapping("/account/{id}")
	public ResponseEntity<Void> update(@RequestBody Conta conta) {
		Conta contaAlterado = service.update(conta);
		if (contaAlterado == null)
	        return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/account/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service.delete(id);
	}
	
	private List<Conta> getContaViewByEmpresaViewList(int companyId) {
		List<Conta> contasPorEmpresa = new ArrayList<Conta>();
		List<Conta> contas = service.findAll();
		for (Conta conta : contas) {
			if (conta.getEmpresa().getId() == companyId) {
				contasPorEmpresa.add(conta);
			}
		}
		return contasPorEmpresa;
	}

}