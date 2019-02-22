/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Atractivo;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IAtractivoDao extends CrudRepository<Atractivo, Long> {

	public List<Atractivo> findByMunicipio(Municipio municipio);

	public List<Atractivo> findByRuta(Ruta ruta);

}
