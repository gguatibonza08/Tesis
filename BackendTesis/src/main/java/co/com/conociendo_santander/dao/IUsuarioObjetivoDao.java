package co.com.conociendo_santander.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioObjetivo;

public interface IUsuarioObjetivoDao extends CrudRepository<UsuarioObjetivo, Long> {

	public List<UsuarioObjetivo> findByUsuario(Usuario usuario);
	
	public UsuarioObjetivo findByUsuarioAndObjetivo(Usuario usuario, Objetivo objetivo);
}
