/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "avatares")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idAvatar")
public class Avatar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_avatar")
	private Long idAvatar;

	@Column(name = "nombre")
	private String nombreAvatar;

	@Column(name = "url")
	private String urlAvatar;

	@JsonBackReference
	@OneToMany(mappedBy = "avatar")
	private List<Usuario> usuarios;

	/**
	 * @return the idAvatar
	 */
	public Long getIdAvatar() {
		return idAvatar;
	}

	/**
	 * @param idAvatar the idAvatar to set
	 */
	public void setIdAvatar(Long idAvatar) {
		this.idAvatar = idAvatar;
	}

	/**
	 * @return the nombreAvatar
	 */
	public String getNombreAvatar() {
		return nombreAvatar;
	}

	/**
	 * @param nombreAvatar the nombreAvatar to set
	 */
	public void setNombreAvatar(String nombreAvatar) {
		this.nombreAvatar = nombreAvatar;
	}

	/**
	 * @return the urlAvatar
	 */
	public String getUrlAvatar() {
		return urlAvatar;
	}

	/**
	 * @param urlAvatar the urlAvatar to set
	 */
	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}

	/**
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
