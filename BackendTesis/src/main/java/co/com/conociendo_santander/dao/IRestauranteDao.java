/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Restaurante;

/**
 * @author gian
 *
 */
public interface IRestauranteDao extends CrudRepository<Restaurante, Long> {
	
	public List<Restaurante> findByMunicipio(Municipio municipio);

}
