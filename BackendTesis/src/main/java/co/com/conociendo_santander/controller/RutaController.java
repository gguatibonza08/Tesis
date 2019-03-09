/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Ruta;
import co.com.conociendo_santander.services.IRutaService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/rutas")
public class RutaController {

	@Autowired
	private IRutaService rutaService;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar")
	public List<Ruta> listar() {
		return rutaService.findAll();
	}

}
