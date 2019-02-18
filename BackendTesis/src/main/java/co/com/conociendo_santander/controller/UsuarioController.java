/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.services.IUsuarioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping(value = "/listar")
	public List<Usuario> listar() {
		return usuarioService.findAll();
	}

}
