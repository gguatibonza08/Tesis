/**
 * 
 */
package co.com.conociendo_santander.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Departamento;

/**
 * @author gian
 *
 */
public interface IDepartamentoDao extends CrudRepository<Departamento, Long> {

}
