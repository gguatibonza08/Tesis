/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "objetivos")
public class Objetivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_objetivo")
	private Long idObjetivo;

	@Column(name = "nombre_objetivo")
	private String nombre;

	@Column(name = "descripcion_objetivo")
	private String descripcion;

	@OneToMany(mappedBy = "objetivo", fetch = FetchType.LAZY)
	private List<LogroObjetivo> logroDelObjetivo;

	/**
	 * @param logroDelObjetivo
	 */
	public Objetivo() {
		this.logroDelObjetivo = new ArrayList<LogroObjetivo>();
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
	 * @return the logroDelObjetivo
	 */
	public List<LogroObjetivo> getLogroDelObjetivo() {
		return logroDelObjetivo;
	}

	/**
	 * @param logroDelObjetivo the logroDelObjetivo to set
	 */
	public void setLogroDelObjetivo(List<LogroObjetivo> logroDelObjetivo) {
		this.logroDelObjetivo = logroDelObjetivo;
	}

}
