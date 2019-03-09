/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.services.ILogroObjetivoService;
import co.com.conociendo_santander.services.ILogroService;
import co.com.conociendo_santander.services.IObjetivoService;
import co.com.conociendo_santander.util.responses.RespuestaRest;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/objetivosDelLogro")
public class LogroObjetivoController {

	@Autowired
	private ILogroObjetivoService logroObjetivoService;

	@Autowired
	private ILogroService logroService;

	@Autowired
	private IObjetivoService objetivoService;

	@Transactional(readOnly = true)
	@GetMapping(value = "/listar/logro/{id}")
	public List<LogroObjetivo> finByLogro(@PathVariable Long id) {

		if (logroService.existId(id)) {
			Logro logro = logroService.findById(id);
			return logroObjetivoService.findByLogro(logro);
		} else {
			return null;
		}

	}

	@Transactional
	@GetMapping(value = "/actualizar/logro/objetivo/{idLogro}/{idObjetivo}")
	public RespuestaRest updateLogroObjetivo(@PathVariable Long idLogro, @PathVariable Long idObjetivo) {

		if (logroService.existId(idLogro) && objetivoService.existId(idObjetivo)) {

			Logro logro = logroService.findById(idLogro);
			Objetivo objetivo = objetivoService.findById(idObjetivo);
			LogroObjetivo update = logroObjetivoService.findByLogroAndObjetivo(logro, objetivo);
			logroObjetivoService.save(update);

			return new RespuestaRest(HttpStatus.OK.value(), "Estado del objetivo Completado");

		} else {
			return new RespuestaRest(HttpStatus.CONFLICT.value(), "Estado del objetivo no completado");
		}

	}

}
