package com.ntidive.service;

import java.util.ArrayList;
import java.util.Date;

import com.ntidive.model.Ficha;

public interface FichaService {

    Ficha findById(Integer id);

    Ficha save(Ficha ficha);

	Ficha update(Ficha ficha);

	void delete(Integer id);

    ArrayList<Ficha> findAll();

    ArrayList<Ficha> fichasById(int filterId);

    ArrayList<Ficha> fichasByFilter(int filterId, Date filterDtCadastro);

}
