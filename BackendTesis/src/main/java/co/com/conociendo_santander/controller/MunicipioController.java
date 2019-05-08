/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

	@Transactional(readOnly = true)
	@GetMapping(value = "/buscar/{id}")
	public Municipio buscarPorId(@PathVariable Long id) {

		if (municipioService.existId(id)) {
			Municipio result = municipioService.findById(id);
			result.setExtensa(result.getExtensa().replace(". ", ".\n"));
			return result;

		} else {
			return null;
		}

	}

	@GetMapping(value = "/listar/departamento/{id}")
	public List<MunicipioSimple> buscarPorDepartamento(@PathVariable Long id) {

		if (departamentoService.existId(id)) {

			Departamento depto = departamentoService.findById(id);
			List<MunicipioSimple> result = new ArrayList<MunicipioSimple>();
			List<Municipio> municipios = municipioService.findByDepartamento(depto);
			for (Municipio municipio : municipios) {
				result.add(new MunicipioSimple(municipio.getIdMunicipio(), municipio.getNombre(), municipio.getFoto(),
						municipio.getBasica()));
			}
			return result;

		} else {
			return null;
		}
	}
}
