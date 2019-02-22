
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
		System.out.println("Vamos a listar");
		return departamentoService.findAll();

	}

	@GetMapping(value = "/buscar/{id}")
	public Departamento buscarId(@PathVariable Long id) {

		if (departamentoService.existId(id)) {
			return departamentoService.findById(id);
		} else {
			return null;

		}
	}
}
