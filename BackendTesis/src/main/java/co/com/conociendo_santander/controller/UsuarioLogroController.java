/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.services.IUsuarioLogroService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/LogrosDelUsuario")
public class UsuarioLogroController {

	@Autowired
	private IUsuarioLogroService usuarioService;

	@GetMapping(value = "/listar")
	public List<UsuarioLogro> listar() {
		return usuarioService.findAll();
	}

}
