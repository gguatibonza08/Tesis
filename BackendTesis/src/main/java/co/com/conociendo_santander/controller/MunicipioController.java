/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IMunicipioService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/municipios")
public class MunicipioController {

	@Autowired
	private IMunicipioService municipioService;

	@GetMapping(value = "/listar")
	public List<Municipio> listar() {
		return municipioService.findAll();
	}

}
