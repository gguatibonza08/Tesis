/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IRutaService {

	public List<Ruta> findAll();

	public boolean existId(Long id);

	public Ruta findById(Long id);

}
