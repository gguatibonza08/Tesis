/**
 * 
 */
package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

/**
 * @author gian
 *
 */
public class MunicipioVisitados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String foto;

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param foto
	 */
	public MunicipioVisitados(String nombre, String foto) {
		super();
		this.nombre = nombre;
		this.foto = foto;
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

}
