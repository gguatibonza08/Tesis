/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.Implements.LogroService;
import co.com.conociendo_santander.entities.Logro;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/logros")
public class LogroController {

	@Autowired
	private LogroService logroService;

	@GetMapping(value = "/listar")
	public List<Logro> listar() {
		return logroService.findAll();
	}
}
