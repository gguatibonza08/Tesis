/**
 * 
 */
package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IFotoDao extends CrudRepository<Foto, Long> {

	public List<Foto> findByMunicipioOrderByMunicipioAsc(Municipio municipio);

	public List<Foto> findByUsuarioOrderByMunicipioAsc(Usuario usuario);

	public List<Foto> findByUsuarioAndMunicipioOrderByMunicipioAsc(Usuario usuario, Municipio municipio);

}
