/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;

/**
 * @author gian
 *
 */
public interface IUsuarioLogroDao extends CrudRepository<UsuarioLogro, Long> {

	public List<UsuarioLogro> findByUsuario(Usuario usuario);
}
