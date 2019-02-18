/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Foto;

/**
 * @author gian
 *
 */
public interface IFotoDao extends CrudRepository<Foto, Long> {

}
