/**
 * 
 */
package co.com.conociendo_santander.util.responses;

/**
 * @author gian
 *
 */
public class ObjetivoResponse {
	private Long idObjetivo;
	private String nombre;
	private String descripcion;
	private boolean completado;

	/**
	 * @param idObjetivo
	 * @param nombre
	 * @param descripcion
	 * @param completado
	 */
	public ObjetivoResponse(Long idObjetivo, String nombre, String descripcion) {
		super();
		this.idObjetivo = idObjetivo;
		this.nombre = nombre;
		this.descripcion = descripcion;

	}

	/**
	 * 
	 */
	public ObjetivoResponse() {
		super();
	}

	/**
	 * @return the idObjetivo
	 */
	public Long getIdObjetivo() {
		return idObjetivo;
	}

	/**
	 * @param idObjetivo the idObjetivo to set
	 */
	public void setIdObjetivo(Long idObjetivo) {
		this.idObjetivo = idObjetivo;
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
