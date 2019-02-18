/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Restaurante;
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

	@GetMapping(value = "/listar")
	public List<Restaurante> listar() {
		return restauranteService.findAll();
	}

}
