package br.com.bakery.service;

import java.util.ArrayList;

import br.com.bakery.model.Usuario;

public interface UsuarioService {

    ArrayList<Usuario> findAll();

    Usuario findById(Integer id);

    Usuario login(String usuario, String senha);

    Usuario save(Usuario usuario);

	Usuario update(Usuario usuario);

	void delete(Integer id);

}
