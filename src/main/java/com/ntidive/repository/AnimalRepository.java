package com.ntidive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ntidive.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

	@Query("SELECT a FROM Animal a WHERE a.idFicha = :idFicha")
    List<Animal> findAllByIdFicha(@Param("idFicha") int idFicha);

}
