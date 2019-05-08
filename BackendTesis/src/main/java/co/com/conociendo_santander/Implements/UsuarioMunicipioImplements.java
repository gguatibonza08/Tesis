package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IUsuarioMunicipioDao;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioMunicipio;
import co.com.conociendo_santander.services.IUsuarioMunicipioService;

@Service
public class UsuarioMunicipioImplements implements IUsuarioMunicipioService {

	@Autowired
	private IUsuarioMunicipioDao usuarioMunicipioDao;

	@Override
	public List<UsuarioMunicipio> findAll() {
		// TODO Auto-generated method stub
		return (List<UsuarioMunicipio>) usuarioMunicipioDao.findAll();
	}

	@Override
	public void save(UsuarioMunicipio usuarioMunicipio) {
		// TODO Auto-generated method stub
		usuarioMunicipioDao.save(usuarioMunicipio);

	}

	@Override
	public boolean findByMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		UsuarioMunicipio result = usuarioMunicipioDao.findByMunicipio(municipio);
		if (result != null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public List<UsuarioMunicipio> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioMunicipioDao.findByUsuario(usuario);
	}

}
