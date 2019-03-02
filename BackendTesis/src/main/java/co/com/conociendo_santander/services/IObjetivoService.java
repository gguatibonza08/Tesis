/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface IObjetivoService {

	public List<Objetivo> findAll();

	public Objetivo findById(Long id);

	public boolean existId(Long id);

}
