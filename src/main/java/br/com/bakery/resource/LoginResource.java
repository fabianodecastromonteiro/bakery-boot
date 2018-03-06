package br.com.bakery.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bakery.model.Login;
import br.com.bakery.model.Usuario;
import br.com.bakery.service.UsuarioService;

@Component
@RestController
public class LoginResource {
	
	@Autowired
	private UsuarioService service;

	@PostMapping("/login")
	public Usuario login(@Valid @RequestBody Login login) {
	    return service.login(login.getUsuario(), login.getSenha());
	}
	
}