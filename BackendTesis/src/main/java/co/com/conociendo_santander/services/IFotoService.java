/**
 * 
 */
package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IFotoService {

	public boolean existId(Long id);

	public List<Foto> findByMunicipio(Municipio municipio);

	public List<Foto> findByUsuario(Usuario usuario);

	public List<Foto> findByUsuarioAndMunicipio(Usuario usuario, Municipio municipio);

	public void save(Foto foto);

	public void delete(Long id);
}
