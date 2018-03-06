package br.com.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bakery.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
}


