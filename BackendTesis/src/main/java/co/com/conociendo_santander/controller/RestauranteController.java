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

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Restaurante;
import co.com.conociendo_santander.services.IMunicipioService;
import co.com.conociendo_santander.services.IRestauranteService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteController {

	@Autowired
	private IRestauranteService restauranteService;

	@Autowired
	private IMunicipioService municipioService;

	@GetMapping(value = "/listar")
	public List<Restaurante> listar() {
		return restauranteService.findAll();
	}

	@GetMapping(value = "/listar/municipio/{id}")
	public List<Restaurante> findByMunicipio(@PathVariable Long id) {

		if (municipioService.existId(id)) {

			Municipio municipio = municipioService.findById(id);
			return restauranteService.findByMunicipio(municipio);
		} else {
			return null;
		}

	}

}
