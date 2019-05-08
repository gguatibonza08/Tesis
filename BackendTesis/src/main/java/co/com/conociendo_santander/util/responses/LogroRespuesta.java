package co.com.conociendo_santander.util.responses;

public class LogroRespuesta {

	private Long idLogro;

	private String nombre;

	private String descripcion;

	private String foto;

	private boolean completado;

	/**
	 * @param idLogro
	 * @param nombre
	 * @param descripcion
	 * @param foto
	 */
	public LogroRespuesta(Long idLogro, String nombre, String descripcion) {
		super();
		this.idLogro = idLogro;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return the idLogro
	 */
	public Long getIdLogro() {
		return idLogro;
	}

	/**
	 * @param idLogro the idLogro to set
	 */
	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the completado
	 */
	public boolean isCompletado() {
		return completado;
	}

	/**
	 * @param completado the completado to set
	 */
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

}
