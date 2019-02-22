/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Avatar;

/**
 * @author gian
 *
 */
public interface IAvatarService {

	public List<Avatar> findAll();

	public Avatar findById(Long id);
	
	public boolean existById(Long id);

}
