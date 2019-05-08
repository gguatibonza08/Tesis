/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Atractivo;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IAtractivoService;
import co.com.conociendo_santander.services.IMunicipioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/atractivos")
public class AtractivoController {

	@Autowired
	private IAtractivoService atractivoService;

	@Autowired
	private IMunicipioService municipioService;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/municipio/{id}")
	public List<Atractivo> findByMunicipio(@PathVariable Long id) {
		if (municipioService.existId(id)) {
			Municipio municipio = municipioService.findById(id);
			return atractivoService.findByMunicipio(municipio);
		} else {
			return null;
		}
	}

}
