/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface IObjetivoDao extends CrudRepository<Objetivo, Long> {

}
