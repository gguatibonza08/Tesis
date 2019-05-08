/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

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

import co.com.conociendo_santander.util.pojos.FotoPojo;
import co.com.conociendo_santander.util.responses.FotoRespuesta;
import co.com.conociendo_santander.util.responses.RespuestaRest;
import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.services.IFotoService;
import co.com.conociendo_santander.services.IMunicipioService;
import co.com.conociendo_santander.services.IUsuarioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/fotos")
public class FotoController {

	@Autowired
	private IFotoService fotoService;

	@Autowired
	private IMunicipioService municipioService;

	@Autowired
	private IUsuarioService usuarioService;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/municipio/{id}")
	public List<FotoRespuesta> findByMunicipio(@PathVariable Long id) {
		if (municipioService.existId(id)) {
			Municipio municipio = municipioService.findById(id);
			List<Foto> fotos = fotoService.findByMunicipio(municipio);
			List<FotoRespuesta> respuesta = new ArrayList<FotoRespuesta>();
			for (Foto x : fotos) {
				FotoRespuesta aux = new FotoRespuesta(x.getIdFoto(), x.getUrl(),
						x.getUsuario().getNombre() + " " + x.getUsuario().getApellido(), x.getUsuario().getApodo(),
						x.getUsuario().getFoto(), x.getMunicipio().getIdMunicipio(), x.getMunicipio().getNombre());
				respuesta.add(aux);
			}
			return respuesta;
		} else {
			return null;
		}

	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/usuario/{id}")
	public List<FotoRespuesta> findByUsuario(@PathVariable Long id) {
		if (usuarioService.existId(id)) {
			Usuario usuario = usuarioService.findById(id);
			List<Foto> fotos = fotoService.findByUsuario(usuario);
			List<FotoRespuesta> respuesta = new ArrayList<FotoRespuesta>();
			for (Foto x : fotos) {
				FotoRespuesta aux = new FotoRespuesta(x.getIdFoto(), x.getUrl(),
						x.getUsuario().getNombre() + " " + x.getUsuario().getApellido(), x.getUsuario().getApodo(),
						x.getUsuario().getFoto(), x.getMunicipio().getIdMunicipio(), x.getMunicipio().getNombre());
				respuesta.add(aux);
			}
			return respuesta;
		} else {
			return null;
		}

	}

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/usuario/municipio/{idUsuario}/{idMunicipio}")
	public List<FotoRespuesta> findByUsuarioMunicipio(@PathVariable Long idUsuario, @PathVariable Long idMunicipio) {
		if (usuarioService.existId(idUsuario) && municipioService.existId(idMunicipio)) {
			Usuario usuario = usuarioService.findById(idUsuario);
			Municipio municipio = municipioService.findById(idMunicipio);
			List<Foto> fotos = fotoService.findByUsuarioAndMunicipio(usuario, municipio);
			List<FotoRespuesta> respuesta = new ArrayList<FotoRespuesta>();
			for (Foto x : fotos) {
				FotoRespuesta aux = new FotoRespuesta(x.getIdFoto(), x.getUrl(),
						x.getUsuario().getNombre() + " " + x.getUsuario().getApellido(), x.getUsuario().getApodo(),
						x.getUsuario().getFoto(), x.getMunicipio().getIdMunicipio(), x.getMunicipio().getNombre());
				respuesta.add(aux);
			}
			return respuesta;
		} else {
			return null;
		}

	}

	@Transactional
	@PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaRest addFoto(@RequestBody FotoPojo foto) {
		if (usuarioService.existId(foto.getIdUsuario()) && municipioService.existId(foto.getIdMunicipio())) {
			Usuario usuario = usuarioService.findById(foto.getIdUsuario());
			Municipio municipio = municipioService.findById(foto.getIdMunicipio());
			Foto fotoPersist = new Foto();
			fotoPersist.setUsuario(usuario);
			fotoPersist.setMunicipio(municipio);
			fotoPersist.setUrl(foto.getUrl());
			fotoService.save(fotoPersist);
			return new RespuestaRest(HttpStatus.CREATED.value(), "Se Agrego la Foto Correctamente");
		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "No se pudo Agregar la foto Correctamente");
		}

	}

	@Transactional
	@DeleteMapping(value = "/eliminar/{id}")
	public RespuestaRest delete(@PathVariable Long id) {
		if (fotoService.existId(id)) {
			fotoService.delete(id);
			return new RespuestaRest(HttpStatus.OK.value(), "Foto eliminada Correctamente");
		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "no se pudo eliminar la foto Correctamente");
		}

	}
}
