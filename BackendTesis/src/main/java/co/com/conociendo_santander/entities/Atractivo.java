/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "atractivos")
public class Atractivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_atractivo")
	private Long idAtractivo;

	@Column(name = "nombre_atractivo")
	private String nombre;

	@Column(name = "longitud_atractivo")
	private double longitud;

	@Column(name = "latitud_atractivo")
	private double latitud;

	@Column(name = "descripcion_atractivo")
	private String descripcion;

	@Column(name = "id_instagram")
	private int idInstagram;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_municipio")
	private Municipio municipio;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_ruta")
	private Ruta ruta;

	/**
	 * @return the idAtractivo
	 */
	public Long getIdAtractivo() {
		return idAtractivo;
	}

	/**
	 * @param idAtractivo the idAtractivo to set
	 */
	public void setIdAtractivo(Long idAtractivo) {
		this.idAtractivo = idAtractivo;
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
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
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
	 * @return the idInstagram
	 */
	public int getIdInstagram() {
		return idInstagram;
	}

	/**
	 * @param idInstagram the idInstagram to set
	 */
	public void setIdInstagram(int idInstagram) {
		this.idInstagram = idInstagram;
	}

	/**
	 * @return the municipio
	 */
	public Municipio getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the ruta
	 */
	public Ruta getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

}
