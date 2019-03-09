/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.services.IUsuarioLogroService;
import co.com.conociendo_santander.services.IUsuarioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/LogrosDelUsuario")
public class UsuarioLogroController {

	@Autowired
	private IUsuarioLogroService usuarioLogroService;
	
	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping(value = "/listar")
	public List<UsuarioLogro> listar() {
		return usuarioLogroService.findAll();
	}
	
	@GetMapping(value = "/buscar/{id}")
	public UsuarioLogro findById(@PathVariable Long id) {
		if(usuarioLogroService.existById(id)) {
			return usuarioLogroService.findById(id);
		}else {
			return null;
		}
	}
	
	@GetMapping(value = "/listar/usurio/{id}")
	public List<UsuarioLogro> listar(@PathVariable Long id){
		if(usuarioService.existId(id)) {
			Usuario usuario = usuarioService.findById(id);
			return usuarioLogroService.findByUsuario(usuario);
		}else {
			return null;
		}
	}
}
