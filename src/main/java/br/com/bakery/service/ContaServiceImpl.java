package br.com.bakery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import br.com.bakery.model.Conta;
import br.com.bakery.repository.ContaRepository;

@Service
@ComponentScan(basePackages= {"br.com.bakery.service"})
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository repository;

    @Override
    public List<Conta> findAll() {
	    return repository.findAll();
    }

    @Override
	public Conta findById(Integer id) {
    	return repository.findOne(id);
	}

    @Override
	public Conta save(Conta conta) {
		return repository.save(conta);
	}
	
    @Override
	public Conta update(Conta conta) {
		repository.save(conta);
		return conta;
	}
	
    @Override
	public void delete(Integer id){
		Conta conta= repository.findOne(id);
		if (conta != null)
			repository.delete(conta);
	}

}
