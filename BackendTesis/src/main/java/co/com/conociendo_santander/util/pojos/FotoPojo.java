/**
 * 
 */
package co.com.conociendo_santander.util.pojos;

/**
 * @author gian
 *
 */
public class FotoPojo {

	private Long idUsuario;
	private Long idMunicipio;
	private String url;

	/**
	 * @param idUsuario
	 * @param idMunicipio
	 * @param url
	 */
	public FotoPojo(Long idUsuario, Long idMunicipio, String url) {
		super();
		this.idUsuario = idUsuario;
		this.idMunicipio = idMunicipio;
		this.url = url;
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
	 * @return the idMunicipio
	 */
	public Long getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
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

}
