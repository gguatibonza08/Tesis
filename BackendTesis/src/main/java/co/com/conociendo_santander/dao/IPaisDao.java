/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Pais;

/**
 * @author gian
 *
 */
public interface IPaisDao extends CrudRepository<Pais, Long> {

}
