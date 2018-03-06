package br.com.bakery.service;

import java.util.List;

import br.com.bakery.model.Conta;

public interface ContaService {

    List<Conta> findAll();

    Conta findById(Integer id);

    Conta save(Conta conta);

	Conta update(Conta conta);

	void delete(Integer id);

}
