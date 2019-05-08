package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Usuario;
import co.com.conociendo_santander.entities.UsuarioMunicipio;

public interface IUsuarioMunicipioService {

	public List<UsuarioMunicipio> findAll();

	public void save(UsuarioMunicipio usuarioMunicipio);

	public boolean findByMunicipio(Municipio municipio);

	public List<UsuarioMunicipio> findByUsuario(Usuario usuario);
}
