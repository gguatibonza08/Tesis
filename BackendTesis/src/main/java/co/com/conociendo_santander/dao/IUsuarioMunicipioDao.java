/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioMunicipio;

/**
 * @author gian
 *
 */
public interface IUsuarioMunicipioDao extends CrudRepository<UsuarioMunicipio, Long> {

	public UsuarioMunicipio findByMunicipio(Municipio municipio);

	public List<UsuarioMunicipio> findByUsuario(Usuario usuario);
}
