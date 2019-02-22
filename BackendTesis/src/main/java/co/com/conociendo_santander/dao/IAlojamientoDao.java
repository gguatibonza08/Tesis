/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Alojamiento;
import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IAlojamientoDao extends CrudRepository<Alojamiento, Long> {

	public List<Alojamiento> findByMunicipio(Municipio municipio);

}
