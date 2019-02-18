/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.services.IObjetivoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/objetivos")
public class ObjetivoController {

	@Autowired
	private IObjetivoService objetivoService;

	@GetMapping(value = "/listar")
	public List<Objetivo> listar() {
		return objetivoService.findAll();
	}

}
