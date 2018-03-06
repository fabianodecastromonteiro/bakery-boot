package br.com.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import br.com.bakery.model.Empresa;
import br.com.bakery.repository.EmpresaRepository;

@Service
@ComponentScan(basePackages= {"br.com.bakery.service"})
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    @Override
    public ArrayList<Empresa> findAll() {
	    return (ArrayList<Empresa>) repository.findAll();
    }

    @Override
	public Empresa findById(Integer id) {
    	return repository.findOne(id);
	}

    @Override
	public Empresa save(Empresa empresa) {
		return repository.save(empresa);
	}
	
    @Override
	public Empresa update(Empresa empresa) {
		repository.save(empresa);
		return empresa;
	}
	
    @Override
	public void delete(Integer id){
		Empresa empresa= repository.findOne(id);
		if (empresa != null)
			repository.delete(empresa);
	}

}
