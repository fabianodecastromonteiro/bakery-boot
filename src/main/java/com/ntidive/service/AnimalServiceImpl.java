package com.ntidive.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ntidive.model.Animal;
import com.ntidive.repository.AnimalRepository;

@Service
@ComponentScan(basePackages= {"com.ntidive.service"})
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository repository;

    @Override
    public ArrayList<Animal> findAll() {
	    return (ArrayList<Animal>) repository.findAll();
    }

    @Override
	public Animal findById(Integer id) {
    	return repository.findOne(id);
	}

    @Override
	public Animal save(Animal animal) {
		return repository.save(animal);
	}
	
    @Override
	public Animal update(Animal animal) {
		repository.save(animal);
		return animal;
	}
	
    @Override
	public void delete(Integer id){
		Animal animal = repository.findOne(id);
		if (animal != null)
			repository.delete(animal);
	}

}
