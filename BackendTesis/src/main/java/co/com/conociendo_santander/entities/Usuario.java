/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo", unique = true)
	private String correo;

	@JsonIgnore
	@Column(name = "contrasena")
	private String contrasena;

	@Column(name = "apodo", unique = true)
	private String apodo;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "foto")
	private String foto;

	@JsonBackReference
	@OneToMany(mappedBy = "usuario")
	private List<Foto> fotos;

	@JsonBackReference
	@OneToMany(mappedBy = "usuario")
	private List<UsuarioLogro> logrosDelUsuario;

	@JsonBackReference
	@OneToMany(mappedBy = "usuario")
	private List<UsuarioMunicipio> usuariosMunicipios;

	@JsonBackReference
	@OneToMany(mappedBy = "usuario")
	private List<UsuarioObjetivo> objetivosDelUsuario;

	/**
	 * @param fotos
	 * @param logrosDelUsuario
	 */
	public Usuario() {
		this.usuariosMunicipios = new ArrayList<UsuarioMunicipio>();
		this.fotos = new ArrayList<Foto>();
		this.logrosDelUsuario = new ArrayList<UsuarioLogro>();
		this.objetivosDelUsuario = new ArrayList<UsuarioObjetivo>();
	}

	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return the apodo
	 */
	public String getApodo() {
		return apodo;
	}

	/**
	 * @param apodo the apodo to set
	 */
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fotos
	 */
	public List<Foto> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	/**
	 * @return the logrosDelUsuario
	 */
	public List<UsuarioLogro> getLogrosDelUsuario() {
		return logrosDelUsuario;
	}

	/**
	 * @param logrosDelUsuario the logrosDelUsuario to set
	 */
	public void setLogrosDelUsuario(List<UsuarioLogro> logrosDelUsuario) {
		this.logrosDelUsuario = logrosDelUsuario;
	}

	/**
	 * @return the objetivosDelUsuario
	 */
	public List<UsuarioObjetivo> getObjetivosDelUsuario() {
		return objetivosDelUsuario;
	}

	/**
	 * @param objetivosDelUsuario the objetivosDelUsuario to set
	 */
	public void setObjetivosDelUsuario(List<UsuarioObjetivo> objetivosDelUsuario) {
		this.objetivosDelUsuario = objetivosDelUsuario;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return the usuariosMunicipios
	 */
	public List<UsuarioMunicipio> getUsuariosMunicipios() {
		return usuariosMunicipios;
	}

	/**
	 * @param usuariosMunicipios the usuariosMunicipios to set
	 */
	public void setUsuariosMunicipios(List<UsuarioMunicipio> usuariosMunicipios) {
		this.usuariosMunicipios = usuariosMunicipios;
	}

}
