/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Atractivo;
import co.com.conociendo_santander.services.IAtractivoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/atractivos")
public class AtractivoController {

	@Autowired
	private IAtractivoService atractivoService;

	@GetMapping(value = "/listar")
	public List<Atractivo> listar() {
		return atractivoService.findAll();
	}
}
