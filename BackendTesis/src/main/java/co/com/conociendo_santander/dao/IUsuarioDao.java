/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
