/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IFotoDao;
import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.services.IFotoService;

/**
 * @author gian
 *
 */
@Service
public class FotoImplements implements IFotoService {

	@Autowired
	private IFotoDao fotoDao;

	@Override
	public List<Foto> findByMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		return fotoDao.findByMunicipioOrderByMunicipioAsc(municipio);
	}

	@Override
	public List<Foto> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return fotoDao.findByUsuarioOrderByMunicipioAsc(usuario);
	}

	@Override
	public List<Foto> findByUsuarioAndMunicipio(Usuario usuario, Municipio municipio) {
		// TODO Auto-generated method stub
		return fotoDao.findByUsuarioAndMunicipioOrderByMunicipioAsc(usuario, municipio);
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return fotoDao.existsById(id);
	}

	@Override
	public void save(Foto foto) {
		// TODO Auto-generated method stub
		fotoDao.save(foto);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

		fotoDao.deleteById(id);

	}

}
