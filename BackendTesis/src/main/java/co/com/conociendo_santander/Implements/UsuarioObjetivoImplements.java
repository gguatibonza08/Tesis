package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IUsuarioObjetivoDao;
import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioObjetivo;
import co.com.conociendo_santander.services.IUsuarioObjetivoService;

@Service
public class UsuarioObjetivoImplements implements IUsuarioObjetivoService {

	@Autowired
	private IUsuarioObjetivoDao usuarioObjetivoDao;

	@Override
	public List<UsuarioObjetivo> findAll() {
		// TODO Auto-generated method stub
		return (List<UsuarioObjetivo>) usuarioObjetivoDao.findAll();
	}

	@Override
	public List<UsuarioObjetivo> findByUsuario(Usuario usuario) {
		return usuarioObjetivoDao.findByUsuario(usuario);
	}

	@Override
	public UsuarioObjetivo findByUsuarioAndObjetivo(Usuario usuario, Objetivo objetivo) {
		return usuarioObjetivoDao.findByUsuarioAndObjetivo(usuario, objetivo);
	}

	@Override
	public void save(UsuarioObjetivo usuarioObjetivo) {
		usuarioObjetivoDao.save(usuarioObjetivo);
	}
}
