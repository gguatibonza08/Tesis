/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Alojamiento;

/**
 * @author gian
 *
 */
public interface IAlojamientoDao extends CrudRepository<Alojamiento, Long> {

}
