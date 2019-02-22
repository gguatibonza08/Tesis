/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IMunicipioService {

	public List<Municipio> findAll();

	public boolean existId(Long id);

	public Municipio findById(Long id);

	public List<Municipio> findByDepartamento(Departamento departamento);
}
