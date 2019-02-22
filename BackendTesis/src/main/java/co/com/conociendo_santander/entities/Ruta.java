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
@Table(name = "rutas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idRuta")
public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ruta")
	private Long idRuta;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@JsonBackReference
	@OneToMany(mappedBy = "ruta")
	private List<Atractivo> atractivos;

	/**
	 * @param atractivos
	 */
	public Ruta() {
		this.atractivos = new ArrayList<Atractivo>();
	}

	/**
	 * @return the idRuta
	 */
	public Long getIdRuta() {
		return idRuta;
	}

	/**
	 * @param idRuta the idRuta to set
	 */
	public void setIdRuta(Long idRuta) {
		this.idRuta = idRuta;
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
	 * @return the atractivos
	 */
	public List<Atractivo> getAtractivos() {
		return atractivos;
	}

	/**
	 * @param atractivos the atractivos to set
	 */
	public void setAtractivos(List<Atractivo> atractivos) {
		this.atractivos = atractivos;
	}

}
