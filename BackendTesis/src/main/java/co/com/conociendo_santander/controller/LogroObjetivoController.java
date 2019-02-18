/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.services.ILogroObjetivoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/objetivosDelLogro")
public class LogroObjetivoController {

	@Autowired
	private ILogroObjetivoService logroService;

	@GetMapping(value = "/listar")
	public List<LogroObjetivo> listar() {
		return logroService.findAll();
	}

}
