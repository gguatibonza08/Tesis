/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;

	@Column(name = "nombre_usuario")
	private String nombre;

	@Column(name = "apellido_usuario")
	private String apellido;

	@Column(name = "correo_usuario")
	private String correo;

	@Column(name = "contrasena_usuario")
	private String contrasena;

	@Column(name = "apodo_usuario")
	private String apodo;

	@Column(name = "telefono_usuario")
	private String telefono;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_avatar")
	private Avatar avatar;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Foto> fotos;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsuarioLogro> logrosDelUsuario;

	/**
	 * @param fotos
	 * @param logrosDelUsuario
	 */
	public Usuario() {
		super();
		this.fotos = new ArrayList<Foto>();
		this.logrosDelUsuario = new ArrayList<UsuarioLogro>();
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
	 * @return the avatar
	 */
	public Avatar getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
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

}
