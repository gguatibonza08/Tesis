/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IDepartamentoService;
import co.com.conociendo_santander.services.IMunicipioService;
import co.com.conociendo_santander.util.responses.MunicipioSimple;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/municipios")
public class MunicipioController {

	@Autowired
	private IMunicipioService municipioService;

	@Autowired
	private IDepartamentoService departamentoService;

	@GetMapping(value = "/buscar/{id}")
	public Municipio buscarPorId(@PathVariable Long id) {

		if (municipioService.existId(id)) {
			return municipioService.findById(id);

		} else {
			return null;
		}

	}

	@GetMapping(value = "/listar/departamento/{id}")
	public List<MunicipioSimple> buscarPorDepartamento(@PathVariable Long id) {

		if (departamentoService.existId(id)) {
			List<MunicipioSimple> respuesta = new ArrayList<MunicipioSimple>();
			Departamento depto = departamentoService.findById(id);

			ArrayList<Municipio> municipios = (ArrayList<Municipio>) municipioService.findByDepartamento(depto);

			for (Municipio x : municipios) {
				MunicipioSimple aux = new MunicipioSimple(x.getIdMunicipio(), x.getNombre(), x.getDescripcionBasica(),
						x.getFoto());
				respuesta.add(aux);
			}
			return respuesta;

		} else {
			return null;
		}
	}

}
