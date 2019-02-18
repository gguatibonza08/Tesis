/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.services.IDepartamentoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoController {

	@Autowired
	private IDepartamentoService departamentoService;

	@GetMapping(value = "/listar")
	public List<Departamento> listar() {
		return departamentoService.findAll();
	}

}
