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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "fotos")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idFoto")
public class Foto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_foto")
	private Long idFoto;

	@Column(name = "url")
	private String url;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "municipio")
	private Municipio municipio;

	/**
	 * @return the idFoto
	 */
	public Long getIdFoto() {
		return idFoto;
	}

	/**
	 * @param idFoto the idFoto to set
	 */
	public void setIdFoto(Long idFoto) {
		this.idFoto = idFoto;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the municipio
	 */
	public Municipio getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}
