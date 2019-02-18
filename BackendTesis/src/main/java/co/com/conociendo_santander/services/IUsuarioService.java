/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IUsuarioService {

	public List<Usuario> findAll();
}
