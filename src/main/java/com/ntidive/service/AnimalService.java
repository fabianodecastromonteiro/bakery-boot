package com.ntidive.service;

import java.util.ArrayList;

import com.ntidive.model.Animal;

public interface AnimalService {

    ArrayList<Animal> findAll();

    Animal findById(Integer id);

    Animal save(Animal animal);

	Animal update(Animal animal);

	void delete(Integer id);

}
