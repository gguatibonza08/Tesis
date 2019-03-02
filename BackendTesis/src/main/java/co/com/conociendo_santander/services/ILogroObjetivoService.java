/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface ILogroObjetivoService {

	public void save(LogroObjetivo logro);

	public List<LogroObjetivo> findByLogro(Logro logro);

	public LogroObjetivo findByLogroAndObjetivo(Logro logro, Objetivo objetivo);

}
