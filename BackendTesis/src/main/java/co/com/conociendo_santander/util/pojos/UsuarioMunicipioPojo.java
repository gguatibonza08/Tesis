package co.com.conociendo_santander.util.pojos;

public class UsuarioMunicipioPojo {

	private Long idUsuario;
	private Long idMunicipio;

	/**
	 * 
	 */
	public UsuarioMunicipioPojo() {
		super();
	}

	/**
	 * @param idUsuario
	 * @param idMunicipio
	 */
	public UsuarioMunicipioPojo(Long idUsuario, Long idMunicipio) {
		super();
		this.idUsuario = idUsuario;
		this.idMunicipio = idMunicipio;
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

}
