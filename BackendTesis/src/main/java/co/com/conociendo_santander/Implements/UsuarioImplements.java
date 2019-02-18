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

}
