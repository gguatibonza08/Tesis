/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.services.IAvatarService;
import co.com.conociendo_santander.services.IUsuarioService;
import co.com.conociendo_santander.util.pojos.UsuarioPojo;
import co.com.conociendo_santander.util.responses.RespuestaRest;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	private BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IAvatarService avatarService;

	@GetMapping(value = "/listar")
	public List<Usuario> listar() {
		return usuarioService.findAll();
	}

	@GetMapping(value = "/buscar/{id}")
	public Usuario findById(@PathVariable Long id) {
		if (usuarioService.existId(id)) {
			return usuarioService.findById(id);
		} else {
			return null;
		}
	}

	// Método para crear un suario
	@PostMapping(value = "/guardar")
	public RespuestaRest saveUsuario(@RequestBody UsuarioPojo usuarioPojo) {

		if (avatarService.existById(usuarioPojo.getIdAvatar())) {

			if (usuarioService.findByCorreoOrApodo(usuarioPojo.getCorreo(), usuarioPojo.getApodo())) {
				String contrasena = passwordEncryptor.encryptPassword(usuarioPojo.getContrasena());
				Usuario usuarioPerist = new Usuario();
				usuarioPerist.setNombre(usuarioPojo.getNombre());
				usuarioPerist.setApellido(usuarioPojo.getApellido());
				usuarioPerist.setCorreo(usuarioPojo.getCorreo());
				usuarioPerist.setContrasena(contrasena);
				usuarioPerist.setApodo(usuarioPojo.getApodo());
				usuarioPerist.setTelefono(usuarioPojo.getTelefono());
				usuarioPerist.setAvatar(avatarService.findById(usuarioPojo.getIdAvatar()));
				usuarioService.save(usuarioPerist);
				return new RespuestaRest(HttpStatus.CREATED.value(), "Completado");
			} else {
				return new RespuestaRest(HttpStatus.CONFLICT.value(), "Ya existe este usuario");
			}
		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "El avatar escogido no existe");
		}
	}

	// Metodo para eliminar usuario
	@DeleteMapping(value = "/eliminar/{id}")
	public RespuestaRest delete(@PathVariable Long id) {
		if (usuarioService.existId(id)) {
			usuarioService.delete(id);
			return new RespuestaRest(HttpStatus.OK.value(), "Usuario eliminado");
		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "No se pudo eliminar el usuario");
		}
	}

	// Método para actualizar un usuario
	@PostMapping(value = "/actualizar")
	public RespuestaRest updateUsuario(@RequestBody UsuarioPojo usuarioPojo) {
		Usuario usuarioModificado = usuarioService.findById(usuarioPojo.getId());
		usuarioModificado.setNombre(usuarioPojo.getNombre());
		usuarioModificado.setApellido(usuarioPojo.getApellido());
		usuarioModificado.setCorreo(usuarioPojo.getCorreo());
		usuarioModificado.setContrasena(usuarioPojo.getContrasena());
		usuarioModificado.setApodo(usuarioPojo.getApodo());
		usuarioModificado.setTelefono(usuarioPojo.getTelefono());
		usuarioModificado.setAvatar(avatarService.findById(usuarioPojo.getIdAvatar()));
		usuarioService.save(usuarioModificado);
		return new RespuestaRest(HttpStatus.OK.value(), "Usuario modificado");
	}
}
