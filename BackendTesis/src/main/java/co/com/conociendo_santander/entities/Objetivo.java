/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "objetivos")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idObjetivo")
public class Objetivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_objetivo")
	private Long idObjetivo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@JsonBackReference
	@OneToMany(mappedBy = "objetivo")
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
