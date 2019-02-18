/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IMunicipioDao extends CrudRepository<Municipio, Long> {

}
