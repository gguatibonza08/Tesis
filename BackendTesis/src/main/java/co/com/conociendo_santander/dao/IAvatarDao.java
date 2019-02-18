/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Avatar;

/**
 * @author gian
 *
 */
public interface IAvatarDao extends CrudRepository<Avatar, Long> {

}
