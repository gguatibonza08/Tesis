package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioMunicipio;
import co.com.conociendo_santander.services.IMunicipioService;
import co.com.conociendo_santander.services.IUsuarioMunicipioService;
import co.com.conociendo_santander.services.IUsuarioService;
import co.com.conociendo_santander.util.pojos.UsuarioMunicipioPojo;
import co.com.conociendo_santander.util.responses.MunicipioVisitados;

/**
 * 
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/usuariomunicipio")
public class UsuarioMunicipioController {

	@Autowired
	private IUsuarioMunicipioService iUsuarioMunicipio;

	@Autowired
	private IMunicipioService iMunicipioService;

	@Autowired
	private IUsuarioService iUsuarioService;

	@GetMapping(value = "/listar/usuario/{id}")
	public List<MunicipioVisitados> getMUnicipiosVisitados(@PathVariable Long id) {
		Usuario usuario = iUsuarioService.findById(id);
		List<UsuarioMunicipio> listUsuarioMunicipio = iUsuarioMunicipio.findByUsuario(usuario);
		List<MunicipioVisitados> result = new ArrayList<MunicipioVisitados>();
		for (UsuarioMunicipio aux : listUsuarioMunicipio) {
			result.add(new MunicipioVisitados(aux.getMunicipio().getNombre(), aux.getMunicipio().getFoto()));
		}

		return result;
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public int saveMunicipio(UsuarioMunicipioPojo usuarioMunicipio) {
		Municipio municipio = iMunicipioService.findById(usuarioMunicipio.getIdMunicipio());
		boolean bandera = iUsuarioMunicipio.findByMunicipio(municipio);
		if (bandera) {
			Usuario usuario = iUsuarioService.findById(usuarioMunicipio.getIdUsuario());
			UsuarioMunicipio persist = new UsuarioMunicipio();
			persist.setUsuario(usuario);
			persist.setMunicipio(municipio);
			iUsuarioMunicipio.save(persist);
			return 200;
		} else {
			return 100;
		}

	}

}
