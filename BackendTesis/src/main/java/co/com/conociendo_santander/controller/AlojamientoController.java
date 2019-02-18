/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Alojamiento;
import co.com.conociendo_santander.services.IAlojamientoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/alojamientos")
public class AlojamientoController {

	@Autowired
	private IAlojamientoService alojamientoService;

	@GetMapping(value = "/listar")
	public List<Alojamiento> listar() {
		return alojamientoService.findAll();
	}

}
