package com.ntidive.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ntidive.model.Ficha;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {

	@Query("SELECT f FROM Ficha f ")
    List<Ficha> findAll();

	@Query("SELECT f FROM Ficha f WHERE f.id LIKE %:id%")
    List<Ficha> findAllById(@Param("id") int id);

	@Query("SELECT f FROM Ficha f WHERE f.dtCadastro = :dataCadastro")
    List<Ficha> findAllByDataCadastro(@Param("dataCadastro") Date dataCadastro);

	@Query("SELECT f FROM Ficha f WHERE f.id LIKE %:id% AND f.dtCadastro = :dataCadastro")
    List<Ficha> findAllByFilters(@Param("id") int id, @Param("dataCadastro") Date dataCadastro);

}
