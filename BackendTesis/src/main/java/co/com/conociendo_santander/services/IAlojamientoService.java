/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Alojamiento;
import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IAlojamientoService {

	public List<Alojamiento> findAll();
	
	public List<Alojamiento> findByMunicipio(Municipio municipio);

}
