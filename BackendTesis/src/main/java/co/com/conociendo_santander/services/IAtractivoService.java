/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Atractivo;
import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IAtractivoService {

	public List<Atractivo> findAll();

	public List<Atractivo> findByMunicipio(Municipio municipio);

}
