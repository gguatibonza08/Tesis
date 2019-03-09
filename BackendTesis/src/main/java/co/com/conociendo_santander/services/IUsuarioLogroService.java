/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;

/**
 * @author gian
 *
 */
public interface IUsuarioLogroService {

	public List<UsuarioLogro> findAll();
	
	public UsuarioLogro findById(Long id);
	
	public boolean existById(Long id);
	
	public List<UsuarioLogro> findByUsuario(Usuario usuario);
	
	
}
