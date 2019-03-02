/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface ILogroObjetivo extends CrudRepository<LogroObjetivo, Long> {

	public List<LogroObjetivo> findByLogro(Logro logro);

	public LogroObjetivo findByLogroAndObjetivo(Logro logro, Objetivo objetivo);
}
