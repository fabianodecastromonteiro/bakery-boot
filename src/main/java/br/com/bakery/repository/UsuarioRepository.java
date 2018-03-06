package br.com.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bakery.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario")
    Usuario findByEmailReturnStream(@Param("usuario") String email);

	@Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha")
    Usuario logon(@Param("usuario") String usuario, @Param("senha") String senha);

}
