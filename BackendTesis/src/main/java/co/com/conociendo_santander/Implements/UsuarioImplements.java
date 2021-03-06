/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IUsuarioDao;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.services.IUsuarioService;

/**
 * @author gian
 *
 */
@Service
public class UsuarioImplements implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IUsuarioService#findAll()
	 */
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.existsById(id);
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).get();
	}

	@Override
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}

	@Override
	public boolean findByCorreoOrApodo(String correo, String apodo) {
		// TODO Auto-generated method stub

		Usuario user = usuarioDao.findByCorreoOrApodo(correo, apodo);

		if (user == null) {
			return true;
		} else {
			System.out.println(user.getNombre());
			return false;
		}

	}

	@Override
	public Usuario findByCorreo(String correo) {
		Usuario usuario = usuarioDao.findByCorreo(correo);
		if (usuario == null) {
			return null;
		} else {
			return usuario;
		}
	}

}
