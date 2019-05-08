/**
 * 
 */
package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

/**
 * @author gian
 *
 */
public class FotoRespuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String url;
	private String nombre;
	private String apodo;
	private String fotoUsuario;
	private long idMunicipio;
	private String municipio;

	/**
	 * @param id
	 * @param url
	 * @param nombre
	 * @param apodo
	 * @param fotoUsuario
	 * @param idMunicipio
	 * @param municipio
	 */
	public FotoRespuesta(Long id, String url, String nombre, String apodo, String fotoUsuario, long idMunicipio,
			String municipio) {
		super();
		this.id = id;
		this.url = url;
		this.nombre = nombre;
		this.apodo = apodo;
		this.fotoUsuario = fotoUsuario;
		this.idMunicipio = idMunicipio;
		this.municipio = municipio;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the avatar
	 */
	public String getfotoUsuario() {
		return fotoUsuario;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setfotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	/**
	 * @return the idMunicipio
	 */
	public long getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

}
