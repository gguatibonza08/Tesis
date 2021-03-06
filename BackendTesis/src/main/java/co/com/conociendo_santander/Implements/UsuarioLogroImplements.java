/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IUsuarioLogroDao;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioLogro;
import co.com.conociendo_santander.services.IUsuarioLogroService;

/**
 * @author gian
 *
 */
@Service
public class UsuarioLogroImplements implements IUsuarioLogroService {

	@Autowired
	private IUsuarioLogroDao usuarioLogroDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IUsuarioLogroService#findAll()
	 */
	@Override
	public List<UsuarioLogro> findAll() {
		// TODO Auto-generated method stub
		return (List<UsuarioLogro>) usuarioLogroDao.findAll();
	}

	@Override
	public UsuarioLogro findById(Long id) {
		return usuarioLogroDao.findById(id).get();
	}

	@Override
	public boolean existById(Long id) {
		return usuarioLogroDao.existsById(id);
	}

	@Override
	public List<UsuarioLogro> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioLogroDao.findByUsuario(usuario);
	}

	@Override
	public void save(UsuarioLogro usuarioLogro) {
		// TODO Auto-generated method stub
		usuarioLogroDao.save(usuarioLogro);
	}

}
