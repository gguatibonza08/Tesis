/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.services.IFotoService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/fotos")
public class FotoController {

	@Autowired
	private IFotoService fotoService;

	@GetMapping(value = "/listar")
	public List<Foto> listar() {
		return fotoService.findAll();
	}

}
