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

	public Usuario findById(Long id);

	public boolean existId(Long id);
	
	public void save(Usuario usuario);
	
	public void delete(Long id);
	
	public boolean findByCorreoOrApodo(String correo, String apodo);
}
