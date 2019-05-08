/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios_logros")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsuarioLogro")
public class UsuarioLogro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario_logro")
	private Long idUsuarioLogro;

	@Column(name = "estado")
	private int estado;

	@JsonIgnore
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "logro")
	private Logro logro;

	/**
	 * 
	 */
	public UsuarioLogro() {
		super();
	}

	/**
	 * @param usuario
	 * @param logro
	 */
	public UsuarioLogro(Usuario usuario, Logro logro) {
		super();
		this.usuario = usuario;
		this.logro = logro;
		this.estado = 1;
	}

	/**
	 * @return the idUsuarioLogro
	 */
	public Long getIdUsuarioLogro() {
		return idUsuarioLogro;
	}

	/**
	 * @param idUsuarioLogro the idUsuarioLogro to set
	 */
	public void setIdUsuarioLogro(Long idUsuarioLogro) {
		this.idUsuarioLogro = idUsuarioLogro;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the logro
	 */
	public Logro getLogro() {
		return logro;
	}

	/**
	 * @param logro the logro to set
	 */
	public void setLogro(Logro logro) {
		this.logro = logro;
	}

}
