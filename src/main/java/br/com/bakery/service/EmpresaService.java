package br.com.bakery.service;

import java.util.ArrayList;

import br.com.bakery.model.Empresa;

public interface EmpresaService {

    ArrayList<Empresa> findAll();

    Empresa findById(Integer id);

    Empresa save(Empresa empresa);

	Empresa update(Empresa empresa);

	void delete(Integer id);

}
