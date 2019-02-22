/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IMunicipioDao extends CrudRepository<Municipio, Long> {

	public List<Municipio> findByDepartamento(Departamento departamento);



}
