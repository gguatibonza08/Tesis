package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioObjetivo;
import co.com.conociendo_santander.services.IObjetivoService;
import co.com.conociendo_santander.services.IUsuarioObjetivoService;
import co.com.conociendo_santander.services.IUsuarioService;
import co.com.conociendo_santander.util.responses.RespuestaRest;

@RestController
@RequestMapping(name = "/objetivosDelUsuario")
public class UsuarioObjetivoController {
	
	@Autowired
	private IUsuarioObjetivoService usuarioObjetivoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IObjetivoService objetivoService;
	
	
	//Método para actualizar el estado?
	@GetMapping(value = "/actualizar/usuario/objetivo/{idUsuario}/{idObjetivo}")
	public RespuestaRest updateUsuarioObjetivo(@PathVariable Long idUsuario, @PathVariable Long idObjetivo) {
		if(usuarioService.existId(idUsuario) && objetivoService.existId(idObjetivo)) {
			Usuario usuario = usuarioService.findById(idUsuario);
			Objetivo objetivo = objetivoService.findById(idObjetivo);
			UsuarioObjetivo usuarioObjetivo = usuarioObjetivoService.findByUsuarioAndObjetivo(usuario, objetivo);
			usuarioObjetivo.setEstado(2);
			usuarioObjetivoService.save(usuarioObjetivo);
			return new RespuestaRest(HttpStatus.OK.value(), "usuario objetivo modificado");
		}else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "usuario objetivo no modificado");
		}
	}
}
