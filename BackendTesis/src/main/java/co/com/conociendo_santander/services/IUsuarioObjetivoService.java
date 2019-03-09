package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioObjetivo;

public interface IUsuarioObjetivoService {
	
	public List<UsuarioObjetivo> findAll();
	
	public void save (UsuarioObjetivo usuarioObjetivo);
	
	public List<UsuarioObjetivo> findByUsuario(Usuario usuario);

	public UsuarioObjetivo findByUsuarioAndObjetivo(Usuario usuario, Objetivo objetivo);
}
