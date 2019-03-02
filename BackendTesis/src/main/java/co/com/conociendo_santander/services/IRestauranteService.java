/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Restaurante;

/**
 * @author gian
 *
 */
public interface IRestauranteService {

	public List<Restaurante> findAll();

	public List<Restaurante> findByMunicipio(Municipio municipio);
}
