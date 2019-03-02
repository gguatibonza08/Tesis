/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Logro;

/**
 * @author gian
 *
 */
public interface ILogroService {

	public List<Logro> findAll();

	public Logro findById(Long id);

	public boolean existId(Long id);

}
