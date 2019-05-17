/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.entities.UsuarioObjetivo;
import co.com.conociendo_santander.services.ILogroService;
import co.com.conociendo_santander.services.IObjetivoService;
import co.com.conociendo_santander.services.IUsuarioLogroService;
import co.com.conociendo_santander.services.IUsuarioObjetivoService;
import co.com.conociendo_santander.services.IUsuarioService;
import co.com.conociendo_santander.util.pojos.LoginPojo;
import co.com.conociendo_santander.util.pojos.UsuarioPojo;
import co.com.conociendo_santander.util.responses.LoginRespuesta;
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
	private ILogroService logroService;

	@Autowired
	private IObjetivoService objetivoService;

	@Autowired
	private IUsuarioLogroService usuarioLogroService;

	@Autowired
	private IUsuarioObjetivoService usuarioObjetivoService;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar")
	public List<Usuario> listar() {
		return usuarioService.findAll();
	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/buscar/{id}")
	public Usuario findById(@PathVariable Long id) {
		if (usuarioService.existId(id)) {
			return usuarioService.findById(id);
		} else {
			return null;
		}
	}

	// Método para crear un suario
	@PostMapping(value = "/guardar/google", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public LoginRespuesta saveUsuarioGoogle(UsuarioPojo usuarioPojo) {
		if (usuarioService.findByCorreoOrApodo(usuarioPojo.getCorreo(), usuarioPojo.getApodo())) {
			Usuario usuarioPerist = new Usuario();
			usuarioPerist.setNombre(usuarioPojo.getNombre());
			usuarioPerist.setApellido(usuarioPojo.getApellido());
			usuarioPerist.setCorreo(usuarioPojo.getCorreo());
			usuarioPerist.setContrasena(usuarioPojo.getContrasena());
			int random = (int) (Math.random() * 8999 + 1001);
			usuarioPerist.setApodo(usuarioPojo.getNombre().substring(0, usuarioPojo.getNombre().indexOf(" ")) + random);
			usuarioPerist.setTelefono(usuarioPojo.getTelefono());
			usuarioPerist.setFoto(usuarioPojo.getFoto());
			usuarioService.save(usuarioPerist);
			for (Logro logro : logroService.findAll()) {
				usuarioLogroService.save(new UsuarioLogro(usuarioPerist, logro));
			}

			for (Objetivo objetivo : objetivoService.findAll()) {
				usuarioObjetivoService.save(new UsuarioObjetivo(usuarioPerist, objetivo));
			}
			System.out.println(usuarioPerist.getIdUsuario());
			return new LoginRespuesta(HttpStatus.CREATED.value(), "Completado", usuarioPerist);
		} else {
			return new LoginRespuesta(HttpStatus.CONFLICT.value(), "Ya existe este usuario", null);
		}
	}

	//
	// Método para crear un suario
	@PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RespuestaRest saveUsuario(UsuarioPojo usuarioPojo) {
		System.out.println(usuarioPojo.getApodo() + " : " + usuarioPojo.getCorreo());
		if (usuarioService.findByCorreoOrApodo(usuarioPojo.getCorreo(), usuarioPojo.getApodo())) {
			String contrasena = passwordEncryptor.encryptPassword(usuarioPojo.getContrasena());
			Usuario usuarioPerist = new Usuario();
			usuarioPerist.setNombre(usuarioPojo.getNombre());
			usuarioPerist.setApellido(usuarioPojo.getApellido());
			usuarioPerist.setCorreo(usuarioPojo.getCorreo());
			usuarioPerist.setContrasena(contrasena);
			usuarioPerist.setApodo(usuarioPojo.getApodo());
			usuarioPerist.setTelefono(usuarioPojo.getTelefono());
			usuarioPerist.setFoto(usuarioPojo.getFoto());
			usuarioService.save(usuarioPerist);
			for (Logro logro : logroService.findAll()) {
				usuarioLogroService.save(new UsuarioLogro(usuarioPerist, logro));
			}

			for (Objetivo objetivo : objetivoService.findAll()) {
				usuarioObjetivoService.save(new UsuarioObjetivo(usuarioPerist, objetivo));
			}
			return new RespuestaRest(HttpStatus.CREATED.value(), "Completado");
		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "Ya existe este usuario");
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

	// metodo para validar si el usuario ya existe
	@Transactional(readOnly = true)
	@GetMapping(value = "/buscar/email/{email}")
	public LoginRespuesta findByEmail(@PathVariable String email) {
		Usuario usuario = usuarioService.findByCorreo(email);
		if (usuario != null) {
			return new LoginRespuesta(HttpStatus.OK.value(), "LOGUEADO", usuario);
		} else {
			return new LoginRespuesta(HttpStatus.NOT_FOUND.value(), "USUARIO NO EXISTE", null);
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
		usuarioModificado.setFoto(usuarioPojo.getFoto());
		usuarioService.save(usuarioModificado);
		return new RespuestaRest(HttpStatus.OK.value(), "Usuario modificado");
	}

	// Método para logueo
	@PostMapping(value = "/loguear", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public LoginRespuesta LoginUsuario(LoginPojo loginPojo) {
		Usuario usuario = usuarioService.findByCorreo(loginPojo.getCorreo());
		if (usuario != null) {
			boolean result = passwordEncryptor.checkPassword(loginPojo.getContrasena(), usuario.getContrasena());
			if (result) {
				return new LoginRespuesta(HttpStatus.OK.value(), "LOGUEADO", usuario);
			} else {
				return new LoginRespuesta(HttpStatus.NOT_FOUND.value(), "CONTRASEÑA INCORRECTA", null);
			}
		} else {
			return new LoginRespuesta(405, "CORREO NO ENCONTRADO", null);
		}
	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/prueba/{idUsuario}/{idMunicipio}")
	public void pruebaUnity(@PathVariable String idUsuario, @PathVariable String idMunicipio) {
		System.out.println("llego al metodo de prueba -> " + idUsuario + " : " + idMunicipio);
		System.out.println("OK");

	}

}
