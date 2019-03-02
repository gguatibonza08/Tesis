/**
 * 
 */
package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

/**
 * @author gian
 *
 */
public class MunicipioSimple implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String nombre;
	private String descripcion;
	private String foto;

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param foto
	 */
	public MunicipioSimple(Long id, String nombre, String descripcion, String foto) {
		super();
		Id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
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

}
