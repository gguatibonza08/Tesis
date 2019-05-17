package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.entities.UsuarioMunicipio;
import co.com.conociendo_santander.services.ILogroService;
import co.com.conociendo_santander.services.IMunicipioService;
import co.com.conociendo_santander.services.IUsuarioLogroService;
import co.com.conociendo_santander.services.IUsuarioMunicipioService;
import co.com.conociendo_santander.services.IUsuarioService;
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
	private ILogroService iLogroService;

	@Autowired
	private IUsuarioLogroService iUsuarioLogro;

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

	@GetMapping(value = "/save/{idUsuario}/{idMunicipio}")
	public int saveMunicipio(@PathVariable String idUsuario, @PathVariable String idMunicipio) {
		System.out.println("idUsuario: " + idUsuario + " <-> idMUnicipio: " + idMunicipio);
		if (!idUsuario.contains("NULL")) {
			Municipio municipio = iMunicipioService.findById(Long.parseLong(idMunicipio));
			boolean bandera = iUsuarioMunicipio.findByMunicipio(municipio);
			if (bandera) {
				Usuario usuario = iUsuarioService.findById(Long.parseLong(idUsuario));
				UsuarioMunicipio persist = new UsuarioMunicipio();
				persist.setUsuario(usuario);
				persist.setMunicipio(municipio);
				iUsuarioMunicipio.save(persist);
				validarLogro(usuario);
				return 200;
			} else {
				return 100;
			}
		} else {
			return 100;
		}

	}

	private void validarLogro(Usuario usuario) {
		// TODO Auto-generated method stub
		int municipios = iUsuarioMunicipio.findByUsuario(usuario).size();
		Logro logro;
		UsuarioLogro persist;
		switch (municipios) {
		case 10:
			logro = iLogroService.findById(new Long(4));
			persist = new UsuarioLogro(usuario, logro);
			iUsuarioLogro.save(persist);
			break;
		case 27:
			logro = iLogroService.findById(new Long(5));
			persist = new UsuarioLogro(usuario, logro);
			iUsuarioLogro.save(persist);
			break;
		case 52:
			logro = iLogroService.findById(new Long(6));
			persist = new UsuarioLogro(usuario, logro);
			iUsuarioLogro.save(persist);
			break;
		case 87:
			logro = iLogroService.findById(new Long(7));
			persist = new UsuarioLogro(usuario, logro);
			iUsuarioLogro.save(persist);
			break;

		default:
			System.out.println("Aún no se puede agregar un logro");
			break;
		}
	}

}
