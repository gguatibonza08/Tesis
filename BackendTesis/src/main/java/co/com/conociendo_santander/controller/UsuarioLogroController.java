/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.entities.UsuarioObjetivo;
import co.com.conociendo_santander.services.ILogroObjetivoService;
import co.com.conociendo_santander.services.ILogroService;
import co.com.conociendo_santander.services.IUsuarioLogroService;
import co.com.conociendo_santander.services.IUsuarioObjetivoService;
import co.com.conociendo_santander.services.IUsuarioService;
import co.com.conociendo_santander.util.pojos.UsuarioLogroPojo;
import co.com.conociendo_santander.util.responses.LogroRespuesta;
import co.com.conociendo_santander.util.responses.ObjetivoResponse;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/LogrosDelUsuario")
public class UsuarioLogroController {

	@Autowired
	private IUsuarioObjetivoService usuarioObjetivo;

	@Autowired
	private IUsuarioLogroService usuarioLogroService;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private ILogroService logroService;

	@Autowired
	private ILogroObjetivoService logroObjetivo;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar")
	public List<UsuarioLogro> listar() {
		return usuarioLogroService.findAll();
	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/buscar/{id}")
	public UsuarioLogro findById(@PathVariable Long id) {
		if (usuarioLogroService.existById(id)) {
			return usuarioLogroService.findById(id);
		} else {
			return null;
		}
	}

	@PostMapping(value = "/obtenerObjetivos", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public List<ObjetivoResponse> getObjetivoLogro(UsuarioLogroPojo response) {

		Usuario usuario = usuarioService.findById(response.getIdUsuario());
		Logro logro = logroService.findById(response.getIdLogro());

		List<LogroObjetivo> logrosAndObjetivos = logroObjetivo.findByLogro(logro);
		List<ObjetivoResponse> result = new ArrayList<ObjetivoResponse>();

		for (LogroObjetivo logroObjetivo : logrosAndObjetivos) {

			UsuarioObjetivo aux = usuarioObjetivo.findByUsuarioAndObjetivo(usuario, logroObjetivo.getObjetivo());

			ObjetivoResponse persist = new ObjetivoResponse(aux.getObjetivo().getIdObjetivo(),
					aux.getObjetivo().getNombre(), aux.getObjetivo().getDescripcion());

			if (aux.getEstado() == 1) {
				persist.setCompletado(false);
			} else {
				persist.setCompletado(true);
			}
			result.add(persist);
			System.out.println(persist.toString());

		}
		return result;

	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/usuario/{id}")
	public List<LogroRespuesta> listar(@PathVariable Long id) {
		if (usuarioService.existId(id)) {
			Usuario usuario = usuarioService.findById(id);
			List<LogroRespuesta> rta = new ArrayList<LogroRespuesta>();
			List<UsuarioLogro> usuariosLogros = usuarioLogroService.findByUsuario(usuario);
			for (UsuarioLogro result : usuariosLogros) {
				LogroRespuesta aux = new LogroRespuesta(result.getLogro().getIdLogro(), result.getLogro().getNombre(),
						result.getLogro().getDescripcion());
				if (result.getEstado() == 1) {
					aux.setCompletado(false);
					aux.setFoto(result.getLogro().getDefecto());
				} else {
					aux.setCompletado(true);
					aux.setFoto(result.getLogro().getInsignia());
				}
				rta.add(aux);
			}
			return rta;
		} else {
			return null;
		}
	}
}
