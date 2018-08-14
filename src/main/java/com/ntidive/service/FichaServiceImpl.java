package com.ntidive.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ntidive.model.Ficha;
import com.ntidive.repository.FichaRepository;

@Service
@ComponentScan(basePackages= {"com.ntidive.service"})
public class FichaServiceImpl implements FichaService {

    @Autowired
    private FichaRepository repository;

    @Override
    public ArrayList<Ficha> findAll() {
	    return (ArrayList<Ficha>) repository.findAll();
    }

    @Override
	public Ficha findById(Integer id) {
    	return repository.findOne(id);
	}

    @Override
	public Ficha save(Ficha ficha) {
		return repository.save(ficha);
	}
	
    @Override
	public Ficha update(Ficha ficha) {
		repository.save(ficha);
		return ficha;
	}
	
    @Override
	public void delete(Integer id){
		Ficha ficha = repository.findOne(id);
		if (ficha != null)
			repository.delete(ficha);
	}

    @Override
    public ArrayList<Ficha> fichasById(int filterId) {
    	ArrayList<Ficha> result = new ArrayList<Ficha>();
    	if (!"".equals(filterId)) {
       		result = (ArrayList<Ficha>) repository.findAllById(filterId);
    	}
    	return result;
    }

    @Override
    public ArrayList<Ficha> fichasByFilter(int filterId, Date filterDtCadastro) {
    	ArrayList<Ficha> result = new ArrayList<Ficha>();
    	if (!"".equals(filterId) && !"".equals(filterDtCadastro)) {
    		result = (ArrayList<Ficha>) repository.findAllByFilters(filterId, filterDtCadastro);
    	} else if (!"".equals(filterId)) {
       		result = (ArrayList<Ficha>) repository.findAllById(filterId);
       	} else if (!"".equals(filterDtCadastro)) {
       		result = (ArrayList<Ficha>) repository.findAllByDataCadastro(filterDtCadastro);
    	}
    	return result;
    }

}
