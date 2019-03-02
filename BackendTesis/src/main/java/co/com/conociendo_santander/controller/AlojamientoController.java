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

import co.com.conociendo_santander.entities.Alojamiento;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IAlojamientoService;
import co.com.conociendo_santander.services.IMunicipioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/alojamientos")
public class AlojamientoController {

	@Autowired
	private IAlojamientoService alojamientoService;

	@Autowired
	private IMunicipioService municipioService;

	@GetMapping(value = "/listar/municipio/{id}")
	public List<Alojamiento> listar(@PathVariable Long id) {
		if (municipioService.existId(id)) {
			Municipio municipio = municipioService.findById(id);
			return alojamientoService.findByMunicipio(municipio);
		} else {
			return null;
		}
	}

}
