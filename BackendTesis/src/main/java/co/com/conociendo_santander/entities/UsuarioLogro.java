/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios_logros")
public class UsuarioLogro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario_logro")
	private Long idUsuarioLogro;

	@Column(name = "estado_usuario_logro")
	private int estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_logro")
	private Logro logro;

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
