package br.com.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import br.com.bakery.model.Usuario;
import br.com.bakery.repository.UsuarioRepository;

@Service
@ComponentScan(basePackages= {"br.com.bakery.service"})
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public ArrayList<Usuario> findAll() {
	    return (ArrayList<Usuario>) repository.findAll();
    }

    @Override
	public Usuario findById(Integer id) {
    	return repository.findOne(id);
	}

    @Override
	public Usuario login(String usuario, String senha) {
    	return repository.logon(usuario, senha);
	}

    @Override
	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}
	
    @Override
	public Usuario update(Usuario usuario) {
		repository.save(usuario);
		return usuario;
	}
	
    @Override
	public void delete(Integer id){
		Usuario usuario= repository.findOne(id);
		if (usuario != null)
			repository.delete(usuario);
	}

}
